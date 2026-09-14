# Smart Parking Slot Management System – REST API

## 🎯 Objective

Develop a Spring Boot REST API to manage parking slots.

Implement complete CRUD operations and use global exception handling with `@RestControllerAdvice`.

---

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven
- Postman

---

## 🚗 Entity: ParkingSlot

The ParkingSlot entity contains the following fields:

| Field | Data Type |
|---|---|
| slotId | Long |
| slotCode | String |
| floorNumber | Integer |
| vehicleType | String |
| hourlyRate | Double |
| available | Boolean |

---

## 🔗 REST API Endpoints

| URL | Method | Description |
|---|---|---|
| `/api/parking-slots` | POST | Create Parking Slot |
| `/api/parking-slots` | GET | Get All Parking Slots |
| `/api/parking-slots/{slotId}` | GET | Get Parking Slot By ID |
| `/api/parking-slots/{slotId}` | PUT | Update Parking Slot |
| `/api/parking-slots/{slotId}` | DELETE | Delete Parking Slot |

---

## 📌 Required Classes / Interfaces

### Entity

```text
ParkingSlot.java