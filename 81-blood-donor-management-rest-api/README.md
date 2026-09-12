# Blood Donor Management System – CRUD REST API

## 🎯 Objective

Develop a Spring Boot REST application to manage blood donor records.

Implement complete **CRUD operations** and test every REST endpoint using Postman.

---

## 🛠️ Technologies

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- REST API
- Maven
- Database
- Postman

---

## 🩸 Entity: BloodDonor

The BloodDonor entity contains the following fields:

| Field | Data Type |
|-------|-----------|
| donorId | Long |
| donorName | String |
| bloodGroup | String |
| age | Integer |
| city | String |
| mobileNumber | String |

---

## 🔗 REST API Endpoints

| URL | Method | Description |
|-----|--------|-------------|
| `/donors` | POST | Register Donor |
| `/donors` | GET | Get All Donors |
| `/donors/{id}` | GET | Get Donor By ID |
| `/donors/{id}` | PUT | Update Donor |
| `/donors/{id}` | DELETE | Delete Donor |

---

## 📌 Required Classes / Interfaces

### Entity

```text
BloodDonor