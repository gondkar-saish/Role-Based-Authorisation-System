# Role-Based Authorisation System

A Spring Boot backend project that implements user authentication and role-based authorisation using Spring Security and JWT.

This project allows users to register, login, receive a JWT token, and access APIs based on their assigned role such as `ADMIN` or `USER`.

---

## Features

- User registration
- User login
- JWT token generation
- JWT token validation
- Role-based API access
- Spring Security integration
- Password encryption using BCrypt
- MySQL database integration
- Layered architecture using Controller, Service, Repository, Entity, and DTO

---

## Tech Stack

- Java
- Spring Boot
- Spring Security
- JWT
- MySQL
- Spring Data JPA
- Hibernate
- Maven
- Postman / Swagger for testing

---

## Project Structure

```text
src/main/java/com/yourpackage/rolebasedauth
│
├── controller
│   ├── AuthController.java
│   ├── AdminController.java
│   └── UserController.java
│
├── service
│   ├── AuthService.java
│   ├── UserService.java
│   └── impl
│       ├── AuthServiceImpl.java
│       └── UserServiceImpl.java
│
├── repository
│   └── UserRepository.java
│
├── entity
│   ├── User.java
│   └── Role.java
│
├── dto
│   ├── RegisterRequest.java
│   ├── LoginRequest.java
│   ├── AuthResponse.java
│   └── UserResponse.java
│
├── security
│   ├── SecurityConfig.java
│   ├── JwtService.java
│   ├── JwtAuthenticationFilter.java
│   └── CustomUserDetailsService.java
│
├── exception
│   ├── ResourceNotFoundException.java
│   ├── DuplicateResourceException.java
│   └── GlobalExceptionHandler.java
│
└── RoleBasedAuthorisationSystemApplication.java


Below it, add this explanation:

```md
## Folder Responsibilities

| Folder | Purpose |
|---|---|
| `controller` | Handles incoming HTTP requests and returns API responses |
| `service` | Contains the main business logic of the application |
| `service/impl` | Contains the actual implementation of service interfaces |
| `repository` | Communicates with the database using Spring Data JPA |
| `entity` | Contains database table models such as `User` and `Role` |
| `dto` | Defines request and response objects used by APIs |
| `security` | Contains Spring Security, JWT, authentication, and authorization logic |
| `exception` | Handles custom errors and global exception responses |
