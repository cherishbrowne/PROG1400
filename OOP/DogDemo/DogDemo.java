package OOP.DogDemo;

class Dog {
    String name;
    int numLegs;
    String breed;
    boolean fleas;
}

public class DogDemo {

    public static void main(String[] args) {

        Dog spot = new Dog();
        spot.name = "Spot";
        spot.numLegs = 3;
        spot.breed = "Collie";
        spot.fleas = true;

    }

}