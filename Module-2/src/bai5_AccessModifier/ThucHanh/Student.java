package bai5_AccessModifier.ThucHanh;

public class Student {
        private int rollno;
        private String name;
       private static String college = "BBDIT";
        Student(int r,String n) {
            rollno = r;
            name = n;
        }
    static void change (){
            college = "CODEGYM";
    }
    void display(){
        System.out.println(rollno+ " "+ name + " "+ college);
    }
    public static class TestStaticMethod{
        public static void main(String[] args) {
            Student.change();
            Student S1 = new Student(111, " Hoang");
            Student S2 = new Student(222,"Khanh");
            Student S3 = new Student(333,"Nam");
            S1.display();
            S2.display();
            S3.display();
        }
    }
}
