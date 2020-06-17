package bai7_Abstract_interface.thucHanh.bai2_InterfaceComparater;
import bai6_inheritance_KeThua.ThucHanh.Circle;

import java.util.Arrays;

public class CircleCoparatorTest {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles [0] = new Circle(3.6);
        circles [1] = new Circle();
        circles [2] = new Circle(3.5, "indigo",false);
        System.out.println("pre-sorted");
        for (Circle circle:circles);
        Comparator circleComparator = (Comparator) new CircleComparator();
        //Arrays.sort(circles, circleComparator);

    }
}
