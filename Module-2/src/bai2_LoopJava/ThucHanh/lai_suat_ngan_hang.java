package bai2_LoopJava.ThucHanh;

import java.util.Scanner;
//Sử dụng lãi suất theo ngân hàng để tính lãi suất tiền gửi trong 3 tháng,
// với số tiền 100 triệu đồng, tỉ lệ lãi suất là 5.5% năm
public class lai_suat_ngan_hang {
    public static void main(String[] args) {
        double money;
        int month;
        double interest_rate;
        System.out.println("Enter investment amount");
        Scanner input = new Scanner(System.in);
        money = input.nextDouble();
        System.out.println("Enter Months You want");
        Scanner mon = new Scanner(System.in);
        month = mon.nextInt();
        System.out.println(" Enter invester rate of year");
        Scanner rate = new Scanner(System.in);
        interest_rate = rate.nextDouble();
        double total = money*month*30*((interest_rate/100)/360);
        System.out.println("tien lai ban nhan dc la: " + total);



    }
}
