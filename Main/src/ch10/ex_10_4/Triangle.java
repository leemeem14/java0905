package ch10.ex_10_4;

public class Triangle extends shape {
    private int base;
    private int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    double area(){
        double result = (base*height)/2.0;
        return result;
    }
}
