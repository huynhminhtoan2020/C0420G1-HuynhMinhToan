package bai1IntroduceJava.ThucHanh;

import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        System.out.println("Input month: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(month + ": we have 31 days in this month");
                break;
            case 2:
                System.out.println(month+ ": We have 28 or 29 days in this month ");
                break;
            case 4:
            case 6:
            case 9:
                System.out.println(month+ "We have 30 days in this month");
                break;
            default:
                System.out.println("wrong, pls try again");


        }

    }
}
