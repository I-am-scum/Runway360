private void loadFlightsFromDatabase() {
    String query = "SELECT * FROM flights";
    try (Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(query)) {
        while (rs.next()) {
            String flightNumber = rs.getString("flight_number");
            String homeDestination = rs.getString("home_destination");
            String destination = rs.getString("destination");
            int availableSeats = rs.getInt("available_seats");
            flights.add(new Flight(flightNumber, homeDestination, destination, availableSeats));
        }
        System.out.println("Flights loaded from database.");
    } catch (SQLException e) {
        System.out.println("Error loading flights: " + e.getMessage());
    }
}

