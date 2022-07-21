package academy.mindswap.vehicles;

import academy.mindswap.VehicleType;

public abstract class Vehicle {
    private String modelName;
    private int fuelLevel = 25;
    private int maxSpeed;
    private VehicleType vehicleType;
    private boolean isRented;
    protected float consumption;
    public Vehicle(String modelName, int maxSpeed, float consumption, VehicleType vehicleType) {
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.consumption = consumption;
        this.vehicleType = vehicleType;
    }


    public void drive (int distance, int duration){
        float speed = distance / duration;
        if(speed > maxSpeed && (fuelLevel / consumption) < distance ){
            System.out.println("Hell no! You cannot leave the garage!");
            return;
        }
        System.out.println("Enjoy your ride!");
        System.out.printf("consumption: %s %n", consumption);
        fuelLevel -= (consumption * distance) / 100;
        System.out.printf("FuelLevel: %s %n", fuelLevel );
        return;
    }

    public void refuel (int fuel){
        if(fuelLevel + fuel > 25){
            System.out.println("that's too much fuel for my tank!");
            return;
        }
        fuelLevel += fuel;
        System.out.printf("Refuelled with %s liters.%n", fuel);
        System.out.printf("FuelLevel: %s %n", fuelLevel );
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public boolean isRented() {
        return isRented;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
