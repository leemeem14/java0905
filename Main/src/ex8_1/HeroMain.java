package ex8_1;

public class HeroMain {
    public static void main(String[] args) {
        Hero ironMan= new Hero("아이언맨",100,120);
        Hero hulk= new Hero("헐크",200,80);

        System.out.println(ironMan.toStr());
        System.out.println(hulk.toStr());
    }
}