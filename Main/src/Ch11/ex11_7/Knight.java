package Ch11.ex11_7;

public class Knight {
    public String name;
    public int hp=100;

    public Knight(String name) {
        this.name = name;
    }
    public void slash(){
        System.out.println(name+"의 베기");
    }
}
