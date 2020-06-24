package bai14_thuat_toan.thuc_hanh;

public class selectionSort {
    static  double [] list = { 1,9,4.5,6,6.9,-1};

    public static void selectionSort(double [] list) {
        for (int i=0; i<list.length-1;i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i+1; j<list.length;j++){
                if (currentMin >list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex!=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (double elements:list
             ) {
            System.out.println(elements);
        }
    }
}
