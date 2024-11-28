package Ch12.ex12_4;

import java.util.ArrayList;
// 참조변수를 선언만 하고 객체 참조값을 대입하지않으면 NullPointerException이 발생한다.
public class NullPointExceptionTest {
    ArrayList<String> listNames = new ArrayList<String>();
    public void addName(String name){
        listNames.add(name);
    }
    public void PrintAllNames(){
        for (String name: listNames){
            System.out.println(name);
        }
    }
}
