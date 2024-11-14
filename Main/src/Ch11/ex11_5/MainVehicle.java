package Ch11.ex11_5;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();

        vehicle.horn();
        vehicle.move("이태원","동묘앞");
        System.out.println("*******************************************************************");
        Bicycle bicycle = new Bicycle();
        bicycle.horn();
        bicycle.move("한강진","이태원");//Vehicle 에 있는 move(default 메소드)
        Bicycle.stop("둥둥섬");
        System.out.println("********************************************");
        Vehicle vehicle1 = new Train();
        vehicle1.horn();//오버라이딩된 horn
        vehicle1.move("동묘앞역","망월사역");//Train의 오버라이딩된 move

        Vehicle.stop("의정부");
        System.out.println("******************************************");


    }
}
