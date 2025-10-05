package Week4;

abstract class Vehicle {
    abstract void start();
    abstract void stop();
}
class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car Started");
    }
    @Override
    void stop(){
        System.out.println("Car Stopped");
    }
}


class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike Started");
    }
    @Override
    void stop(){
        System.out.println("Bike Stopped");
    }
}
class Main2{
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car();
        vehicle1.start();
        vehicle1.stop();
        Vehicle vehicle2 = new Bike();
        vehicle2.start();
        vehicle2.stop();

    }
}