package bai11_DSA_Stack_Queue.BaiTap.ThapPhanSangNhiPhan;

import java.util.Stack;

public class SuDungStack {
    public void convertBinary (int num){
        Stack<Integer> stack = new Stack<>();
        while (num!=0){
            // thuc hien chia lay du cho 2;
            int d = num%2;
            // them vao stack
            stack.push(d);
            num/=2;
        }
        while (!(stack.isEmpty())){
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        int decimalNumber = 30;
        System.out.println("He nhi phan cua " + decimalNumber +" la: ");
        new SuDungStack().convertBinary(decimalNumber);
    }
}
