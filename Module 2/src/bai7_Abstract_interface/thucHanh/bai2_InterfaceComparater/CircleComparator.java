package bai7_Abstract_interface.thucHanh.bai2_InterfaceComparater;
import bai6_inheritance_KeThua.ThucHanh.Circle;

import java.util.Comparator;
public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle o1, Circle o2) {
    if (o1.getRadius() > o2.getRadius()) return 1;
    else if (o1.getRadius() < o2.getRadius()) return -1;
    else return 0;
    }
}
