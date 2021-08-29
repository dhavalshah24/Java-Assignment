import java.util.*;

class Car {

    public String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulatingClass {

    public static void main(String[] args) {
        
        Car car = new Car("Mercedes");
        System.out.println("Car name is "+ car.getName());
        car.setName("BMW");
        System.out.println("New car name is "+ car.getName());
    }
}
