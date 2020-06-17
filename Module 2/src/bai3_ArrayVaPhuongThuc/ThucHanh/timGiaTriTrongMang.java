package bai3_ArrayVaPhuongThuc.ThucHanh;

import java.util.Scanner;

public class timGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Hoa", "Luong", "Sanh", "Bang", "Diep", "Trinh", "Vinh", "Toan", "My", "Cuong", "Thu", "Tau"};
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter student's Name: ");

        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.printf("vi tri sinh vien : " + input_name + " trong danh sach la: " + (i + 1));
                isExist = true;
                break;
            }
        }

        if (!isExist) {
            System.out.printf("Sinh vien hk co trong danh sach");
        }
    }
}
