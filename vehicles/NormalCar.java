package academy.mindswap.vehicles;

import academy.mindswap.VehicleType;

public class NormalCar extends Car{

    public NormalCar( String modelName){
        super(modelName, VehicleType.NORMAL_CAR.getMaxSpeed(), 3, VehicleType.NORMAL_CAR);
    }

}
