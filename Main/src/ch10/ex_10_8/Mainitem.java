package ch10.ex_10_8;

public class Mainitem {
    public static void main(String[] args) {
        Item item = new Item("지팡이",1000);
        System.out.println("아이템명: " + item.getName());
        System.out.println("가격: "+item.getPrice());

        Item item1 = new Item();
        System.out.println("아이템명: " + item1.getName());
        System.out.println("가격: "+item1.getPrice());

        Item item2 = new Item("다인슬레이프",10000,100);
        System.out.println("아이템명: " + item2.getName());
        System.out.println("가격: "+item2.getPrice());
        System.out.println("파워:"+item2.getPower());

    }
}
