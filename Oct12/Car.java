package Oct12;

public class Car {
    // 다형성 예제를 실습하기 위한 자동차 클래스
    // 필드
    Tire tire1 = new TireHankook();
    Tire tire2 = new TireHankook();

    // 메소드
    void run() {
        tire1.roll();
        tire2.roll();
    }

}
