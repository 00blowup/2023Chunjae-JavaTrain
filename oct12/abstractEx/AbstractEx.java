package oct12.abstractEx;

public class AbstractEx {
    // abstract 실습을 위한 실행 클래스
    public static void main(String[] args) {

//        AbstractClass obj = new AbstractClass(); <- abstract 클래스는 이런 식으로 인스턴스를 만들 수 없다.

        // 이렇게 abstract 클래스를 구체화한 자식 클래스를 이용하거나
        AbstractActual abstractActual = new AbstractActual("James");

        // 이렇게 즉석에서 모든 메소드를 override해야 인스턴스를 만들 수 있다.
        AbstractClass overrideClass = new AbstractClass("Jean") {
            @Override
            void turnOn() {
                super.turnOn();
            }

            @Override
            void turnOff() {
                super.turnOff();
            }
        };

        // 인스턴스 사용해보기
        abstractActual.turnOn();
        abstractActual.turnOff();
        abstractActual.doSearch();    // AbstractClass obj1 = new ActualClass("James"); 라고 했다면 이 메소드는 쓸 수 없다.

        overrideClass.turnOn();
        overrideClass.turnOff();
//        overrideClass.doSearch();  // 이 메소드는 자식에만 있으므로 쓸 수 없다.



    }
}
