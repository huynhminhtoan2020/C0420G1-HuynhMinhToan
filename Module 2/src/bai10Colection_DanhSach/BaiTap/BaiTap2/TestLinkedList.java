package bai10Colection_DanhSach.BaiTap.BaiTap2;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int Id;
            private String Name;

            public Student() {
            }

            public Student(int id, String name) {
                this.Id = id;
                this.Name = name;
            }

            public int getId() {
                return Id;
            }

            public void setId(int id) {
                this.Id = id;
            }

            public String getName() {
                return Name;
            }

            public void setName(String name) {
                this.Name = name;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1,"Toan");
        Student student2 = new Student(1,"Thien");
        Student student3 = new Student(1,"so 3");
        Student student4 = new Student(1,"so 4");
        Student student5 = new Student(1,"so 5");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(1, student4);
     //   myLinkedList.remove(2);
     //   myLinkedList.remove(student4);
      //  MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

      //  for (int i =0; i<myLinkedList.size();i++){
           // Student student = (Student) myLinkedList.get(i);
         //   Student student = (Student) cloneLinkedList.get(i);
           // System.out.println(student.getName());
      //  myLinkedList.constrains(student2);
       // System.out.println(myLinkedList.constrains(student5));

      //  }
        System.out.println(myLinkedList.indexOf(student3));
    }
}
