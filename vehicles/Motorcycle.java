package academy.mindswap.vehicles;

import academy.mindswap.VehicleType;

public class Motorcycle extends Vehicle{
    private int maxDistance;

    public Motorcycle(String modelName){
        super(modelName, 100, 2, VehicleType.MOTORCYCLE);
        this.maxDistance = 80;
    }

    @Override
    public void drive(int distance, int duration) {
        if(distance > maxDistance){
            System.out.println("You shall not pass!");
            return;
        }
        super.drive(distance, duration);
    }
}
