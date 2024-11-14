package Ch11.ex11_1_2_3;

public class MainiPhone {
    public static void main(String[] args) {
        //업캐스팅된 경우는 참조 변수는 부모의 것을 사용할수있고, 자식의 것은 오버라이딩 된것만 사용할수있다.
        Phone p = new iPhone();
        p.callPhone("010-3333-7777");
        p.receivePhone("02-111-5555");
        System.out.println("제조사명"+Phone.PRODUCT_NAME);



        iPhone iPhone = new iPhone();
        iPhone.callPhone("02-777-1111");
        iPhone.playMusic("APT.featuring bruno Mars");
        iPhone.sendAirdrop("사진");
        iPhone.sendMessage("BRUH");

        Alarm alarm = iPhone;
        alarm.beep();
        alarm.playMusic("asdf");
        //Alarm alarm1 = p;//업캐스팅이 아직 안됬을 경우에만 업캐스팅이 가능함

    }
}
