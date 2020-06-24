package bai14_thuat_toan.baitap;

import java.util.Arrays;

public class bubbleSort {
    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i =0; i<array.length-1;i++){
                if (array[i] >array[i+1]){
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = new int[] {5,6,2,3,7,1,9};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
