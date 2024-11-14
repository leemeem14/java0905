package Ch11.ex11_1_2_3;

public class iPhone implements Phone, Alarm, Message {
    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle+" 음악을"+PRODUCT_NAME+"Music으로 재생한다");
    }

    @Override
    public void beep() {
        System.out.println(" 비프음을 재생한다");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content+" 메세지를 전송한다");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content+" 메세지를 받는다");
    }

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println(phoneNumber+" 로 전화를건다");
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println(phoneNumber+" 의 전화를 받는다");
    }
    public void sendAirdrop(String content) {
        System.out.println("Airdrop으로"+content+"를 공유한다.");
    }
}
