package ch10.ex_10_6;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
        System.out.printf("모델명 : %s\n",name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Move() {
        System.out.printf("[%s]가 이동중입니다.\n",name);
    }
}
