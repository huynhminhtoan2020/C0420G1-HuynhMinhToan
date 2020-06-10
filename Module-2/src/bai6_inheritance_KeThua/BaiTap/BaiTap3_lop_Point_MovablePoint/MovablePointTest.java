package bai6_inheritance_KeThua.BaiTap.BaiTap3_lop_Point_MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(2,3,4,5);
        System.out.println("Before Moving: ");
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println("After moving:");
        System.out.println(movablePoint);
    }
}
