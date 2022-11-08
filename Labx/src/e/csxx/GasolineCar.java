package edu.cscc;

public class GasolineCar extends Car {
    private int cylinders;
    private double tankCapacity;

    //Constructor
    public GasolineCar(String make, String model, int year, int cylinders, double tankCapacity) {
        super(make,model,year);
        this.cylinders = cylinders;
        this.tankCapacity = tankCapacity;
    }

    // Accessors & mutators
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
    public void describe () {
        System.out.println("Make: "+this.getMake()+
                "\nModel: "+this.getModel()+
                "\nYear: "+this.getYear()+
                "\nCylinders: "+this.cylinders+
                "\nFuel Capacity: "+this.tankCapacity);
    }
}
