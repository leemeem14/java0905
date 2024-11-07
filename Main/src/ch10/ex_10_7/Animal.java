package ch10.ex_10_7;

// 추상클래스(자식클래스의 표준화{특정기능을 반드시 갖도록}를 위해 사용)
abstract public class Animal {
    private String name;
    //추상 메소드(후 다른 클래스에서 구현화 해야 사용됨)
    public abstract void eat(String food);
    public abstract void cry(String sound);
    public void sleep(int hours){
        System.out.println(hours+"시간 동안 잔다.");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
