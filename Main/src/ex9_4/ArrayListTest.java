package ex9_4;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<String>();

        //Element 추가
        names.add("lee");
        names.add("Park");
        names.add("Kim");
        names.add("Choi");

        //Element 변경
        names.set(0,"Bae");

        //Element 삭제
        String removed = names.remove(2);
        System.out.printf("삭제된 요소: %s\n",removed);

        for(int i=0;i<names.size();i++){
            System.out.printf("%s ",names.get(i));
        }
    }
}
