package bai1IntroduceJava.ThucHanh;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        System.out.println("input year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 4 ==0 && year %100 != 0){
            System.out.println(year + " is leap year");
        } else if (year%100==0 && year%400==0){
            System.out.println(year+ "is leap year");
        } else {
            System.out.println(year+" isn't leap year");
        }
    }
}
