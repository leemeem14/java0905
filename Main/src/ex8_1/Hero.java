package ex8_1;

public class Hero {
    String name;
    int power;
    int speed;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hero(String name, int power, int speed) {
        this.name = name;
        this.power = power;
        this.speed = speed;
    }
    public String toStr(){
        return String.format("ex8_1.Hero{Name: %s Power: %d Speed: %d}", name, power, speed);
    }
}
