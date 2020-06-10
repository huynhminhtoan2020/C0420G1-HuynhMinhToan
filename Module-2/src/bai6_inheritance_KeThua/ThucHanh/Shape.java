package bai6_inheritance_KeThua.ThucHanh;

public class Shape {
    private String coler = "green";
    private  boolean filled = true;
    public Shape(){
    }
    public Shape(String coler, boolean filled) {
        this.coler = coler;
        this.filled = filled;
    }

    public String getColer() {
        return coler;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with {" +
                "coler='" + coler + '\'' +
                "and filled=" + filled +
                '}';
    }
}


