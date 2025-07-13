package car_inventory;

public class UtilityVehicle extends Car{

    private final boolean fourWheelDrive;

    public UtilityVehicle(String vinNumber, String make, String model, int mileage, boolean fourWheelDrive) {
        super(vinNumber, make, model, mileage);
        this.fourWheelDrive = fourWheelDrive;
    }

    public boolean hasFourWheelDrive() {
        return fourWheelDrive;
    }

    @Override
    String getInfo() {
        return super.getInfo() + String.format("\nTracción a las cuatro ruedas: %s",hasFourWheelDrive() ? "Si" : "No");
    }
}
