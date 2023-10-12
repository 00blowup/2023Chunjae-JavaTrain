package oct10;

public class Calculator {
    // 필드는 없고 메소드만 있는 클래스 실습

    // 생성자
    public Calculator () {
    }

    // 메소드들
    void powerOn () {
        System.out.println("전원을 켭니다.");
    }
    void powerOff () {
        System.out.println("전원을 끕니다.");
    }
    int add (int a, int b) {
        return a+b;
    }
    int sub (int a, int b) {
        return a-b;
    }
}
