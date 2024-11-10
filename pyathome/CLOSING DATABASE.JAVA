public void start() {
    int choice;
    do {
        displayMenu();
        choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1: displayFlights(); break;
            case 2: bookFlight(); break;
            case 3: viewAvailableSeats(); break;
            case 4:
                System.out.println("Exiting Airport Management System...");
                closeDatabase();
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }
    } while (choice != 4);
}

private void closeDatabase() {
    try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Database connection closed.");
        }
    } catch (SQLException e) {
        System.out.println("Error closing database connection: " + e.getMessage());
    }
}
