package bai1IntroduceJava.ThucHanh;
import java.util.Scanner;
// given a equation as ax+b = 0, please find solution
public class firstDegreeEquation {
        public static void main(String[] args) {
            double a;
            double b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a:");
            a = scanner.nextDouble();
            System.out.println("Input b:");
            b = scanner.nextDouble();
            if (a!=0) {
                double Solution = (-b / a);
                System.out.println("The Sulotion is :" + Solution);
            }else {
                 if (b==0) {
                     System.out.println(" the Sulotion is all x");
                 }
                 else {
                     System.out.println(" No Sulotion");
                 }
                }
        }
}
