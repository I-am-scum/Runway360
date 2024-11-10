CREATE DATABASE airportdb;
USE airportdb;

CREATE TABLE flights (
    flight_number VARCHAR(10) PRIMARY KEY,
    home_destination VARCHAR(50),
    destination VARCHAR(50),
    available_seats INT
);

INSERT INTO flights (flight_number, home_destination, destination, available_seats) VALUES
('AI101', 'New York', 'London', 50),
('AI102', 'New York', 'Paris', 60),
('AI103', 'Los Angeles', 'Tokyo', 100);
