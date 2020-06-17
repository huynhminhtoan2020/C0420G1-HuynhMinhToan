package bai1IntroduceJava.ThucHanh;

import java.util.Scanner;

public class BodyMassIndexBMI {
    public static void main(String[] args) {
        double weight,height,bmi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Weight (kg)");
        weight = scanner.nextDouble();
        System.out.println("Input Height(meter)");
              height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        if (bmi>=30){
            System.out.println("bmi is: "+bmi + " you are Obese");
        } else if (bmi>=25){
            System.out.println("bmi is: "+bmi+" you are Overweight");
        } else if (bmi>=18.5){
            System.out.println("bmi is: "+bmi +" you are Normal");
        } else {
            System.out.println("bmi is: "+bmi +" you are Underweight");
        }
    }
}
