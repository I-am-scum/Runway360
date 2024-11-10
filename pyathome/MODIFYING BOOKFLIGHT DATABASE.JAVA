public void bookFlight() {
    System.out.print("Enter Flight Number: ");
    String flightNumber = scanner.nextLine();
    Flight flight = findFlight(flightNumber);

    if (flight != null) {
        flight.bookSeat(conn);  // Pass the database connection to update available seats
    } else {
        System.out.println("Flight not found.");
    }
}