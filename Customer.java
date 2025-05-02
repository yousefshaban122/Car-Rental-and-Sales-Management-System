package program;
import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

    private  List <RentProcess> rentedCars= new ArrayList<RentProcess>();
    private List <SaleProcess> soldCars = new ArrayList<SaleProcess>();

    public Customer(int id, String name, String phone, int age) {
        super(id, name, phone, age);
    }

    public  void addSoldCars(SaleProcess car) {
        soldCars.add(car);
    }
    public void addRentedCars(RentProcess car) {
        rentedCars.add(car);
    }

    public List<RentProcess> getRentedCars() {
        return rentedCars;
    }

    public List<SaleProcess> getSoldCars() {
        return soldCars;
    }
}