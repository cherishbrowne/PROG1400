package Inheritance.Vehicles;

public class Vehicle extends BaseFunctions {
    protected int speed;
    private int colour;
    protected int direction;

//    public int getSpeed() {
//        return speed;
//    }

    public void setSpeed(int speed) {
        log("Changing speed from " + this.speed);
        this.speed = speed;
    }

//    public int getColour() {
//        return colour;
//    }
//
//    public void setColour(int colour) {
//        this.colour = colour;
//    }

    public void setColour(int colour) {
        log("Changing colour from " + this.colour + " to " + colour);
        this.colour = colour;
    }
}
