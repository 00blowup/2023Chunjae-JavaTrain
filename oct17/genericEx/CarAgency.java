package oct17.genericEx;

public class CarAgency implements Rentable<Car> {
    // 제네릭 P에 Home을 넣음으로써 주택 대여용 클래스 작성

    @Override
    public Car rent() {
        return new Car();
    }
}
