package oct13.anonymousEx;

public class CarEx {
    // 익명 객체 실습을 위한 실행 클래스
    public static void main(String[] args) {
        // Car 객체 생성
        Car car = new Car();

        car.run1();

        car.run2();

        car.run3(
                new Tire() {
                    @Override
                    public void roll() {
                        System.out.println("익명 자식 3! 구른다!");
                    }
                }
        );
    }
}
