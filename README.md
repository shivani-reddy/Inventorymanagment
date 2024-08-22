Inventory Management System

Project Overview

The Inventory Management System is a RESTful web application built using Spring Boot, JPA, and MySQL. It allows users to perform CRUD (Create, Read, Update, Delete) operations on inventory items such as adding new items, retrieving a list of items, updating item details, and deleting items.

Features

Add new items to the inventory.

Retrieve details of all items or a specific item by ID.

Delete an item from the inventory.

Exception handling for errors, such as when an item does not exist.

Prerequisites
Java 8+

Maven

MySQL (with a running instance and a database configured)

Git (optional, for version control)

Setup Instructions

step 1:
git clone https://github.com/your-repo/inventory-management-system.git
cd inventory-management-system

step2:
Install MySQL if not already installed.
Create a database called inventory_db using MySQL:
CREATE DATABASE inventory_db;

step3:
Open src/main/resources/application.properties and configure your MySQL username and password:

spring.datasource.url=jdbc:mysql://localhost:3306/inventory_db
spring.datasource.username=your_username
spring.datasource.password=your_password

mvn spring-boot:run


Once the application starts, it will be running on http://localhost:8080.

API Endpoints

1. Retrieve All Items
URL: /items
Method: GET
Response:
200 OK with a list of items.
Example Response:
json
[
  {
    "id": 1,
    "name": "Laptop",
    "quantity": 10,
    "price": 1200.00
  }
]

2. Add a New Item
URL: /items
Method: POST
Request Body:
Example Request:
json

{
  "name": "Laptop",
  "quantity": 10,
  "price": 1200.00
}
Response:
201 Created with the created item details.
Example Response:
json
Copy code
{
  "id": 1,
  "name": "Laptop",
  "quantity": 10,
  "price": 1200.00
}

3. Delete an Item
URL: /items/{id}
Method: DELETE
Parameters:
id (Path Variable): The ID of the item to delete.
Response:
204 No Content if the item is successfully deleted.
404 Not Found if the item does not exist.



