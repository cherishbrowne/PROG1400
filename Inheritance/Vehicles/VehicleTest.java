package Inheritance.Vehicles;

public class VehicleTest {
    public static void main(String[] args) {

        Vehicle car = new Vehicle();
        car.setSpeed(200);
        car.setColour(1); // red

        Vehicle plane = new Vehicle();
        plane.setSpeed(500);
        plane.setColour(2); // green

        Vehicle boat = new Vehicle();
        boat.setSpeed(10);
        boat.setColour(3); // blue

    }
}
