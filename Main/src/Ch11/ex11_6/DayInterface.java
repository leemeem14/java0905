package Ch11.ex11_6;

public interface DayInterface {
    // 인터페이스내에선 상수만 사용되서 public static final은 생략이 가능하다.
    //final은 처음에 초기화를 한 후에는 다른값으로 변경하지 못하게함(값이 고정됨)
    //static은 인터페이스명을 .앞에 붙여서 상수를 사용할수있게 함
    String MONDAY = "월요일";
    public static final String TUESDAY = "화요일";

}
