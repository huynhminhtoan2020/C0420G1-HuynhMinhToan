package bai6_inheritance_KeThua.BaiTap;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI*Math.pow(getRadius(),2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "\n"+
                "height=" + height + "\n"+
                "Volume =" + getVolume() +"\n"+
                super.toString()+ "\n"+
                '}';
    }
}
