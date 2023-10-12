package oct10;

public class CarEx {
    public static void main(String[] args) {

        // Car 객체 생성
        Car myCar = new Car();

        // myCar의 필드값 읽어보기. Car 클래스 내부에서 값을 지정했기 때문에, 그 값이 출력될 것이다.
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
        System.out.println();

    }
}
