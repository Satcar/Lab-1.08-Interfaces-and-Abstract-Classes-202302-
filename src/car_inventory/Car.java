package car_inventory;

public abstract class Car {
    //ATRIBUTOS
    private final String vinNumber;
    private final String make;
    private final String model;
    private int mileage;

    //CONSTRUCTOR
    protected Car(String vinNumber, String make, String model, int mileage) {
        this.vinNumber = vinNumber;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }

    //GETTERS Y SETTERS

    public String getVinNumber() {
        return vinNumber;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage > this.mileage && mileage > 0) {
            this.mileage = mileage;
        }else {
            System.out.println("Error: El kilometraje debe ser mayor que el actual y positivo.");
        }

    }

    //METODOS

    String getInfo() {
        return String.format(
                """
                        ***Datos del vehículo***
                        Número de serie: %s
                        Marca: %s
                        Modelo: %s
                        Kilometraje: %d""",
                getVinNumber(), getMake(), getModel(), getMileage()
        );
    }

}
