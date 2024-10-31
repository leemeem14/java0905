package ch10.ex_10_4;

public class Square extends shape{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    double area(){
        double result = Math.pow(length, 2);
        return result;
    }
}
