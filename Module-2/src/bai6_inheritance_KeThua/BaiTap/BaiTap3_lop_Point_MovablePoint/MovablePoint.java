package bai6_inheritance_KeThua.BaiTap.BaiTap3_lop_Point_MovablePoint;

import java.util.Arrays;

public class MovablePoint extends Point {
  private float xSpeed = 0.0f;
  private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed (){
        return new float[]{xSpeed,ySpeed};
    }
    public void move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }

    @Override
    public String toString() {
        return "(x,y)="+super.toString()+"\n"+
                "speed = (xSpeed,ySpeed)= "+ Arrays.toString(getSpeed());
    }
}
