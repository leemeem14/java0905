package Ch12.ex12_6;

import java.util.Scanner;

public class MainMyAgeException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("입력하다 당신의 나이: ");
        int age = s.nextInt();
        if(age < 0 || age > 150){
            try {
                throw  new MyAgeException("나이 오직 가능하다 0세부터 150세 사이까지.");

            } catch (MyAgeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.printf("당신 나이는 %d이다.",age);
        }
        s.close();
    }
}
