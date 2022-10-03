package data_structure;

import java.util.HashMap;

public class Garage {

    String car;
    Integer parkNumber;

    HashMap<Integer, String> placeAndCar = new HashMap<>();

    Garage() {

    }

    Garage(HashMap<Integer, String> palceAndCar) {
        this.placeAndCar = palceAndCar;
    }

    @Override
    public String toString() {
        return "data_structure.Garage{" +
                "car='" + car + '\'' +
                ", parkNumber=" + parkNumber +
                ", placeAndCar=" + placeAndCar +
                '}';
    }

    void park(Car car) {
        System.out.println("The data_structure.Car " + car + " is parked in garage!");
    }

    void isParkedIn(Car car) {
        System.out.println("This car " + car + " is parked in Mall.");
    }
}
