package program;
public class CarForRent extends Car {
    private Boolean rented;
    private int pricePerDay;

    public CarForRent(int id, String carType, String carModel, String manufacture, String color, int engineCapacity, Boolean rented, int pricePerDay) {
        super(id, carType, carModel, manufacture, color, engineCapacity);
        this.rented = rented;
        this.pricePerDay = pricePerDay;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
        // geters
    public Boolean getRented() {
        return rented;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

}
