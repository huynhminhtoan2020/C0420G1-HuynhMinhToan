package bai11_DSA_Stack_Queue.ThucHanh.ThucHanh1;

import bai10Colection_DanhSach.BaiTap.BaiTap2.MyLinkedList;

public class LinkedListQueueClient {
    public static void main(String[] args) {
        MylinkedListQueue queue = new MylinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        System.out.println("Dequeued item is "+ queue.dequeue().key);
    }
}
