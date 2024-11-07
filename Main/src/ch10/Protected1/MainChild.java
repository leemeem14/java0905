package ch10.Protected1;

import ch10.Protected1.test.Child;

public class MainChild {
    public static void main(String[] args) {
        Child c = new Child();
        c.testPro();
        System.out.println("Parent Id는 "+ c.id);
    }
}
