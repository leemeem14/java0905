package ch10.Protected1;

public class Parent {
    String name;
    protected String id;

    protected void printprotected() {
        System.out.println("Protected 접근 제한자 패키지는 서로 다르지만 상관관계에 있는 부모의 멤버를 접근가능");
    }
    void printDefault() {
        System.out.println("Default 접근 제한자 패키지는 서로 다르면 상관관계에 있는 부모의 멤버를 접근불가");
    }
}
