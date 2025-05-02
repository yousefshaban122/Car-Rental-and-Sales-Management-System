package program;
class Employee extends Person {
    private int salary;
    private int salesProcess;
    private int rentProcess;
    private String password;
    private String employmentDate;

    public Employee(int id, String name, String phone, int age, int salary, String employmentDate , String password) {
        super(id, name, phone, age);
        this.salesProcess = 0;
        this.rentProcess = 0;
        this.salary = salary;
        this.employmentDate = employmentDate;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getSalesProcess() {
        return salesProcess;
    }

    public void setSalesProcess(int salesProcess) {
        this.salesProcess = salesProcess;
    }

    public int getRentProcess() {
        return rentProcess;
    }

    public void setRentProcess(int rentProcess) {
        this.rentProcess = rentProcess;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }
}