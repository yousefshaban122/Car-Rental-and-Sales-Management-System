package program;

public class RentProcess extends CarForRent{
    private int customerId;
    private int employeeId;
    private String rentedDate;
    private String deadline;


    public RentProcess(int id, String carType, String carModel, String manufacture, String color, int engineCapacity, Boolean rented, int pricePerDay, int customerId, int employeeId, String rentedDate, String deadline) {
        super(id, carType, carModel, manufacture, color, engineCapacity, rented, pricePerDay);
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.rentedDate = rentedDate;
        this.deadline = deadline;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getRentedDate() {
        return rentedDate;
    }

    public String getDeadline() {
        return deadline;
    }
}
