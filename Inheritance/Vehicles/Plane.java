package Inheritance.Vehicles;

public class Plane extends Vehicle {

    protected int maxAltitude;

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void setSpeed(int speed) {
        // super.setSpeed(speed)
        this.speed = speed;
        log("The velocity is " + speed);
    }
}
