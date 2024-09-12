package ex8_2;

public class Drink {
    String name;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    Drink(String n, int p) {
        name = n;
        price = p;

    }
    public Drink() {
        System.out.println("Drink constructor 호출");
    }
}
