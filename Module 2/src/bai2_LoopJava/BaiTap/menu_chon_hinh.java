package bai2_LoopJava.BaiTap;

import java.util.Scanner;

public class menu_chon_hinh {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Print the rectangle");
        System.out.println("2.print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println(" Enter your choice");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter width");
                Scanner wid = new Scanner(System.in);
                int Width = wid.nextInt();
                System.out.println("Enter height");
                Scanner hei = new Scanner(System.in);
                int Height = hei.nextInt();
                for (int i = 1; i < Height; i++) {
                    for (int j = 1; j < Width; j++) {
                        System.out.printf("*" + "  ");
                    }
                    System.out.printf("\n");
                }
            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j < i; j++) {
                        System.out.printf("*" + " ");
                    }
                    System.out.printf("\n");
                }
            case 3:
                for (int i = 7; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("*" + "  ");
                    }

                    System.out.printf("\n");
                }
            case 4:
                System.exit(4);
            default:
                System.out.printf("No choice");
        }
    }
}

