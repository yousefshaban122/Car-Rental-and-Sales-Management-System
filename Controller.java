package program;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Controller {
    Scanner input = new Scanner(System.in);
    private List<CarForSale> carsForSale;
    private List <CarForRent> carsForRent;
    private List <Employee> employees;
    private List <Customer> customers;
    private int customerId = 0;
    private int carId = 0;
    private int employeeid = 0;
    private Employee token = null;
    public Controller() {
        this.carsForSale = new ArrayList<CarForSale>();
        this.carsForRent = new ArrayList<CarForRent>();
        this.employees = new ArrayList<Employee>();
        this.customers = new ArrayList<Customer>();
        employees.add(new Employee(++employeeid, "Admin" , "01025578893" , 20 , 10000 , LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) , "12345678"));
    }
    public int checkCarForRentId(int id){
        int cnt = 0;
        for(CarForRent car: carsForRent){
            if(car.getId() == id)
                return cnt;
            cnt++;
        }
        return -1;
    }
    public int checkCarForSaleId(int id){
        int cnt = 0;
        for(CarForSale car : carsForSale){
            if(car.getId() == id)
                return cnt;
            cnt++;
        }
        return -1;
    }

    public int checkCustomerId(int id){
        int cnt = 0;
        for(Customer customer : customers){
            if(customer.getId() == id)
                return cnt;
            cnt++;
        }
        return -1;
    }
    public int checkEmployeeId(int id){
        int cnt = 0;
        for(Employee employee: employees){
            if(employee.getId() == id)
                return cnt;
            cnt++;
        }
        return -1;
    }

    // cars section
    public void addNewCarForSale(){
        try{
        System.out.println("***********************************************************************");
        int id = ++carId;
        System.out.println("Enter Car Specifications: ");
        System.out.println("vehicle type: ");
        String carType = input.next();
        System.out.println("model: ");
        String carModel = input.next();
        System.out.println("manufacturer: ");
        String manufacture = input.next();
        System.out.println("car color ");
        String color = input.next();
        System.out.println("engine capacity: ");
        int engineCapacity = input.nextInt();
        System.out.println("car price: ");
        int price = input.nextInt();
        boolean sold = false;
        carsForSale.add(new CarForSale(id,carType,carModel,manufacture,color,engineCapacity,sold,price));
        System.out.println("Car added Successfully");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }
    public void addNewCarForRent() {
        try{
        System.out.println("***********************************************************************");
        int id = ++carId;
        System.out.println("Enter Car Specifications: ");
        System.out.println("vehicle type: ");
        String carType = input.next();
        System.out.println("model: ");
        String carModel = input.next();
        System.out.println("manufacturer: ");
        String manufacture = input.next();
        System.out.println("car color ");
        String color = input.next();
        System.out.println("engine capacity: ");
        int engineCapacity = input.nextInt();
        System.out.println("car price per day: ");
        int pricePerDay = input.nextInt();
        boolean rented = false;
        carsForRent.add(new CarForRent(id, carType, carModel, manufacture, color, engineCapacity, rented, pricePerDay));
        System.out.println("Car added Successfully");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    public void returnRentedCar(){
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter car id: ");
        int id = input.nextInt();
        if(checkCarForRentId(id) != -1){
            carsForRent.get(checkCarForRentId(id)).setRented(false);
            System.out.println("Car returned Successfully");
        }
        else
            System.out.println("Car not found");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }
    public void displayAvilableCarsForRent() {
        int counter = 0;
        for (CarForRent car : carsForRent) {
            if (!car.getRented()) {
                System.out.println("*******************       displayAvilableCarsForRent    ****************************************************");
                counter++;
                System.out.println("Id: " + car.getId());
                System.out.println("Car Type: " + car.getCarType());
                System.out.println("Car Model: " + car.getCarModel());
                System.out.println("Engine Capacity: " + car.getEngineCapacity());
                System.out.println("Price per day: " + car.getPricePerDay());
            }
        }
        if (counter == 0)
            System.out.println("There are no cars available for Rent");
                System.out.println("***********************************************************************");
    }

    public void displayAvilableCarsForSale() {
        int counter = 0;
        for (CarForSale car : carsForSale) {
            if (!car.isSold()) {
                System.out.println("************************   displayAvilableCarsForSale  ***********************************************");
                counter++;
                System.out.println("Id: " + car.getId());
                System.out.println("Car Type: " + car.getCarType());
                System.out.println("Car Model: " + car.getCarModel());
                System.out.println("Engine Capacity: " + car.getEngineCapacity());
                System.out.println("Price car : " + car.getPrice()+ "$");
                System.out.println("***********************************************************************");
            }
        }
        if (counter == 0)
            System.out.println("There are no cars available for Sale");
    }

    public void displayRentedCars(){
        int cnt = 0;
        for(CarForRent car : carsForRent){
            if(car.getRented()){
                cnt++;
                System.out.println("***********************************************************************");
                System.out.println("Id: " + car.getId());
                System.out.println("Car Type: " + car.getCarType());
                System.out.println("Car Model: " + car.getCarModel());
                System.out.println("Engine Capacity: " + car.getEngineCapacity());
                System.out.println("Price per day: " + car.getPricePerDay());
                System.out.println("***********************************************************************");
            }
        }
        if(cnt == 0)
            System.out.println("There are no rented cars");
    }

    public void displaySoldCars(){
        int cnt = 0;
        for (CarForSale car : carsForSale) {
            if (car.isSold()) {
                cnt++;
                System.out.println("***********************************************************************");
                System.out.println("Id: " + car.getId());
                System.out.println("Car Type: " + car.getCarType());
                System.out.println("Car Model: " + car.getCarModel());
                System.out.println("Engine Capacity: " + car.getEngineCapacity());
                System.out.println("Price : " + car.getPrice());
                System.out.println("***********************************************************************");
            }
        }
        if (cnt == 0)
            System.out.println("There are no sold cars");
    }
    public void rentCar(){
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter Car id: ");
        int caId = input.nextInt();
        System.out.println();
        System.out.println("Enter customer id: ");
        int cuId = input.nextInt();
        int eId= this.token.getId();
        System.out.println("Enter number of days: ");
        int days = input.nextInt();
        if(checkCarForRentId(caId) != -1){
            if(checkCustomerId(cuId) != -1){
                if(!carsForRent.get(checkCarForRentId(caId)).getRented()){
                    CarForRent car = carsForRent.get(checkCarForRentId(carId));
                    Customer customer = customers.get(checkCustomerId(cuId));
                    Employee employee = employees.get(checkEmployeeId(eId));
                    employee.setRentProcess(employee.getRentProcess() + 1);
                    car.setRented(true);
                    LocalDateTime rentedDate = LocalDateTime.now();
                    LocalDateTime deadline = rentedDate.plusDays(days);
                    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    customer.addRentedCars(new RentProcess(car.getId(),car.getCarType(), car.getCarModel() , car.getManufacture() , car.getColor() , car.getEngineCapacity() , car.getRented() , car.getPricePerDay() , customerId , eId , rentedDate.format(dateFormat),deadline.format(dateFormat)));
                    System.out.println("Car rented Successfully");
                }else{
                    System.out.println("Car not avilable");
                }
            }else{
                System.out.println("Customer not found");
            }
        }else {
            System.out.println("Car not found");
        }
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    public void buyCar(){
        try{
        System.out.println("***********************************************************************");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter car ID : ");
        int car_Id=input.nextInt();
        System.out.println("Enter customer ID : ");
        int c_Id=input.nextInt();
        int e_Id = this.token.getId();
        int car_check= checkCarForSaleId(car_Id);
        int c_check=checkCustomerId(c_Id);
        if(car_check!=-1 && c_check!=-1){
            if(!carsForSale.get(checkCarForSaleId(c_Id)).isSold()){
                CarForSale car = carsForSale.get(checkCarForSaleId(car_Id));
                Customer custo = customers.get(checkCustomerId(c_Id));
                Employee emp = employees.get(checkEmployeeId(e_Id));
                car.setSold(true);
                emp.setSalesProcess(emp.getRentProcess() + 1 );
                LocalDateTime saleDate = LocalDateTime.now();
                DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                custo.addSoldCars(new SaleProcess(car.getId(), car.getCarType(), car.getCarModel(), car.getManufacture(), car.getColor(),car.getEngineCapacity(),true,car.getPrice(),c_Id,e_Id,saleDate.format(dateFormat)));
                System.out.println("Car sold Successfully");
            }
            else
                System.out.println("Car not available");
        }
        else if(c_check==-1)
            System.out.println("Customer ID not exist");
        else if(car_check==-1)
            System.out.println("Car not found");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    public void deleteCarForSale(){
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter car id: ");
        int id = input.nextInt();
        if(checkCarForSaleId(id) != -1){
            carsForSale.remove(checkCarForSaleId(id));
            System.out.println("Car deleted Successfully");
        }
        else
            System.out.println("Car not found");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    public void deleteCarForRent(){
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter car id: ");
        int id = input.nextInt();
        if(checkCarForRentId(id) != -1){
            carsForRent.remove(checkCarForRentId(id));
            System.out.println("Car deleted Successfully");
        }
        else
            System.out.println("Car not found");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    // customer section
    public void addNewCustomer(){
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter customer Name: ");
        String name = input.next();
        System.out.println("Enter customer Phone: ");
        String phone = input.next();
        System.out.println("Enter customer Age: ");
        int age = input.nextInt();
        customers.add(new Customer(++customerId, name , phone , age ));
        System.out.println("Customer added Successfully");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    public void displayCustomers(){
        for(Customer customer : customers){
            System.out.println("***********************************************************************");
            System.out.println("Id: " + customer.getId());
            System.out.println("Name: " + customer.getName());
            System.out.println("Phone: " + customer.getPhone());
            System.out.println("Age: " + customer.getAge());
            System.out.println("_______________________________________________________________________");
            System.out.println("Rented Cars: ");
            for(RentProcess rent : customer.getRentedCars()){
                System.out.println("Id : " + rent.getId());
                System.out.println("Manufacture : " + rent.getManufacture());
                System.out.println("Car Model" + rent.getCarModel());
                System.out.println("Employee id: " + rent.getEmployeeId());
                System.out.println("Price per day: " + rent.getPricePerDay());
                System.out.println("Rented date: " + rent.getRentedDate());
                System.out.println("Deadline : " + rent.getDeadline());
            }
            System.out.println("_______________________________________________________________________");
            System.out.println("Purchased Cars: ");
            for(SaleProcess sale : customer.getSoldCars()){
                System.out.println("Id : " + sale.getId());
                System.out.println("Manufacture : " + sale.getManufacture());
                System.out.println("Car Model" + sale.getCarModel());
                System.out.println("Employee id: " + sale.getEmployeeId());
                System.out.println("Price: " + sale.getPrice());
                System.out.println("Sale date: " + sale.getSaleDate());
            }
            System.out.println("_______________________________________________________________________");
            System.out.println("***********************************************************************");
        }
    }

    public void deleteCustomer(){
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter customer id: ");
        int id = input.nextInt();
        if(checkCustomerId(id) != -1){
            customers.remove(checkCustomerId(id));
            System.out.println("Customer deleted Successfully");
        }
        else
            System.out.println("Customer not found");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }
    // Employee section
    public void addEmployee() {
        try{
        System.out.println("***********************************************************************");
        System.out.println("enter employee Name: ");
        String name = input.next();

        System.out.println("enter employee Phone Number: ");
        String phoneNumber = input.next();

        System.out.println("enter employee Age: ");
        int age = input.nextInt();

        System.out.println("enter employee Salary ");
        int salary = input.nextInt();

        System.out.println("enter employee password");
        String password = input.next();

        LocalDateTime employmentDate = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        employees.add(new Employee(++employeeid , name , phoneNumber, age, salary , employmentDate.format(dateFormat) , password));
        System.out.println("Employee added Successfully");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println("***********************************************************************");
            System.out.println("Id: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Phone: " + employee.getPhone());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Sales process: " + employee.getSalesProcess());
            System.out.println("Rent process: " + employee.getRentProcess());
            System.out.println("Employment date: " + employee.getEmploymentDate());
            System.out.println("***********************************************************************");
        }
    }

    public void removeEmployee() {
        try{
        System.out.println("***********************************************************************");
        System.out.println("Enter employee id : ");
        int id = input.nextInt();
        if (checkEmployeeId(id) != -1){
            employees.remove(checkEmployeeId(id));
            System.out.println("employee Deleted Successfully!");
        }
        else
            System.out.println("employee is not on our system!");
        System.out.println("***********************************************************************");
        }
        catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }
    public Employee getToken() {
        return token;
    }
    public void login(){
        try{
            System.out.println("***********************************************************************");
            System.out.println("Enter your id");
            int id = input.nextInt();

            System.out.println("Enter your password");
            String password = input.next();
            System.out.println("***********************************************************************");
            if(checkEmployeeId(id) != -1){
                for(Employee employee : employees){
                    if(employee.getId() == id){
                        if(employee.getPassword().equals(password)){
                            System.out.println("Logged in Successfully");
                            System.out.println("Hello " + employee.getName() + ",");
                            this.token = employee;
                            break;
                        }else{
                            System.out.println("Wrong password");
                            break;
                        }
                    }
                }
            }else{
                System.out.println("Employee not found");
            }
            System.out.println("***********************************************************************");
        }catch(InputMismatchException err){
            System.out.println("invalid input");
            input.next();
        }
    }
    public void logout(){
        this.token = null;
    }
}
