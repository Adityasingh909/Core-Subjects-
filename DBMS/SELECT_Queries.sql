CREATE DATABASE org;
use org;
CREATE TABLE workers(
    worker_id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    salary INT,
    joining_data DATETIME,
    department VARCHAR(255)
);

INSERT INTO workers(worker_id,first_name,last_name,salary,joining_data,department) values
    (001, 'Monika', 'Arora', 100000, '14-02-20 09.00.00', 'HR'),
    (002, 'Niharika', 'Verma', 80000, '14-06-11 09.00.00', 'Admin'),
    (003, 'Vishal', 'Singhal', 300000, '14-02-20 09.00.00', 'HR'),
    (004, 'Amitabh', 'Singh', 500000, '14-02-20 09.00.00', 'Admin'),
    (005, 'Vivek', 'Bhati', 500000, '14-06-11 09.00.00', 'Admin'),
    (006, 'Vipul', 'Diwan', 200000, '14-06-11 09.00.00', 'Account'),
    (007, 'Satish', 'Kumar', 75000, '14-01-20 09.00.00', 'Account'),
    (008, 'Geetika', 'Chauhan', 90000, '14-04-11 09.00.00', 'Admin')
;

SELECT * FROM workers;
SELECT first_name , salary FROM workers;

-- SELECT 22+22;
-- SELECT NOW();

SELECT first_name,salary ,department FROM workers
WHERE salary>=100000 AND department = 'HR' OR department ='Admin';

-- reducing or command
SELECT * FROM workers
WHERE department IN ('HR','Admin');

SELECT * FROM workers 
WHERE salary BETWEEN 80000 AND 100000;


SELECT * FROM workers ORDER BY salary;









