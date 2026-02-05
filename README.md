# Car-Rental-and-Sales-Management-System
This project is a Java-based system for managing car rental and sales operations. The system allows employees to:
- Add new cars for sale or rent.
- View available cars.
- Register sales and rental transactions.
- Manage customer and employee data.

## 2. System Structure

### Main Classes:
| Class | Description |
|-------|-------------|
| `Car` | Represents a general car with properties like type, model, color, and engine capacity. |
| `CarForRent` | Inherits from `Car` and adds rental price and rental status. |
| `CarForSale` | Inherits from `Car` and adds sale price and sale status. |
| `Person` | Base class for people (name, phone number, age). |
| `Customer` | Inherits from `Person` and contains lists of rented and purchased cars. |
| `Employee` | Inherits from `Person` and includes salary and number of operations. |
| `RentProcess` | Records a rental operation (customer, employee, rent date, return deadline). |
| `SaleProcess` | Records a sale operation (customer, employee, sale date). |
| `Controller` | Manages user interaction and system processes. |
| `Main` | Entry point of the program. |

## 3. How to Run the Project

### Requirements:
- Java JDK 8 or newer
- Development Environment (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Steps:
1. Open the project in your development environment.
2. Run the `Main.java` file.
3. The system will display a menu to choose different operations.

## 4. Main Functionalities

### Car Management:
- `addNewCarForSale()`: Add a new car for sale.
- `addNewCarForRent()`: Add a new car for rent.
- `displayAvilableCarsForSale()`: Display cars available for sale.
- `displayAvilableCarsForRent()`: Display cars available for rent.
- `rentCar()`: Execute a car rental operation.
- `buyCar()`: Execute a car sale operation.
- `returnRentedCar()`: Record a rented car return.

### Customer Management:
- `addNewCustomer()`: Add a new customer to the system.
- `displayCustomers()`: Show customer data.
- `deleteCustomer()`: Delete a customer.

### Employee Management:
- `addEmployee()`: Add a new employee.
- `displayEmployees()`: Display employee list.
- `removeEmployee()`: Delete an employee.
- `login()`: Employee login.
- `logout()`: Employee logout.

## 5. Usage Examples

### Employee Login:
```java
controller.login() // Requires ID and password
