package ex8.ex8_1.ex8_9;

public class CoffeeMain {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메",3000);
        System.out.printf("%s(%d원) ->",c.getName(),c.getPrice());
        c.setPrice(c.getPrice()+500);
        System.out.printf("인상후: %s(%d원)",c.getName(),c.getPrice());
    }
}
