package oct10;

public class NewCalc {
    // 강사님의 요구사항에 맞는 계산기 클래스를 작성한 코드
    // 덧셈, 뺄셈, 곱셈, 나눗셈이 가능해야 함
    // 사용할 연산자(+-*/)와 정수 2개를 입력하면 계산을 수행해야 함.

    // 생성자
    public NewCalc () {
    }

    // 메소드들
    void powerOn () {   // 전원 켜기
        System.out.println("전원을 켭니다.");
    }
    void powerOff () {  // 전원 끄기
        System.out.println("전원을 끕니다.");
    }
    double calculate (String operator, int a, int b) { // 계산하기
        double result = -1;

        switch(operator) {
            case "+" : result = a+b; break;
            case "-" : result = a-b; break;
            case "*" : result = a*b; break;
            case "/": result = (double)a/b;
        }

        return result;
    }
}
