package bai11_DSA_Stack_Queue.ThucHanh.ThucHanh2;

public class GenericStackClient {
    private static void stackOfString(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " +stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("\n1.3. Size of stack after pop operations :" + stack.size());
    }
    private static void stackOfIntergers(){
        MyGenericStack <Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: "+ stack.size() );
        System.out.println("2.2 Pop elements from stack:");
        while (!stack.isEmpty()){
            System.out.println( stack.pop());
        }
        System.out.println("\n 3.3 Size of stack after pop operatios:" + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1 Stack of String");
        stackOfString();
        System.out.println("\n"+ "2. Stack of Integer");
         stackOfIntergers();
    }
}
