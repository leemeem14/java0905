package ex8.ex8_1.ex8_6;
import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 정수값을 입력하세요:");
        int n1 = sc.nextInt();
        System.out.print("두번째 정수값을 입력하세요:");
        int n2 = sc.nextInt();
  System.out.printf("%d와(과) %d중에 더큰값 : %d\n",n1,n2,MyMath.max(n1,n2));
        System.out.printf("%d와(과) %d중에 더작은값 : %d",n1,n2,MyMath.min(n1,n2));
        sc.close();
    }
}
