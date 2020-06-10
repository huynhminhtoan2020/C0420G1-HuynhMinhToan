package bai5_AccessModifier.ThucHanh;

    public class demo {
        static public int X = 2;

        public static void main(String[] args) {
            demo o1 = new demo();
            demo o2 = new demo();
            o2.X = 5;
            System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, demo.X);
        }
    }