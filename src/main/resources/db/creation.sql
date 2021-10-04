create database if not exists laba_example;

use laba_example;

create table if not exists Users(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL,
    age INT NOT NULL
);

insert into Users (name, age)
values
 ('Alex', 17),
 ('John', 19),
 ('Jack', 23);

create table if not exists Cars(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    model_name VARCHAR(45) NOT NULL,
    number VARCHAR(45) NOT NULL,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES Users(id)
        ON DELETE CASCADE
        ON UPDATE NO ACTION
);

insert into Cars (model_name, number, user_id)
values
('BMW', '12-43', 1),
('Lada', '25-13', 1),
('Renault', '17-15', 2);

create table Car_repair_services(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45) NOT NULL
);

insert into Car_repair_services(name)
values
('Bosh'),
('CTO'),
('Lada');

create table if not exists Orders(
	id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    price DECIMAL(10,2) NOT NULL,
    car_id BIGINT NOT NULL,
    car_service_id BIGINT NOT NULL,
    FOREIGN KEY (car_id) REFERENCES Cars(id)
        ON DELETE CASCADE
        ON UPDATE NO ACTION,
    FOREIGN KEY (car_service_id) REFERENCES Car_repair_services(id)
        ON DELETE CASCADE
        ON UPDATE NO ACTION
);

insert into Orders (price, car_id, car_service_id)
values
(700, 1, 2),
(500, 1, 2),
(400, 2, 1),
(200, 3, 3),
(100, 3, 2);