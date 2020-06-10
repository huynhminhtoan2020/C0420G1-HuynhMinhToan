package bai2_LoopJava.ThucHanh;

import java.util.Scanner;

public class greatest_Common_Divisor {
    public static void main(String[] args) {
        int number1, number2;
        System.out.println("Input first number");
        Scanner num1 = new Scanner(System.in);
        number1 = num1.nextInt();
        System.out.println("Input second number");
        Scanner num2 = new Scanner(System.in);
        number2 = num2.nextInt();
        if (number1<1 || number2<1){
            System.out.println("SO ban nhap hk co uoc so chung");
        }
        int min = Math.min(number1, number2);
        for (int i = min; i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                System.out.println("uoc so chung lon nhat la: " + i);
                break;
            }
        }
//        if (number1 > number2) {
//            for (int i = number2; i >= 2; i--) {
//                if (number2 % i == 0 && number1 % i == 0) {
//                    System.out.println("uoc so chung lon nhat la:" + i);
//                    break;
//                }
//            }
//        } else {
//            for (int i = number1; i >= 2; i--) {
//                if (number1 % i == 0 && number2 % i == 0) {
//                    System.out.println("uoc so chung lon nhat la:" + i);
//                    break;
//                }
//            }
//        }
    }
}
