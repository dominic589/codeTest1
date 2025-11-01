
import java.util.*;

class Vehicle {

    String brand;
    int speed = 0;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void accelerate(int amount) {
        speed += amount;
    }

    public void displayInfo() {
        System.out.println("brand: " + brand);
        System.out.println("current speed is: " + speed + "km/h");

    }

}

class Cars extends Vehicle {

    int fuelLevel;

    public Cars(String brand, int amounts) {
        super(brand);
        this.fuelLevel = amounts;
    }

    public void refuel(int amount) {
        fuelLevel += amount;
    }
}

class Bike extends Cars {

    int gear;

    public Bike(String brand, int gear) {
        super(brand, gear);
        this.gear = gear;
    }

    public void changeGear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("The current fuelLevel is: " + fuelLevel + " liters");
        System.out.println("It is now on gear: " + gear);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Random random = new Random();
        Cars can = new Cars("honda", 7);
        can.accelerate(random.nextInt(3000));
        can.refuel(random.nextInt(4));
        can.displayInfo();

        Bike bir = new Bike("bajaj", 5);
        bir.accelerate(random.nextInt(3000));
        bir.refuel(random.nextInt(4));
        bir.displayInfo();

    }

}
