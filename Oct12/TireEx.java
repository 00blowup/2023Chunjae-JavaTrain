package Oct12;

public class TireEx {
    // 다형성 예제를 실습하기 위한 실행 클래스
    public static void main(String[] args) {
        // 자동자 인스턴스 생성
        Car myCar = new Car();

        // 달려보기. 타이어의 기본값은 모두 한국타이어.
        myCar.run();

        // 타이어를 모두 금호타이어로 교체
        myCar.tire1 = new TireGeumho();
        myCar.tire2 = new TireGeumho();

        // 다시 달려보기.
        myCar.run();

    }
}
