package Oct10;

public class CarEx {
    public static void main(String[] args) {

        // Car 객체 생성
        Car myCar = new Car();

        // myCar의 필드값 읽어보기. String은 null, boolean은 false, int는 0이 나올 것.
        // 클래스는 스택이 아니라 힙 영역에 들어가기 때문에, 초기화를 안 해도 객체 생성과 동시에 기본값이 들어간다.
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);
        System.out.println();

        // myCar의 필드값 설정
        myCar.model = "TrailBlazer";
        myCar.start = false;
        myCar.speed = 100;

        // myCar의 필드값 읽어보기. 이제 제대로 된 값이 나올 것.
        System.out.println("모델명: " + myCar.model);
        System.out.println("시동여부: " + myCar.start);
        System.out.println("현재속도: " + myCar.speed);

    }
}
