# Day03

# Spring Boot REST API

## Project Overview
This is a simple Spring Boot REST API for managing student information, providing endpoints to retrieve student details based on various criteria.

## Project Structure
- `AppController.java`: Main REST controller with endpoints for student operations
- `Student.java`: Model class representing student attributes

## Prerequisites
- Java 8 or higher
- Spring Boot
- Maven or Gradle

## Dependencies
- Spring Web
- Java Utilities

## Endpoints

### 1. Age Endpoint
- **URL:** `/student/detail/{ag}`
- **Method:** GET
- **Description:** Returns a message with the provided age
- **Example:** `/student/detail/30` returns "My age is 30"
    ## output

     ![four](/outputs/4.PNG)

### 2. Age and Name Endpoints
- **URL:** `/student/detail/{nm},{ag}`
- **Method:** GET
- **Description:** Returns a message with the provided age
- **Example:** `/student/detail/Alice,12` returns "Name is Alice Age : 12"
    ## output

     
![three](/outputs/3.PNG)
      

### 3. Get All Students
- **URL:** `/student/info`
- **Method:** GET
- **Description:** Returns a list of all predefined students
    ## output

![one](/outputs/1.PNG)

### 4. Get Student by Registration Number
- **URL:** `/students/id/{id}`
- **Method:** GET
- **Description:** Returns a specific student by their registration number
- **Example:** `/students/id/743`
     ## output

![two](/outputs/2.PNG) 
    
## Student Model
The `Student` class has the following attributes:
- `regNo`: Registration Number (String)
- `name`: Student Name (String)
- `age`: Student Age (Integer)
- `course`: Student's Course (String)
- `gpa`: Student's Grade Point Average (Double)


## Running the Application
1. Ensure you have Java and Spring Boot installed
2. Clone the repository
3. Build the project using Maven or Gradle
4. Run the Spring Boot application
5. Access endpoints via `http://localhost:8080/student/...`

## Potential Improvements
- Add error handling
- Implement database persistence
- Add POST, PUT, and DELETE endpoints
- Implement more advanced filtering and sorting

