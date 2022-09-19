package Interface;

interface VehiclePlan {
    void noOfEngine();

    void noOfWheels();
}

abstract class Vehicle implements VehiclePlan {
    @Override
    public void noOfEngine() {
        System.out.println("I Have One Engine");
    }
}

class Bike extends Vehicle {

    @Override
    public void noOfWheels() {
        System.out.println("I Have Two Wheels");
    }
}


public class MainClass {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.noOfEngine();
        bike.noOfWheels();
    }
}
