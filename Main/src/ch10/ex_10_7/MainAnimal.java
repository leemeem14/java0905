package ch10.ex_10_7;

public class MainAnimal {
    public static void main(String[] args) {
        //추상 클래스는 new연산자로 객체 생성이 불가능!
        //Animal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("말티즈");
        dog.eat("사료");
        dog.cry("멈머");
        dog.sleep(5);
        dog.wag();

        cat.setName("페르시안");
        cat.eat("참치");
        cat.cry("냥냐");
        cat.sleep(5);
        cat.grooming();

        //업캐스팅을 하면 부모 클래스의 모든 멤버는 사용가능,
        //하지만 자식클래스의 멤버는 부모 클래스의 메소드를 오버라이딩 된것만 사용가능
        Animal animal = new Dog();

    }
}
