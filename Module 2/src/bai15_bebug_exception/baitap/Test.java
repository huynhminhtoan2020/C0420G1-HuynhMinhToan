package bai15_bebug_exception.baitap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    private static void tamgiac() throws IllegalTriangleException {
        Scanner scr = new Scanner(System.in);

        try {
            System.out.println("Nhap Canh a: ");
            int a = scr.nextInt();
            System.out.println("Nhap canh b :");
            int b=scr.nextInt();
            System.out.println("nhap canh c:");
            int c = scr.nextInt();
            if (a>0 && b>0 &&c>0){
                System.out.println("Tam giac co gia tri: canh a = " + a + " canh b = "+ b +" canh c = " +c);
            } else throw new IllegalTriangleException("Gia tri canh <0, nhap lai");
            if (a+b > c && a+c >b && c+b>a) {
                System.out.println("chu vi la : " + (a+b+c));
            } else throw new IllegalTriangleException("Gia Tri 2 canh phai lon hon 1 canh");
        } catch (InputMismatchException e) {
            throw new IllegalTriangleException("gia tri cua Canh tam giac  phai la so nguyen duong");
        }
    }

    public static void main(String[] args) {
        Test ts = new Test();
        try {
            ts.tamgiac();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}