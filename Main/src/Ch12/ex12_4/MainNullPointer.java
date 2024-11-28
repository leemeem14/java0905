package Ch12.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
        NullPointExceptionTest nullTest = new NullPointExceptionTest();

        nullTest.addName("엄준식");
        nullTest.addName("엄복동");

        nullTest.PrintAllNames();
    }
}
