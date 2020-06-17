package bai6_inheritance_KeThua.BaiTap.BaiTap2_Lop_Point2D_Point3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public point2D() {
    }

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    //
//    @Override
//    public String toString() {
//        return Arrays.toString(getXY());
//    }
}