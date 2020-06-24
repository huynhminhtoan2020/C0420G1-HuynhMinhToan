package bai14_thuat_toan.baitap;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] arr = {20, 10, 100, 30, 25, 75, 40};
        bulleSort(arr);
    }

    public static int[] bulleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.println("Interation " + (i + 1) + ": ");
            printArray(arr);
        }
        return arr;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}
