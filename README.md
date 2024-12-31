# Airport Management System
This is an Airport Management System designed to manage the operations of an airport. It helps streamline processes related to flight schedules, passenger management, baggage handling, airport staff management, and more. The system aims to provide a seamless and efficient experience for airport staff, management, and passengers.

# Key Features ✨

• Flight Management: Manage and track incoming and outgoing flights, including flight schedules, destinations, and status updates. </br>
• Passenger Management: Manage passenger details, ticket bookings, and check-in processes.</br>
• Baggage Handling: Track the baggage process, from check-in to delivery at the destination.</br>
• Staff Management: Maintain records of airport staff, including their roles, schedules, and departments. </br>
• Security Monitoring: Oversee security operations and alerts to ensure passenger and staff safety.</br>
• Reports: Generate reports on flights, passengers, baggage, and more.</br>

## User Features

- Search for available flights.
- Book and manage flight reservations.
- View flight status and updates.
- Receive booking notifications.

## Admin Features

- Manage flight schedules.
- View and manage flight bookings.
- Track and update flight status.
- Send notifications to users about booking changes.

# Technical Requirements 🛠️
● JDK 11</br>
● Apache Maven 3.8 or higher</br>
● MySQL 8.0</br>
● Spring Boot 3.4.0</br>
● IntelliJ IDEA or Eclipse IDE or VS Code</br>
● Git</br>


# Project Structure 📂
```
demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── demo/
│   │   │               ├── controller/
│   │   │               │   └── UserController.java
│   │   │               ├── model/
│   │   │               │   └── User.java
│   │   │               ├── service/
│   │   │               │   └── CustomUserDetailsService.java
│   │   │               └── DemoApplication.java
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── home.html
│   │       │   ├── login.html
│   │       │   └── signup.html
│   │       ├── application.properties
│   └── target/
│       └── classes/
├── pom.xml
```

# Dependencies 📚
```
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.1</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>demo</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <!-- Spring Boot Starter Dependencies -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

        <!-- Thymeleaf Extras for Spring Security -->
        <dependency>
            <groupId>org.thymeleaf.extras</groupId>
            <artifactId>thymeleaf-extras-springsecurity6</artifactId>
        </dependency>

        <!-- DevTools -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>

        <!-- Testing Dependencies -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
```

# Database Configuration 🗄️
### MySQL Setup
1. Create the database:
```sql
CREATE DATABASE tastenet_db;
```
2. Now Use the newly created database:
```sql
USE tastenet_db;
```

# Installation and Setup 🚀

Follow these steps to set up the project on your local machine.

### Prerequisites

1. **Install JDK 11**
   - Download and install JDK 11 from [Oracle's website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   - After installation, make sure to set up the `JAVA_HOME` environment variable and update your `PATH`.

2. **Install Maven**
   - Download Maven from [Maven's official website](https://maven.apache.org/download.cgi).
   - Follow the installation instructions to set up Maven on your system.
   - After installation, verify Maven by running:
     ```bash
     mvn -v
     ```

3. **Install MySQL 8.0**
   - Download MySQL 8.0 from the [MySQL website](https://dev.mysql.com/downloads/installer/).
   - Follow the installation instructions and make sure the MySQL server is up and running.

4. **Install your preferred IDE**
   - **IntelliJ IDEA**: Download from [IntelliJ IDEA website](https://www.jetbrains.com/idea/).
   - **Eclipse**: Download from [Eclipse website](https://www.eclipse.org/downloads/).

### Steps to Install and Run the Application

1. **Clone the repository**:
   ```bash
   git clone https://github.com/i-am-scum/runway360/demo.git

2. Configure database connection in ``\Runway360\demo\src\main\resources\application.propertie ``
```
ring.application.name=demo

spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html

)
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name?useSSL=false&serverTimezone=UTC
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver


spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialec
```
3. Build the project:
```bash
mvn clean install
```
# Running the Project ▶️
### Development
1. Run the Spring Boot application:
```
mvn spring-boot:run
```
2. Access the application at http://localhost:8080.
### Production Deployment
1. Build for production:
```bash
mvn clean package
```
2. Deploy the generated JAR/WAR file to your production server.

# Testing 🧪
● Run the tests using:
```bash
mvn test
```

#Contact 📧
gaurav - @I-am-scum<br>
Project Link - https://github.com/I-am-scum/Runway360.git

