package Ch11.ex11_5;

public class Bicycle implements Vehicle{
    @Override
    public void horn() {
        System.out.println("따르릉 따르릉");
    }
    //인터페이스에 정의된 static메소드 stop()은 오버라이딩될수 없다.
    //인터페이스의 static 오바라이딩은 불가하지만 정의는 가능함
    //사용할 때는 Bicycle.stop()으로 사용해야함
    static public void stop(String place){
        System.out.println(place+"에 멈춘다.");
    }
}
