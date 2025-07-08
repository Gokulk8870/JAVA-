package Hotel_Room_Booking_System;

import java.time.LocalDate;  // Using modern date API

public class Booking {
    private int bookingId;
    private int customerId;
    private int roomId;
    private LocalDate checkIn;  // Using LocalDate instead of Date
    private LocalDate checkOut;

    public Booking(int bookingId, int customerId, int roomId, LocalDate checkIn, LocalDate checkOut) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.roomId = roomId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    // Getters and setters
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", customerId=" + customerId + 
               ", roomId=" + roomId + ", checkIn=" + checkIn + 
               ", checkOut=" + checkOut + "]";
    }
}