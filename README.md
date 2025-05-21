# 🅿️ Parking Lot System

A smart and minimal Spring Boot parking manager with real-time slot tracking, vehicle timing, and waitlist handling — all running in-memory.

## 🚗 What It Does

- 🕒 Records entry & exit times
- 📦 Allocates available slots automatically
- 📥 Adds vehicles to waitlist when full
- 🧾 Calculates total parking duration on exit
- 📊 Shows live stats for slots, parked vehicles, and queue

---

## 🔧 REST Endpoints

| Method | Endpoint                  | Description                            |
|--------|---------------------------|----------------------------------------|
| POST   | `/parking/entry`          | Vehicle enters the lot                 |
| POST   | `/parking/exit/{vehicle}` | Vehicle exits and duration is logged   |
| GET    | `/parking/status`         | View current slot count + waitlist     |

---

## 📤 Sample JSON (POST `/parking/entry`)

```json
{
  "vehicleNo": "MH12XY7890"
}
