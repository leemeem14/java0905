package ch10.ex10_2;

import java.awt.*;
import java.util.ArrayList;

public class MainShape {
    public static void main(String[] args) {



    Square s = new Square();
    s.name = "Square";
    Circle c=new Circle();
    c.name = "Circle";
    Triangle t=new Triangle();
    t.name = "Triangle";

        ArrayList<Shape> shapeList = new ArrayList<Shape>();
        shapeList.add(s);
        shapeList.add(c);
        shapeList.add(t);
        for(int i=0;i<shapeList.size();i++){
            System.out.printf("인덱스 번호 %d번의 도형이름: %s\n",1,shapeList.get(i).name);
        }
    }
}
