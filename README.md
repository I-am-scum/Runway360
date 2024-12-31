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
