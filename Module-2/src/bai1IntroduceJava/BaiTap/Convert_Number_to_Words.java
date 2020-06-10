package bai1IntroduceJava.BaiTap;

import java.util.Scanner;

public class Convert_Number_to_Words {
    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number between 0 and 999");
        number = scanner.nextInt();
        //while (number != -1) {
            if (number >= 0 && number <= 999) {
                if (number == 0) {
                    System.out.println("Number after convertion:  Zero");
                } else {
                    System.out.println("Number after convertion: ");
                    numberToWord(((number / 100) % 10), "Hundred");
                    numberToWord((number % 100), " ");
                }
            } else {
                System.out.println("Number out of range");
            }
           // System.out.println("\nPlease type of number between 0 and 999 or type -1 to exit");
            number = scanner.nextInt();
        }
    //}
    public static void numberToWord(int num,String val){
        String ones [] = { " ", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Seventeen","Eighteen","Nineteen"};
        String tens[] = {" ", " "," Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        if (num > 19) {
            System.out.println(tens[num/10] + " " + ones[num%10]);
        } else {
            System.out.println(ones[num]);
        }
        if (num>0){
            System.out.println(val);
        }
    }
}
