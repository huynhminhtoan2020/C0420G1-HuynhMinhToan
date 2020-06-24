package bai13_thuat_toan;


import bai11_DSA_Stack_Queue.BaiTap.ThapPhanSangNhiPhan.SuDungStack;

import java.util.Scanner;

public class suDungDeQuy {
    int binarytree(int arr[], int low, int h, int value) {
        if (h > low) {
            int mid = (low + h) / 2;
            if (arr[mid] == value)
                return mid;
            if (arr[mid] > value)
                return binarytree(arr, low, mid - 1, value);
            return binarytree(arr, mid + 1, h, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        suDungDeQuy ob = new suDungDeQuy();
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int value = 8;
        int low =0;
        int h = arr.length-1;
        int result = ob.binarytree(arr,low,h,value);
        System.out.println("gia tri " + value+ " o vi tri index " + result);

    }
}
