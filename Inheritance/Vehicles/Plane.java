package Inheritance.Vehicles;

public class Plane extends Vehicle {

    int maxAltitude;

    @Override
    public void setSpeed(int speed) {
        // super.setSpeed(speed)
        this.speed = speed;
        log("The velocity is " + speed);
    }
}
