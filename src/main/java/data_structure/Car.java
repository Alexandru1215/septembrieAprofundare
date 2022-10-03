package data_structure;

import java.util.HashMap;

public class Car extends Garage{

   private String name;
   private String model;
   private  int year;


    Car(){

    }
    Car(HashMap<Integer,String> palceAndCar) {
        super( palceAndCar);
    }


    Car(String name, String model, int year ) {
        this.name = name;
        this.model = model;
        this.year = year;

    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    void setName(String name) {
        this.name = name;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setYear(int year) {
        this.year = year;
    }


}
