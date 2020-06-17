package bai11_DSA_Stack_Queue.BaiTap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Reverse_the_elements_of_an_array_using_stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < myArray.length; i++) {
            stack.push(myArray[i]);
        }
        int[] reverseArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            reverseArray[i] = stack.pop();
        }
       System.out.println(" reversing array is: " + Arrays.toString(reverseArray));
        // hoac co the chay ham for de in ra
    }

}
