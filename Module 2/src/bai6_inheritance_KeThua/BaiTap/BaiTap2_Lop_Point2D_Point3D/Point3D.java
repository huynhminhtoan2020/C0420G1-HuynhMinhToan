package bai6_inheritance_KeThua.BaiTap.BaiTap2_Lop_Point2D_Point3D;

import java.util.Arrays;

public class Point3D extends point2D {
    private float z = 0.0f;
    public Point3D(float z) {
        this.z = z;
    }
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ(){
        return z;
    }
    public void setZ(){
        this.z = z;
    }
    public float [] getXYZ (){
        return new float[]  {getX(),getY(),getZ()};
    }
    public void setXYZ (float x, float y, float z){
        super.getXY();
        this.z = z;
    }

    @Override
    public String toString() {
        return Arrays.toString(getXYZ());
    }
}
