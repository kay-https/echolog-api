# EchoLog API

A simple **Audit Log System** built with Spring Boot.

This project demonstrates how backend systems can track and store important actions performed in an API.

## Concept

In real-world systems, tracking user actions is critical for:

- debugging
- security
- compliance
- monitoring system behavior

This API records actions like:

- user creation
- payment requests

and stores them as audit logs.

## Tech Stack

- Java
- Spring Boot
- Maven

## Endpoints

### Create user

POST /user

### Request payment

POST /payment

### Get logs

GET /logs

Example response:
[
{
"action": "User created",
"timestamp": "2026-04-06T10:30:00"
},
{
"action": "Payment requested",
"timestamp": "2026-04-06T10:31:00"
}
]


## Run the project


mvn spring-boot:run


## Challenge

Part of the **#30DaysOfJavaWithKay** challenge.
