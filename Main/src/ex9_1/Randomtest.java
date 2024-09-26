package ex9_1;

import java.util.Random;

public class Randomtest {
    public static void main(String[] args) {
        Random rand = new Random();
        int n=10;

        System.out.printf("임의의 정수: %d\n", rand.nextInt());
        System.out.printf("0이상 N(%d)미만의 임의 정수 : %d\n",n,rand.nextInt(n));
        System.out.printf("임의의 실수: %f\n", rand.nextDouble());
        System.out.printf("임의의 참/거짓: %b\n", rand.nextBoolean());
    }
}
