package bai6_inheritance_KeThua.BaiTap.BaiTap3_lop_Point_MovablePoint;

import java.util.Arrays;

public class Point {
    private float x = 0.0f,y=0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
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
    public void setXY(float x, float y){
        this.x =x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{x,y};

    }

    @Override
    public String toString() {
        return Arrays.toString(getXY());
    }
}
