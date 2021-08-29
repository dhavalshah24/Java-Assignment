import java.util.*;

abstract class Animal {

    abstract public void run();
}

interface Vehile {

    public void running(int speed);
}

class Dog extends Animal {

    public void run(){
        System.out.println("Dog is running");
    }
}

class Car implements Vehile {

    public void running(int speed) {
        System.out.println("Car is running at " + speed + " km/hr");
    }
}

class abstractClass {

    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.run();

        Car car = new Car();
        car.running(60);
    }
}