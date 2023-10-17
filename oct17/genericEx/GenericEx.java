package oct17.genericEx;

public class GenericEx {
    // 제네릭 실습을 위한 실행 클래스
    public static void main(String[] args) {

        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car car = carAgency.rent();
        car.run();
    }
}
