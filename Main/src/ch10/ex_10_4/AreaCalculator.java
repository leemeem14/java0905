package ch10.ex_10_4;


import java.util.ArrayList;
public class AreaCalculator {
    public static void main(String[] args) {

        Square s = new Square();
        s.name= "정사각형";
        s.setLength(7);
        Triangle t = new Triangle();
        t.name= "삼각형";
        t.setBase(15);
        t.setHeight(9);
        Circle c = new Circle();
        c.name= "원";
        c.setRadius(15);
//        ArrayList<shape> arrList = new ArrayList<shape>();
//        arrList.add(s);
//        arrList.add(t);
//        arrList.add(c);
        shape[] arr = {s,t,c};

        viewShapes(arr);
    }
    public static void viewShapes(shape[] arr) {
        for (shape s : arr) {System.out.printf("%s의 면적은 %.2f㎠입니다.\n",s.name, s.area());}
    }
}
