package Ch11.ex11_7;

public class MainGameSim {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight genji = new MagicKnight("겐지");

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1 = (HolyKnight)uther;
        Healer healer2 = new HolyKnight("우서 동생");
        healer1.heal();
        healer1.recovery();
        //healer1.slash(); healer 인터페이스의 참조 변수이므로 인터페이스로 구현된 메소드만 호출할수있어서 slash는 사용불가함

        Magician magician1 = (Magician)genji;
        magician1.magicShield();
        magician1.teleport();
        //magician1.slash();

        MagicKnight magicKnight = new MagicKnight("한조");
         magicKnight.magicShield();
         magicKnight.teleport();
         magicKnight.slash();
    }
}
