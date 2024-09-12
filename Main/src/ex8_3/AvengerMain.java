package ex8_3;

public class AvengerMain {
    public static void main(String[] args) {
        Avenger Thor = new Avenger("토르",150);
        Avenger Thanos = new Avenger("타노스",160);
        Thor.punch(Thanos);
        Thor.punch(Thanos);
        Thanos.punch(Thor);
    }
}
