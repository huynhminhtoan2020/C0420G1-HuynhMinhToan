package bai6_inheritance_KeThua.BaiTap.BaiTap4_Triangle;

import bai6_inheritance_KeThua.ThucHanh.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String coler, boolean filled, double side1, double side2, double side3) {
        super(coler, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.setColer(coler);
        this.setFilled(filled);
    }

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        return Math.sqrt((side1+side2+side3)*
                (side1+side2-side3)*(side2+side3-side1)*
                (side3+side1-side2))/4;
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "\n"+
                "side1=" + side1 + "\n"+
                ", side2=" + side2 +  "\n"+
                ", side3=" + side3 +  "\n"+
                " Area =" + getArea()  + "\n"+
                " Perimeter =" + getPerimeter()+  "\n"+
                '}'+  "\n"+ super.toString();
    }
}
