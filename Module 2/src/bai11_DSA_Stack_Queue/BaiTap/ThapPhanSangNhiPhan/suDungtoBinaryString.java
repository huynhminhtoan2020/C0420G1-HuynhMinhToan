package bai11_DSA_Stack_Queue.BaiTap.ThapPhanSangNhiPhan;

import java.util.Scanner;

public class suDungtoBinaryString {
    public static void main(String[] args) {
        int decimalNumber;
        System.out.println("nhap so muon tim he nhi phan");
        Scanner scr = new Scanner(System.in);
        decimalNumber = scr.nextInt();
        System.out.println("He nhi phan cua " +decimalNumber + " la:");
        System.out.println(Integer.toBinaryString(decimalNumber));
    }
}
