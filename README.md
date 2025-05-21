# 🏨 Hostel Reservation System

Manage students and room allocations like a pro — built with Spring Boot and REST APIs.

## 🚪 Features

- 👤 Register students (name, age, gender, preference)
- 🛏️ Auto-assign rooms (Single/Double)
- 🧹 Checkout students by room number
- 📋 View all students and room data

## 🔗 REST Endpoints

| Method | Endpoint                  | Description                    |
|--------|---------------------------|--------------------------------|
| POST   | `/hostel/register`        | Register a new student         |
| POST   | `/hostel/checkout/{num}`  | Checkout student from room     |
| GET    | `/hostel/students`        | View all registered students   |
| GET    | `/hostel/rooms`           | View current room availability |

## 📦 Sample JSON (POST `/hostel/register`)

```json
{
  "name": "Riya",
  "age": 19,
  "gender": "Female",
  "preference": "Single"
}
