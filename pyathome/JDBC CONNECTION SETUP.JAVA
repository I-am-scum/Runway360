import java.sql.*;

class AirportManagementSystem {
    private List<Flight> flights;
    private Scanner scanner;
    private Connection conn;

    public AirportManagementSystem() {
        flights = new ArrayList<>();
        scanner = new Scanner(System.in);
        connectDatabase();
        loadFlightsFromDatabase();  // Load flights from the database on startup
    }

    private void connectDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/airportdb"; // Replace with your database URL
            String user = "yourusername"; // Replace with your database username
            String password = "yourpassword"; // Replace with your database password
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
