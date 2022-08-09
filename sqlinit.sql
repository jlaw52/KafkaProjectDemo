-- run following lines before starting up projects
drop database if exists inventory_db;
create database inventory_db;
drop database if exists orders_db;
create database orders_db;

-- run following lines after starting up projects
use inventory_db;
insert into inventory values(1, "Soap", 12.5, 100);
insert into inventory values(2, "Blanket", 30.0, 30);
insert into inventory values(3, "Trampoline", 274.99, 10);
insert into inventory values(4, "Soup", 0.96, 1000);
insert into inventory values(5, "Bike", 57.99, 50);
insert into inventory values(6, "Laptop", 574.99, 100);

