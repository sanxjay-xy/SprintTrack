# 🅿️ ParkingSystem

A lightweight parking lot tracker with auto time logging, waitlist, and real-time slot status — powered by Spring Boot.

---

## 📖 Table of Contents

- [🧾 Overview](#-overview)
- [📌 Features](#-features)
- [🔧 REST Endpoints](#-rest-endpoints)
- [📥 Sample Requests](#-sample-requests)
- [💻 Prerequisites](#-prerequisites)
- [📁 How to Use This Project](#-how-to-use-this-project)
- [🔭 Next Steps](#-next-steps)

---

## 🧾 Overview

This project simulates a basic parking lot system. Vehicles are assigned slots if available, or added to a waitlist when full. Time logs are captured automatically using the system clock.

---

## 📌 Features

- 🚗 Allocate parking slots to vehicles
- 🕒 Log entry and exit times automatically
- 📥 Waitlist overflow vehicles
- 📊 View current slot and waitlist status
- 🔄 Fully in-memory system — resets on restart

---

## 🔧 REST Endpoints

| Method | Endpoint                 | Description                    |
|--------|--------------------------|--------------------------------|
| POST   | /parking/entry           | Vehicle enters the lot         |
| POST   | /parking/exit/{vehicleNo} | Vehicle exits and logs time    |
| GET    | /parking/status          | View current slot usage        |

---

## 📥 Sample Requests

### 🚗 Vehicle Entry

```http
POST /parking/entry
Content-Type: application/json

{
  "vehicleNo": "KA05AB1234"
}
```

### 🕒 Vehicle Exit

```http
POST /parking/exit/KA05AB1234
```

Response:

```
Vehicle KA05AB1234 stayed from 10:15 AM to 11:45 AM. Total: 90 mins.
Next vehicle MH12CD5678 moved from waiting list.
```

### 📊 View Parking Status

```http
GET /parking/status
```

Returns:

```json
{
  "occupiedSlots": [
    { "slot": 1, "vehicleNo": "MH12CD5678" }
  ],
  "waitingList": [
    { "vehicleNo": "DL8CAF0001" }
  ]
}
```

---

## 💻 Prerequisites

- Java 17+ and Spring Boot 3.x  
- A REST client like Postman or browser for testing  
- IDE like IntelliJ, Eclipse, or VS Code  

---

## 📁 How to Use This Project

1. Clone this repository or pull the branch that contains the project:

```bash
git clone https://github.com/sanxjay-xy/SprintTrack.git
```

2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code)

3. Make sure you have Java 17+ and Maven installed

4. Run the Spring Boot application using:

```bash
mvn spring-boot:run
```

5. Use a REST client like Postman or your browser to test the endpoints

---

## 🔭 Next Steps

You can enhance this by:
- Adding support for different vehicle types
- Setting time-based slot fees
- Enabling persistent data storage
- Adding notifications on exit or slot availability

> 🅿️ A great base to build real-world parking systems — modular, testable, and extendable.
