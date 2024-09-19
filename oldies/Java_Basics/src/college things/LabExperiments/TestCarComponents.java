package LabExperiments;

// Car.java (outer class)
class Car {
    // Inner class: Wheel
    class Wheel {
        void rotate() {
            System.out.println("Wheel rotating");
        }
    }

    // Static nested class: Engine
    static class Engine {
        void start() {
            System.out.println("Engine started");
        }
    }
}

// TestCarComponents.java (separate class to instantiate and use objects)
public class TestCarComponents {
    public static void main(String[] args) {
        // Instantiate Engine (static nested class) from Car
        Car.Engine engine = new Car.Engine();
        engine.start();

        // Instantiate Wheel (inner class) from Car
        Car car = new Car(); // Need an instance of Car to create an instance of Wheel
        Car.Wheel wheel = car.new Wheel();
        wheel.rotate();
    }
}
