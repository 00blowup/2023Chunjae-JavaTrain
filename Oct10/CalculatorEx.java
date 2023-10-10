package Oct10;

public class CalculatorEx {
    public static void main(String[] args) {
        // Calculator 객체를 사용해보는 코드
        Calculator calc = new Calculator();

        // 전원 켜기
        calc.powerOn();
        // 덧셈 해보기
        System.out.println("1 더하기 2는? " + calc.add(1, 2));
        // 뺄셈 해보기
        System.out.println("5 빼기 3은? " + calc.sub(5, 3));
        // 전원 끄기
        calc.powerOff();
    }
}
