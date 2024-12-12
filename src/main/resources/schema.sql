-- src/main/resources/schema.sql
CREATE TABLE Employee (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    salary DECIMAL(15, 2),
    address VARCHAR(255)
);