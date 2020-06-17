package bai11_DSA_Stack_Queue.BaiTap.KiemTraChuoi_Palindrome;

import java.util.Scanner;

public class SuDungFor {
    public static void main(String[] args) {
        String reverserString ="";
        System.out.println("nhap String muon ktr:");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        for (int i = inputString.length()-1;i>=0;i--){
            reverserString+= inputString.charAt(i);
        }
        if (reverserString.equals(inputString)){
            System.out.println("String ban nhap la Palindrome");
        } else {
            System.out.println("String ban nhap khong phai la Palindrome");
        }
    }
}
