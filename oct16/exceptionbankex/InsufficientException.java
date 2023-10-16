package oct16.exceptionbankex;

public class InsufficientException extends Exception {
    // 사용자 정의 예외 실습을 위한 예외 클래스

    // 생성자 (메시지를 받아옴)
    public InsufficientException (String message) {
        super(message);
    }
}
