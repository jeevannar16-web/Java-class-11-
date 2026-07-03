/*
 * Another example of Class & Object
 * Class = Car (blueprint)
 * Object = myCar, yourCar (actual cars)
 */

public class CarDemo {
    public static void main(String[] args) {
        // Create objects from the Car class
        Car myCar = new Car();
        Car yourCar = new Car();

        // Set values for myCar
        myCar.brand = "Toyota";
        myCar.color = "Red";
        myCar.speed = 0;

        // Set values for yourCar
        yourCar.brand = "Honda";
        yourCar.color = "Blue";
        yourCar.speed = 20;

        // Use the objects
        System.out.println("=== My Car ===");
        myCar.showDetails();
        myCar.accelerate();
        myCar.accelerate();

        System.out.println("\n=== Your Car ===");
        yourCar.showDetails();
        yourCar.accelerate();
    }
}

class Car {
    // Attributes
    String brand;
    String color;
    int speed;

    // Method - make the car accelerate
    void accelerate() {
        speed = speed + 10;
        System.out.println(color + " " + brand + " is now at " + speed + " km/h");
    }

    // Method - display car details
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}
