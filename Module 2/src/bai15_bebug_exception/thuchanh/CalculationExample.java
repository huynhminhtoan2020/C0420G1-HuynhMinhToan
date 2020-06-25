package bai15_bebug_exception.thuchanh;

import java.util.Scanner;

public class CalculationExample {
//    public static void calc (){
//        int x,y;
//        int tong,hieu,tich,thuong;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap X:");
        int x = scanner.nextInt();
        System.out.println("nhap Y:");
        int y = scanner.nextInt();
        CalculationExample cals = new CalculationExample();
        cals.calculate(x,y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
            System.out.println("Tong = " + a);
            System.out.println("Hieu = " + b);
            System.out.println("Tich = " + c);
            System.out.println("Thuong = " + d);
        } catch (Exception e){
            System.out.println("Xay ra ngoai le:" + e.getMessage());
        }
    }
}
