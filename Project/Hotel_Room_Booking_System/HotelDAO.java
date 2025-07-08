package Hotel_Room_Booking_System;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HotelDAO {
    private Connection conn;

    public HotelDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hoteldb", "root", "");
    }

    public void addCustomer(Customer customer) throws SQLException {
        String query = "INSERT INTO customers(name, phone, email) VALUES(?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, customer.getName());
            stmt.setString(2, customer.getPhone());
            stmt.setString(3, customer.getEmail());
            stmt.executeUpdate();
            
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    customer.setCustomerId(rs.getInt(1));
                }
            }
            System.out.println("Customer added successfully");
        }
    }

    public void addRoom(Room room) throws SQLException {
        String query = "INSERT INTO rooms(room_id, room_type, price, is_available) VALUES(?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, room.getRoomId());
            stmt.setString(2, room.getRoomType());
            stmt.setDouble(3, room.getPrice());
            stmt.setBoolean(4, room.isAvailable());
            stmt.executeUpdate();
            System.out.println("Room added successfully");
        }
    }

    public List<Room> viewAvailableRooms() throws SQLException {
        List<Room> availableRooms = new ArrayList<>();
        String query = "SELECT * FROM rooms WHERE is_available = TRUE";
        
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                Room room = new Room(
                    rs.getInt("room_id"),
                    rs.getString("room_type"),
                    rs.getDouble("price"),
                    rs.getBoolean("is_available")
                );
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public void bookRoom(Booking booking) throws SQLException {
        conn.setAutoCommit(false); // Start transaction
        
        try {
            // Check if room is available
            String checkQuery = "SELECT is_available FROM rooms WHERE room_id = ? FOR UPDATE";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                checkStmt.setInt(1, booking.getRoomId());
                try (ResultSet rs = checkStmt.executeQuery()) {
                    if (!rs.next() || !rs.getBoolean("is_available")) {
                        throw new SQLException("Room is not available");
                    }
                }
            }

            // Insert booking
            String insertQuery = "INSERT INTO bookings (customer_id, room_id, check_in, check_out) VALUES(?, ?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery)) {
                insertStmt.setInt(1, booking.getCustomerId());
                insertStmt.setInt(2, booking.getRoomId());
                insertStmt.setDate(3, Date.valueOf(booking.getCheckIn()));
                insertStmt.setDate(4, Date.valueOf(booking.getCheckOut()));
                insertStmt.executeUpdate();
            }

            // Update room availability
            String updateQuery = "UPDATE rooms SET is_available = FALSE WHERE room_id = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                updateStmt.setInt(1, booking.getRoomId());
                updateStmt.executeUpdate();
            }

            conn.commit();
            System.out.println("Room booked successfully");
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public void cancelBooking(int bookingId) throws SQLException {
        conn.setAutoCommit(false); // Start transaction
        
        try {
            // Get room ID from booking
            String getRoomQuery = "SELECT room_id FROM bookings WHERE booking_id = ?";
            int roomId;
            
            try (PreparedStatement getStmt = conn.prepareStatement(getRoomQuery)) {
                getStmt.setInt(1, bookingId);
                try (ResultSet rs = getStmt.executeQuery()) {
                    if (!rs.next()) {
                        throw new SQLException("Booking not found");
                    }
                    roomId = rs.getInt("room_id");
                }
            }

            // Delete booking
            String deleteQuery = "DELETE FROM bookings WHERE booking_id = ?";
            try (PreparedStatement delStmt = conn.prepareStatement(deleteQuery)) {
                delStmt.setInt(1, bookingId);
                delStmt.executeUpdate();
            }

            // Update room availability
            String updateQuery = "UPDATE rooms SET is_available = TRUE WHERE room_id = ?";
            try (PreparedStatement updateStmt = conn.prepareStatement(updateQuery)) {
                updateStmt.setInt(1, roomId);
                updateStmt.executeUpdate();
            }

            conn.commit();
            System.out.println("Booking cancelled successfully");
        } catch (SQLException e) {
            conn.rollback();
            throw e;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public List<String> viewAllBookings() throws SQLException {
        List<String> bookings = new ArrayList<>();
        String query = "SELECT b.booking_id, c.name AS customer_name, c.phone, " +
                       "r.room_id, r.room_type, b.check_in, b.check_out " +
                       "FROM bookings b " +
                       "JOIN customers c ON b.customer_id = c.customer_id " +
                       "JOIN rooms r ON b.room_id = r.room_id " +
                       "ORDER BY b.booking_id";
        
        try (PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {
            
            while (rs.next()) {
                String bookingInfo = String.format(
                    "Booking ID: %d, Customer: %s (%s), Room: %d (%s), " +
                    "Check-In: %s, Check-Out: %s",
                    rs.getInt("booking_id"),
                    rs.getString("customer_name"),
                    rs.getString("phone"),
                    rs.getInt("room_id"),
                    rs.getString("room_type"),
                    rs.getDate("check_in"),
                    rs.getDate("check_out")
                );
                bookings.add(bookingInfo);
            }
        }
        return bookings;
    }

    public void close() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }
}