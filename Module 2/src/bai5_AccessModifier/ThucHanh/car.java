package bai5_AccessModifier.ThucHanh;

import javax.xml.namespace.QName;
import java.awt.*;

public class car {
    private String name;
    private String engine;
    public static int numberOfCars;
    public car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static class TestStaticProperty{
        public static void main(String[] args) {
            car car1 = new car("Mazda 3","Skyactive 3");
            System.out.println(car.numberOfCars);
            car car2 = new car("Mazda 6","Skyactiv 6");
            System.out.println(car.numberOfCars);


        }
    }

}
