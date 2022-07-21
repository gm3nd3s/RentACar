package academy.mindswap;

import academy.mindswap.vehicles.HybridCar;
import academy.mindswap.vehicles.Motorcycle;
import academy.mindswap.vehicles.NormalCar;
import academy.mindswap.vehicles.Vehicle;

public class Main {
    // Branch gm3nd3s
    public static void main(String[] args) {
      /*  NormalCar normaCar = new NormalCar("Junker");
        normaCar.drive(1000, 1);
        normaCar.refuel(4);
        HybridCar hybridCar = new HybridCar("hybrid");
        hybridCar.drive(20, 2);
        Motorcycle motorcycle = new Motorcycle("motorcycle");
        motorcycle.drive(70, 2);*/

        Vehicle moto = factory(VehicleType.MOTORCYCLE);
        RentACarShop r = new RentACarShop();

        Vehicle hybrid = r.requestVehicle(VehicleType.HYBRID_CAR);
        Vehicle hybri2 = r.requestVehicle(VehicleType.HYBRID_CAR);

        hybrid.drive(6,5);

        if(hybri2 != null)hybri2.drive(7,6);
        hybrid.drive(200, 3);
        r.checkOut(hybrid);
    }


    public static Vehicle factory(VehicleType type){
        switch (type){
            case HYBRID_CAR:
                return new HybridCar("Toyota");
            case NORMAL_CAR:
                return new NormalCar("Renault");
            case MOTORCYCLE:
                return new Motorcycle("Famel");
        }

        return null;
    }
}