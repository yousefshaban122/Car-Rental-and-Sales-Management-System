package program;

public class CarForSale extends Car{
    private boolean sold;
    private int price;

    public CarForSale(int id, String carType, String carModel, String manufacture, String color, int engineCapacity, boolean sold, int price) {
        super(id, carType, carModel, manufacture, color, engineCapacity);
        this.sold = sold;
        this.price = price;
    }

    public boolean isSold() {
        return sold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void setSold(boolean sold) {
        this.sold = sold;
    }
}
