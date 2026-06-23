# Role-Based Authorization System

A Spring Boot backend project that implements **authentication** and **role-based authorization** using **Spring Security**, **JWT**, and **MySQL**.

This project allows users to register, login, receive a JWT token, and access protected APIs based on their assigned role such as `USER`, `ADMIN`, or `MANAGER`.

---

## Project Overview

The main goal of this project is to understand how backend security works in a real Spring Boot application.

Instead of allowing every user to access every API, this project checks:

- Who the user is
- Whether the user has a valid JWT token
- What role the user has
- Whether that role is allowed to access the requested API

---

## Features

- User registration
- User login
- Password encryption using BCrypt
- JWT token generation
- JWT token validation
- Role-based API access
- Spring Security configuration
- Protected REST APIs
- MySQL database integration
- Layered architecture
- DTO-based request and response handling
- Global exception handling

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
- Postman / Swagger for API testing

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
