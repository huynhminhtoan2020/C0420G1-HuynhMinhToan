package bai6_inheritance_KeThua.BaiTap.BaiTap4_Triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input side1");
        double side1 = Double.parseDouble(input.nextLine());
        System.out.println("input side2");
        double side2 = Double.parseDouble(input.nextLine());
        System.out.println("input side3");
        double side3 = Double.parseDouble(input.nextLine());
        System.out.println("input color");
        String color = input.nextLine();
        System.out.println("input filled");
        boolean filled = Boolean.parseBoolean(input.nextLine());
        Triangle triangle = new Triangle(color,filled,side1,side2,side3);
        System.out.println(triangle);
    }
}
