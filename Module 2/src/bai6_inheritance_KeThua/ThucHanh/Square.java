package bai6_inheritance_KeThua.ThucHanh;

public class Square extends Rectangle {
    private double side = 1.0;
    public Square(){
    }
    public Square(double side, String color, boolean filled) {
        super(side,side, color, filled);
    }
    public Square (double side){
        super(side,side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}'+
                super.toString();
    }
}

