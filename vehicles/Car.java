package academy.mindswap.vehicles;

import academy.mindswap.VehicleType;
public abstract class Car extends Vehicle{

    public Car (String modelName, int maxSpeed, float consumption, VehicleType vehicleType){
        super(modelName, maxSpeed, consumption, vehicleType);
    }

}
