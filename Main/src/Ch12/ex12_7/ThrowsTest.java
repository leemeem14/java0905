package Ch12.ex12_7;

public class ThrowsTest {
    public void test1()throws MyAgeException{
        System.out.println("test1 called");
        test2();
    }

    public void test2() throws MyAgeException{
        System.out.println("test2 called");
        throw new MyAgeException("나이 잘못 입력되다.");
    }
}
