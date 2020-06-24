package bai14_thuat_toan.baitap;

public class ExternalSort {
    static  double [] list = { 1,9,4.5,6,6.9,-1};
    public static void ExternalSort(double [] list) {
        for (int i =1; i<list.length; i++){
            double currentElement = list[i];
            int k;
            for (k = i-1; k >=0 && list[k]>currentElement;k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        for (double elements: list
             ) {
            System.out.println(elements);
        }
    }
}
