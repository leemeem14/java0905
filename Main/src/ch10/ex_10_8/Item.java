package ch10.ex_10_8;

public class Item {
    private String name;
    private int price;
    private int power;

    //필드명과 지역변수(매개변수)의 이름이 같은경우 구별하는 용도로 this 키워드를 사용
    public Item(String name){
        this.name = name;
    }

    public Item(String name, int price){
        this(name);
        this.price = price;
    }

    public Item(String name, int price, int power) {
        this(name,price);
        this.power = power;
    }
    public Item(){
        this("은단검",6000);
        System.out.println("기본 생성자 호출됨");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
