
## Features 
- **Reservation Management**: Create, view, update, and delete flight reservations
- **Payment Processing**: Integrated payment system
- **Ticket Generation**: Automatic ticket creation
- **Responsive UI**: Thymeleaf-based web interface
- **REST API**: Full CRUD operations via API

## Steps to Run the Project

1. **Open your terminal/command prompt.**

2. **Navigate to the project directory:**

```bash
cd /path/to/your/project
```

3. **Clean the project build:**

```bash
mvn clean
```

4. **Run the Spring Boot application:**

```bash
mvn spring-boot:run
```

5. **Accessing the Application** : Web Interface - Open your browser and go to:

```bash
http://localhost:8080/reservations
```
6. **REST API Endpoints (Using Postman)**

| Method | Endpoint                                             | Description                          |
|--------|------------------------------------------------------|--------------------------------------|
| GET    | `http://localhost:8080/api/reservations`             | Get all reservations                |
| GET    | `http://localhost:8080/api/reservations/{id}`        | Get a single reservation by ID      |
| POST   | `http://localhost:8080/api/reservations`             | Create a new reservation            |
| PUT    | `http://localhost:8080/api/reservations/{id}`        | Update an existing reservation      |
| DELETE | `http://localhost:8080/api/reservations/{id}`        | Delete a reservation                |
| POST   | `http://localhost:8080/api/reservations/{id}/process-payment` | Process payment for reservation |
| POST   | `http://localhost:8080/api/reservations/{id}/issue-ticket`    | Issue ticket for reservation    |

**Note:** Replace `{id}` with the actual reservation ID in all endpoints.
