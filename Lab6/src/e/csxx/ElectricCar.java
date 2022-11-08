package edu.cscc;

public class ElectricCar extends Car {
    private int batterySize;

    public ElectricCar(String make, String model, int year, int batterySize) {
        super(make,model,year);
        this.batterySize = batterySize;
    }
     // Accessors / Mutators
    public int getBatterySize() {
        return batterySize;
    }
    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
    public void describe() {
        System.out.println("Make: "+getMake()+
                "\nModel: "+getModel()+
                "\nYear: "+getYear()+
                "\nBattery Size: "+this.batterySize);
    }
}
