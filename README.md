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
src/main/java
├── controller
├── service
├── repository
├── entity
├── dto
├── security
└── exception
