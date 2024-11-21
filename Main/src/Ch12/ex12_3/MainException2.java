package Ch12.ex12_3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MainException2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("* 나누는 수를 입력하세요:");
            int dividend = s.nextInt();
            double result = 30 / dividend;
            System.out.printf("%d을 %d로 나눈 수의 결과는 %.2f\n",30,dividend,result);
        }catch (InputMismatchException e) {
            System.out.println("정수로만 입력하람마-! 죽는담마-!");
        }catch (ArithmeticException e) {
            System.out.println("나누는 수를 0으로 입력하지 말람마-! 죽는담마-!");
        }

        System.out.println("꺼지람마-!");
        s.close();
    }
}
