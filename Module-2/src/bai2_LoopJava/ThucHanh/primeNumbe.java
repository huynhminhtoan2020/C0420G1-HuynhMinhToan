package bai2_LoopJava.ThucHanh;

import java.util.Scanner;

public class primeNumbe {
    public static void main(String[] args) {
        boolean flag=true;
        System.out.println("Input your Number");
        Scanner cr = new Scanner(System.in);
        int num = cr.nextInt();
        if (num<2){
            System.out.println(num +" is't prime number");
        }
        if (num==2) {
            System.out.println(num + " is prime number");
        }
        if (num>2){
            for (int i=2;i<num;i++){
                if (num%i==0){
                    flag=false;
                }
            }
            System.out.println(flag?"snt":"ko");
        }
    }
}
