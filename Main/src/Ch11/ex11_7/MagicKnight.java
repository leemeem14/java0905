package Ch11.ex11_7;

public class MagicKnight extends Knight implements Magician{
    public int mp=100;
    public MagicKnight(String name) {
        super(name);
    }
    @Override
    public void magicShield() {
        System.out.printf("[%s]의 마법방어막!\n",name);
    }

    @Override
    public void teleport() {
        System.out.printf("[%s]의 순간이동!\n",name);
    }

    @Override
    public void slash() {
        System.out.printf("[%s]의 마력베기!\n",name);;
    }
}
