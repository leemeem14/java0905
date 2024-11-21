package Ch12.ex12_1_2;

public class MainException {
    public static void main(String[] args) {
        String[] arr ={"봄","여름","가을","겨울"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+"  ");
        }
        System.out.println();
        for (String season: arr){
            System.out.print(season+ "  ");
        }
        System.out.println();
        try {
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("산술연산이 잘못됨(나누는수는 0은 안되여ㅎㅎ");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열의 인덱스 넘버가 너무 큰데여");
        }catch (Exception e){
            System.out.println("산술또는 배열과 관련되지않은 예외는 여기서!");
        }
        System.out.println(arr[2]);
        System.out.println("program ended.");
    }
}
