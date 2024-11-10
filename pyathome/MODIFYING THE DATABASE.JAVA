public void bookSeat(Connection conn) {
    if (availableSeats > 0) {
        availableSeats--;
        try (PreparedStatement stmt = conn.prepareStatement(
                "UPDATE flights SET available_seats = ? WHERE flight_number = ?")) {
            stmt.setInt(1, availableSeats);
            stmt.setString(2, flightnumber);
            stmt.executeUpdate();
            System.out.println("Seat booked successfully on flight " + flightnumber);
        } catch (SQLException e) {
            System.out.println("Error updating seat count: " + e.getMessage());
        }
    } else {
        System.out.println("No available seats on this flight.");
    }
}