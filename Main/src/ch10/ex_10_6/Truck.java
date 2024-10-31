package ch10.ex_10_6;

public class Truck extends Car {
    private double Payload;

    public double getPayload() {
        return Payload;
    }

    public void setPayload(double payload) {
        Payload = payload;
    }


    public Truck(String name,double Payload) {
        super(name);
        this.Payload = Payload;
        System.out.printf("적재량 : %.1f\n",Payload);
    }
    void move(){
        System.out.printf("[%s]가 이동합니다.\n",getName());
    }
    void load(){
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f 톤)\n",getName(),Payload);
    }
}
