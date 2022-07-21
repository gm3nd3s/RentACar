package academy.mindswap;

public enum VehicleType {

    NORMAL_CAR(120),
    HYBRID_CAR(120),
    MOTORCYCLE(100),
    ELECTRIC_CAR(40);

private int maxSpeed;



private VehicleType(int maxSpeed){
    this.maxSpeed = maxSpeed;
}

    public int getMaxSpeed() {
        return maxSpeed;
    }


}
