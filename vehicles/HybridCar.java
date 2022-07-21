package academy.mindswap.vehicles;

import academy.mindswap.VehicleType;

public class HybridCar extends Car{
    private int batteryLevel;
    private int batteryConsumption;
    public HybridCar( String modelName){
        super(modelName,VehicleType.HYBRID_CAR.getMaxSpeed() ,3, VehicleType.HYBRID_CAR);
        this.batteryLevel = 100;
        this.batteryConsumption = 4;

    }

    @Override
    public void drive(int distance, int duration) {
        float speed = distance / duration;

        if(speed < 25 && (batteryLevel / batteryConsumption) > distance ) {
            batteryLevel -= (batteryConsumption * distance) ;
            System.out.println("You are going with battery power ");
            System.out.printf("Battery power: %s %n", batteryLevel);
            return;
        }
        super.drive(distance, duration);

    }
}
