package bai10Colection_DanhSach.BaiTap.BaiTap1;

import java.util.Arrays;

public class Mylist <E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object elements [];

    public Mylist(int capacity) {
        if (capacity>=0){
            elements = new  Object[capacity];
        } else {
            throw new IllegalCallerException ("capacity" +capacity);
        }
    }
    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public int size (){
        return this.size;
    }
    public void clear (){
        size = 0;
        for (int i = 0 ; i<elements.length;i++){
            elements[i] = null;
        }
    }
    public boolean add(E element){
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
        // sao lai return true?
    }
    public void add(E element , int index){
        if (index>elements.length){
            throw new IllegalArgumentException("index"+index);
        } else if (elements.length==size){
            this.ensureCapacity(5);
        }
        if (elements[index]==null){
            elements[index] = element;
            size++;
        } else {
            for (int i =size+1 ; i>= index; i--){
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }
    private void ensureCapacity(int minCapacity) {
        if (minCapacity>=0){
                int newSize = this.elements.length + minCapacity;
                elements = Arrays.copyOf(elements, newSize);
                // Array va Arrays khac nhau ntn?
        } else {
            throw new IllegalArgumentException ("minCapacity" + minCapacity ) ;
        }

    }
}
