package academy.mindswap;

import academy.mindswap.vehicles.HybridCar;
import academy.mindswap.vehicles.Motorcycle;
import academy.mindswap.vehicles.NormalCar;
import academy.mindswap.vehicles.Vehicle;

public class RentACarShop {

    private Vehicle[] vehicles;

    public RentACarShop() {
        this.vehicles = new Vehicle[] {new NormalCar("Toyota M1"), new HybridCar("Zen"),new Motorcycle("Famel")};
    }

    public Vehicle requestVehicle (VehicleType vehicleType){

        for (Vehicle v: vehicles) {
            if (v.getVehicleType() == vehicleType && !v.isRented()){
                v.setRented(true);
                System.out.println("Here is your car.Have a nice trip! :)");
                return  v;
            }

        }

        System.out.println("no car");
        return null;

    }
    public void checkOut(Vehicle vehicle){
        if(vehicle.getFuelLevel() >= 20){
            System.out.println("Thanks for your preference!");
            return;
        }
        System.out.println(vehicle.getFuelLevel());
        System.out.println((20 - vehicle.getFuelLevel()) * 1.5 + "€ to pay");
    }

}
