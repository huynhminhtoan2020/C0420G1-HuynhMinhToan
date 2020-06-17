package bai10Colection_DanhSach.BaiTap.BaiTap1;

public class TestMyList {
    public static class Student {
        private int ID;
        private String Name;

        public Student() {
        }

        public Student(int ID, String name) {
            this.ID = ID;
            this.Name = name;
        }

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            this.Name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Tao");
        Student b = new Student(2, "Huynh");
        Student c = new Student(3, "Hong");
        Student d = new Student(4, "Thuong");
        Student e = new Student(5, "Huong");
        Student f = new Student(5, "number2");
        Mylist<Student> studentMylist = new Mylist<>();
        studentMylist.add(a);
        studentMylist.add(b);
        studentMylist.add(c);
        studentMylist.add(d);
        studentMylist.add(e);
        studentMylist.add(f,2);
      //  studentMylist.clear();
        studentMylist.size();
//        for (int i = 0; i < studentMylist.size(); i++) {
//            Student student = (Student) studentMylist.elements[i];
//            System.out.println(student.getID());
//            System.out.println(student.getName());
//            System.out.println(studentMylist.size());
//        }
        System.out.println(studentMylist.size());
    }
}
