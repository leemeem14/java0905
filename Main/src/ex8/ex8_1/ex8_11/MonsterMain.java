package ex8.ex8_1.ex8_11;

public class MonsterMain {
    public static void main(String[] args) {
        Monster orc = new Monster("바삭 촉촉 가로쉬");
        Monster sans = new Monster("와! 샌즈");
        Monster.battle(orc,sans);
    }
}
