create database laba_example;

use laba_example;

create table Users(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    age INT NOT NULL
);

insert into Users (name, age)
values
 ('Alex', 17),
 ('John', 19),
 ('Jack', 23);

create table Cars(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    modelName VARCHAR(45) NOT NULL,
    number VARCHAR(45) NOT NULL,
    userId INT,
    FOREIGN KEY (userId) REFERENCES Users(id)
);

insert into Cars (modelName, number, userId)
values
('BMW', '12-43', 1),
('Lada', '25-13', 1),
('Renault', '17-15', 2);

create table CarServices(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL
);

insert into CarServices(name)
values
('Bosh'),
('CTO'),
('Lada');

create table Orders(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    price DECIMAL(10,2) NOT NULL,
    carId INT NOT NULL,
    carServiceId INT NOT NULL,
    FOREIGN KEY (carId) REFERENCES Cars(id),
    FOREIGN KEY (carServiceId) REFERENCES CarServices(id)
);

insert into Orders (price, carId, carServiceId)
values
(700, 1, 2),
(500, 1, 2),
(400, 2, 1),
(200, 3, 3),
(100, 3, 2);