package car_inventory;

public class Truck extends Car{

    private final double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        this.towingCapacity = towingCapacity;
    }


    public double getTowingCapacity() {
        return towingCapacity;
    }

    @Override
    String getInfo() {
        return super.getInfo() + String.format("\nCarga máxima: %.2f kg", getTowingCapacity());
    }
}
