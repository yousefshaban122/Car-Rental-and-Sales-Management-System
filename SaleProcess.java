package program;

public class SaleProcess extends CarForSale{
    private int customerId;
    private int employeeId;
    private String saleDate;

    public SaleProcess(int id, String carType, String carModel, String manufacture, String color, int engineCapacity, boolean sold, int price, int customerId, int employeeId, String saleDate) {
        super(id, carType, carModel, manufacture, color, engineCapacity, sold, price);
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.saleDate = saleDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
}
