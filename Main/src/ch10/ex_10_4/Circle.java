package ch10.ex_10_4;
public class Circle extends shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
}
