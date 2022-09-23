import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

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
        return "Garage{" +
                "car='" + car + '\'' +
                ", parkNumber=" + parkNumber +
                ", placeAndCar=" + placeAndCar +
                '}';
    }

    void park(Car car) {
        System.out.println("The Car " + car + " is parked in garage!");
    }

    void isParkedIn(Car car) {
        System.out.println("This car " + car + " is parked in Mall.");
    }
}
