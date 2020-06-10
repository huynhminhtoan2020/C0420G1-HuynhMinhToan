package bai1IntroduceJava.BaiTap;

import java.util.Scanner;

public class changeMoney {
    public static void main(String[] args) {
        double input_money;
        double output_money;
        System.out.println("Input USD");
        Scanner scanner = new Scanner(System.in);
        input_money = scanner.nextInt();
        output_money = input_money*23000 ;
        System.out.println("your VND is " + output_money + "VND");
    }
}
