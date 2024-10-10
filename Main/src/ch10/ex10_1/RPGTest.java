package ch10.ex10_1;

public class RPGTest {
    public static void main(String[] args) {
        wizard w = new wizard();
        w.name="gandalf";
        w.Hp=100;
        w.Mp=80;
        w.Punch();
        w.Fireball();

        Knight k = new Knight();
        k.name="Ashen One";
        k.Hp=150;
        k.Stamina=100;
        k.Punch();
        k.Slash();
    }
}
