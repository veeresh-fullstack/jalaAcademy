# Jala Academy Spring Boot Application

This is a sample Spring Boot application for Jala Academy, demonstrating basic CRUD operations, authentication, and MVC architecture using Java and Spring Boot.

## Features
- Employee management (CRUD)
- User login functionality
- MVC architecture with controllers, services, and repositories
- Thymeleaf templates for UI
- Static resources (images)

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Thymeleaf
- Maven

## Project Structure
```
├── src/
│   ├── main/
│   │   ├── java/com/example/jalaAcademy/
│   │   │   ├── JalaAcademyApplication.java
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites
- Java 17 or later
- Maven 3.6+

### Build and Run
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd jalaAcademy
   ```
2. Build the project:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application at `http://localhost:8080`

## Usage
- Visit `/login` to access the login page.
- Manage employees via the provided UI.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.

