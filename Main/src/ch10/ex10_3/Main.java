package ch10.ex10_3;

public class Main {
    public static void main(String[] args) {
        Archer a = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer a2 = new MasterArcher();
        Archer a3 = (Archer) new MasterArcher();
        a.shoot(); //궁수
        ma.shoot();//달인 궁수
        a2.shoot();//달인 궁수
        a3.shoot();//달인 궁수
    }
}
