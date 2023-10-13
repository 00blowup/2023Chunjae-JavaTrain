package oct13.anonymousEx;

public class Car {
    // 익명 객체 실습을 위한 자동차 클래스
    private Tire tire1 = new Tire();

    // 필드에 익명 자식 객체 대입
    private Tire tire2 = new Tire() {
        @Override
        public void roll() {
            System.out.println("익명 자식 1! 구른다!");
        }
    };

    // 위에서 이미 정의한 Tire 필드들을 사용하는 메소드
    public void run1() {
        tire1.roll();
        tire2.roll();
    }

    // 메소드 내부에서 새롭게 익명 Tire 객체를 생성하는 메소드 (이때 roll()은 오버라이드)
    // 오버라이드는 꼭 필요해서 한 게 아니라, 다른 타이어와 구별하려고 한 것이다.
    public void run2() {
        Tire tire = new Tire() {
            @Override
            public void roll() {
                System.out.println("익명 자식 2! 구른다!");
            }
        };
        tire.roll();    // 오버라이드한 roll()을 실행
    }

    // 외부에서 Tire 객체를 매개변수로 받아와서 roll()을 실행하는 메소드
    public void run3 (Tire tire) {
        tire.roll();
    }
}
