package bai13_thuat_toan;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println(" Enter a string: ");
        String input = scr.nextLine();
        int[] frequentChar = new int[255];
        for (int i =0; i<input.length();i++){
            // tim vi tri tuong ung cua ky tu trong ban ascii
            int ascii = (int) input.charAt(i);
            // tang gi tri tan suat
            frequentChar[ascii]+=1;
        }
        int max =0;
        char character = (char) 255;
        for (int j =0; j<255;j++){
            if (frequentChar[j]>max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println("tan xuat xuat hien cua ky tu:'" +character+ " 'voi tan xuat "+max);
    }
}
