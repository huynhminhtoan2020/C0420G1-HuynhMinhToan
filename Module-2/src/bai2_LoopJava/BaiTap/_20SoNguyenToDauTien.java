package bai2_LoopJava.BaiTap;

import java.util.Scanner;

public class _20SoNguyenToDauTien {
    public static void main(String[] args) {
        int count = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of prime numbers you want to display:");
        int numberDisplay = input.nextInt();
        String temp = " số nguyên tố đầu tiên là: 2, ";
        String result = "";
        int number = 2;
        boolean checkPrime = true;

        while (count < numberDisplay) {
            number++;
            for (int j = 2; j < number; j++) {
                checkPrime = true;
                if (number % j == 0) {
                    checkPrime = false;
                    break;
                }
            }
            if (checkPrime) {
                count++;
                temp += number +", ";
            }
        }

        result = numberDisplay + temp;
        System.out.println(result);
    }
}