# Testing Java Knowledge - Employee  System

This project is a simple Employee Management System built with Spring Boot. It serves as a learning project to demonstrate knowledge of Java, Spring Boot, Security (JWT), and Docker.

## Project Content

- **Authentication & Authorization**: 
    - JWT-based stateless authentication.
    - Endpoints for `/register`, `/login`, and `/logout`.
- **Employee Management**: 
    - CRUD operations for employees (Get all, Get by ID).
    - Soft delete support.
- **Auditing**: 
    - Automatic tracking of creation and modification dates/users via `AbstractClass`.
- **Database**: 
    - PostgreSQL database.
    - Database migrations managed by Flyway.
- **Containerization**: 
    - `Dockerfile` for the application.
    - `docker-compose.yml` for easy local setup with database.

## Technologies Used

- Java 21
- Spring Boot 4.0.6
- Spring Data JPA
- Spring Security (JWT)
- Flyway (Migrations)
- PostgreSQL
- Lombok
- Docker & Docker Compose

## Getting Started

### Prerequisites

- Docker and Docker Compose installed.

### Running the Project

1. Clone the repository.
2. Run the following command in the project root:
   ```bash
   docker-compose up --build
   ```
3. The application will be available at `http://localhost:8080`.

## API Endpoints

### Authentication
- `POST /auth/register`: Register a new user.
- `POST /auth/login`: Login and receive a JWT token.
- `POST /auth/logout`: Logout (clears security context).

### Employees (Requires Authentication)
- `GET /api/employees`: Get all employees.
- `POST /api/employees/{id}`: Get employee by ID (logic uses request body for ID currently as per existing structure).

## Disclaimer

This project is strictly for **learning purposes**. It demonstrates basic architectural patterns and security implementation in Spring Boot.
