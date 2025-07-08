package Hotel_Room_Booking_System;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            HotelDAO dao = new HotelDAO();

            while (true) {
                System.out.println("\n======== Hotel Room Booking Management ========");
                System.out.println("1. Add New Customer");
                System.out.println("2. Add Room");
                System.out.println("3. Book Room");
                System.out.println("4. View All Bookings");
                System.out.println("5. Cancel Booking");
                System.out.println("6. View Available Rooms");
                System.out.println("7. Exit");
                System.out.print("Choose an option: ");

                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    switch (choice) {
                        case 1:
                            addCustomer(dao, scanner);
                            break;
                        case 2:
                            addRoom(dao, scanner);
                            break;
                        case 3:
                            bookRoom(dao, scanner, dateFormatter);
                            break;
                        case 4:
                            viewAllBookings(dao);
                            break;
                        case 5:
                            cancelBooking(dao, scanner);
                            break;
                        case 6:
                            viewAvailableRooms(dao);
                            break;
                        case 7:
                            System.out.println("Goodbye!");
                            return;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                } catch (InputMismatchException e) {
                    System.err.println("Please enter a valid number.");
                    scanner.nextLine(); // Clear invalid input
                }
            }
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void addCustomer(HotelDAO dao, Scanner scanner) throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter phone: ");
        String phone = scanner.nextLine().trim();
        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            System.out.println("All fields are required!");
            return;
        }

        Customer customer = new Customer(name, phone, email);
        dao.addCustomer(customer);
        System.out.println("Customer added successfully!");
    }

    private static void addRoom(HotelDAO dao, Scanner scanner) throws SQLException {
        try {
            System.out.print("Enter room ID: ");
            int roomId = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter room type: ");
            String roomType = scanner.nextLine().trim();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            if (roomType.isEmpty() || price <= 0) {
                System.out.println("Invalid room data!");
                return;
            }

            Room room = new Room(roomId, roomType, price, true);
            dao.addRoom(room);
            System.out.println("Room added successfully!");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter numbers for ID and price.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    private static void bookRoom(HotelDAO dao, Scanner scanner, DateTimeFormatter formatter) throws SQLException {
        try {
            System.out.print("Enter customer ID: ");
            int customerId = scanner.nextInt();
            System.out.print("Enter room ID: ");
            int roomId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter check-in date (YYYY-MM-DD): ");
            LocalDate checkIn = parseDate(scanner.nextLine().trim(), formatter);
            
            System.out.print("Enter check-out date (YYYY-MM-DD): ");
            LocalDate checkOut = parseDate(scanner.nextLine().trim(), formatter);

            if (checkIn.isAfter(checkOut)) {
                System.out.println("Check-out date must be after check-in date!");
                return;
            }

            Booking booking = new Booking(0, customerId, roomId, checkIn, checkOut);
            dao.bookRoom(booking);
            System.out.println("Room booked successfully!");
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter numbers for IDs.");
            scanner.nextLine(); // Clear invalid input
        } catch (DateTimeParseException e) {
            System.err.println("Invalid date format. Please use YYYY-MM-DD.");
        }
    }

    private static LocalDate parseDate(String dateStr, DateTimeFormatter formatter) throws DateTimeParseException {
        return LocalDate.parse(dateStr, formatter);
    }

    private static void viewAllBookings(HotelDAO dao) throws SQLException {
        List<String> bookings = dao.viewAllBookings();
        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
        } else {
            System.out.println("\nAll Bookings:");
            System.out.println("============================================");
            bookings.forEach(System.out::println);
        }
    }

    private static void cancelBooking(HotelDAO dao, Scanner scanner) throws SQLException {
        try {
            System.out.print("Enter booking ID to cancel: ");
            int bookingId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Are you sure you want to cancel booking " + bookingId + "? (y/n): ");
            String confirmation = scanner.nextLine().trim().toLowerCase();
            
            if (confirmation.equals("y")) {
                dao.cancelBooking(bookingId);
                System.out.println("Booking cancelled successfully!");
            } else {
                System.out.println("Cancellation aborted.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Please enter a valid booking ID number.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    private static void viewAvailableRooms(HotelDAO dao) throws SQLException {
        List<Room> rooms = dao.viewAvailableRooms();
        if (rooms.isEmpty()) {
            System.out.println("No available rooms at the moment.");
        } else {
            System.out.println("\nAvailable Rooms:");
            System.out.println("============================================");
            rooms.forEach(room -> System.out.println(
                "Room ID: " + room.getRoomId() +
                ", Type: " + room.getRoomType() +
                ", Price: " + room.getPrice()
            ));
        }
    }
}