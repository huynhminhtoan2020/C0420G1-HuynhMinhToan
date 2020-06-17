package bai11_DSA_Stack_Queue.BaiTap.KiemTraChuoi_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ktra_Palindrome_using_Queue {
    public static void main(String[] args) {
        System.out.println("Nhap String muon ktra:");
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        Queue queue = new LinkedList<>();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString += queue.remove();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("String cua ban la : Palindrome");
        } else {
            System.out.println("String cua ban khong phai Palindrome");
        }
    }
}

