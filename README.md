## Item Management API :-

This is a simple Java backend application built using Spring Boot.  
It provides RESTful APIs to manage a collection of items using in-memory storage.
The project is created as part of a sample task to demonstrate basic backend development concepts.

## Technologies Used :
- Java
- Spring Boot
- Maven

## Features :
- Add a new item
- Get item details by ID
- data storage using ArrayList
- Basic input validation
- HTTP status handling

## API Endpoints :
# Add Item
POST "/items"

Request Body:
{
"name": "Harry-Potter",
"description": "Harry is described as a gifted wizard."
}

Response:
- 201 Created
- Returns the saved item with generated ID

# Get Item by ID
GET "/items/{id}"
Response:
- 200 OK if item exists
- 404 Not Found if item does not exist
- 
## How to Run the Application :
1. Clone the repository
2. Open the project in any Java IDE
3. Run the main application class
4. The application will start on port 8080
