package ex8_11;


 public class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30; // 최대 체력

    public Monster(String name) {
        this.name = name;
        this.hp = maxHp; // 생성 시 최대 체력으로 초기화
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void attack(Monster enemy) {
        int damage = (int) (Math.random() * 10) + 1; // 1~10 사이의 데미지
        enemy.setHp(enemy.getHp() - damage); // setter를 사용하여 attack으로 인한 맞기전 체력-데미지를 반영
        System.out.println(this.name + "가 " + enemy.getName() + "에게 " + damage + "의 데미지를 입혔습니다."+enemy.getName()+"의 남은체력은"+enemy.getHp());
    }

    public static void battle(Monster a, Monster b) {
        System.out.println(a.getName() + " vs " + b.getName() + " 전투 시작!");
        while (a.getHp() > 0 && b.getHp() > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b; // 랜덤으로 공격자 선택
            Monster defender = (attacker == a) ? b : a; // 공격자의 반대쪽이 방어자

            attacker.attack(defender); // 공격자가 방어자한테 공격
        }

        if (a.getHp() > 0) {
            System.out.println(a.getName() + " 승리!"); //a의 승리
        } else {
            System.out.println(b.getName() + " 승리!"); //b의 승리
        }
    }
}