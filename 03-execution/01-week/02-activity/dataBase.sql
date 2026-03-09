-- Data base of shopping car 
-- The tables that i use to this software are: 
-- (User, Product, Car,)

CREATE TABLE users (
    Id INT PRIMARY KEY,
    Id_Cart INT,
    Name VARCHAR(50),
    Age INT,
    FOREIGN KEY (Id_Cart) REFERENCES Cart(Id)
);

CREATE TABLE Product (
    Id INT PRIMARY KEY,
    Name VARCHAR(50),
    Price DECIMAL(10,2)
);

CREATE TABLE Cart (
    Id int PRIMARY KEY,
    Id_Product INT,
    SubTotal DECIMAL(10,2),
    FOREIGN KEY (Id_Product) REFERENCES Product(Id)
);

CREATE TABLE Sale(
    Id INT PRIMARY KEY,
    Id_User INT,
    Address VARCHAR(60),
    MethodPay VARCHAR(40),
    TotaltyPay DECIMAL(10,2),
    FOREIGN KEY (Id_User) REFERENCES users(Id)
);

