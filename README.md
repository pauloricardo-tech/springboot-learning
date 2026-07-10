# 🚀 Spring Boot Study API

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.x-brightgreen)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black)
![License](https://img.shields.io/badge/Status-Learning-success)

A REST API developed with **Java** and **Spring Boot** as part of my backend learning journey.

---

## 📚 About the Project

This project was created to practice and improve my knowledge of:

* REST APIs
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Validation
* Git and GitHub workflow

The application currently provides a complete **CRUD API** for managing students.

---

## 🛠️ Technologies

* ☕ Java 21
* 🍃 Spring Boot
* 🗄️ Spring Data JPA (Hibernate)
* 🐘 PostgreSQL
* 📦 Maven
* 🧪 Postman
* 🐙 Git & GitHub

---

## ✨ Features

✅ Create students

✅ Get all students

✅ Get a student by ID

✅ Update student information

✅ Delete students

✅ Input validation using Bean Validation

---

## 🏗️ Project Architecture

```text
Client (Postman)
        ↓
Controller
        ↓
Service
        ↓
Repository
        ↓
PostgreSQL
```

---

## 📌 API Endpoints

| Method | Endpoint         | Description          |
| ------ | ---------------- | -------------------- |
| GET    | `/students`      | Get all students     |
| GET    | `/students/{id}` | Get a student by ID  |
| POST   | `/students`      | Create a new student |
| PUT    | `/students/{id}` | Update a student     |
| DELETE | `/students/{id}` | Delete a student     |

---

## 📥 Example Request

### Create Student

```json
{
  "name": "Paulo",
  "age": 23
}
```

### Response

```json
{
  "id": 1,
  "name": "Paulo",
  "age": 23
}
```

---

## ✅ Validation

The API validates incoming data:

* Name cannot be empty.
* Age must be greater than zero.

Invalid requests return:

```http
400 Bad Request
```

---

## 🗄️ Database

This project uses **PostgreSQL** and **Spring Data JPA** for data persistence.

---

## 🎯 Purpose

This repository is part of my journey to become a **Java Backend Developer**, focusing on:

* Spring Boot
* REST APIs
* Databases
* Backend best practices

---

## 🚀 Future Improvements

* Custom exception handling
* DTO pattern
* Unit tests
* Integration tests
* Relationships between entities
* Spring Security and authentication

---

## 👨‍💻 Author

**Paulo Ricardo**

* GitHub: https://github.com/pauloricardo-tech
* LinkedIn: https://www.linkedin.com/in/pauloricardo-tech/