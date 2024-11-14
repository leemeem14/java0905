package Ch11.ex11_1_2_3;

public interface Phone {
    String PRODUCT_NAME = "Apple";
    //인터페이스에는 상수, 추상 메소드,디폴트 메소드 등을 사용할수 있다.
    //상수는 final과static을 생략 가능하다.
    public abstract void callPhone(String phoneNumber);
    //추상메소드는 public, abstract를 생략가능
    void receivePhone(String phoneNumber);
}
