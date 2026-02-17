drop database if exists hms;

create database hms;

use hms;

CREATE TABLE Hotel (
    HotelId INT PRIMARY KEY AUTO_INCREMENT,
    HotelName VARCHAR(100) NOT NULL,
    HotelType VARCHAR(50) NOT NULL,
    City VARCHAR(30) NOT NULL,
    State VARCHAR(30) NOT NULL,
    Email VARCHAR(50) NOT NULL,
    ContactNumber BIGINT NOT NULL,
    Facilities VARCHAR(100),
    Capacity INT NOT NULL,
    Address VARCHAR(100) NOT NULL
);

INSERT INTO Hotel (HotelName, HotelType, City, State, Email, ContactNumber, Facilities, Capacity, Address) VALUES
('The Taj Mahal Palace', 'Luxury', 'Mumbai', 'Maharashtra', 'taj.mumbai@gmail.com', 9166665656, 'Spa, Pool, Gym, Free Wi-Fi', 300, 'Apollo Bunder, Colaba'),
('The Oberoi', 'Luxury', 'New Delhi', 'Delhi', 'oberoi.delhi@gmail.com', 9111239360, 'Spa, Pool, Gym, Free Wi-Fi, Airport Shuttle', 250, 'Dr. Zakir Hussain Marg'),
('ITC Grand Chola', 'Luxury', 'Chennai', 'Tamil Nadu', 'itc.chennai@gmail.com', 9422239393, 'Spa, Pool, Gym, Free Wi-Fi, Restaurant', 400, 'Anna Salai, Guindy'),
('The Leela Palace', 'Luxury', 'Bengaluru', 'Karnataka', 'leela.bengaluru@gmail.com', 8044440000, 'Spa, Pool, Gym, Free Wi-Fi, Business Center', 350, 'Old Airport Road, Kodihalli'),
('Taj Falaknuma Palace', 'Heritage', 'Hyderabad', 'Telangana', 'falaknuma.hyderabad@gmail.com', 9140662332, 'Spa, Pool, Gym, Free Wi-Fi, Royal Dining', 200, 'Engine Bowli, Falaknuma');