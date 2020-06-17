package bai3_ArrayVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class daoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        int Size;
        int [] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Enter the Size of Array");
            Size = scanner.nextInt();
            if (Size>20){
                System.out.printf("Please try again. Size should <= 20");
            }

        } while (Size>20);

        array = new int[Size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[Size - 1 - j];
            array[Size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
