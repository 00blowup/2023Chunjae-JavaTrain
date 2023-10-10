package Oct10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewCalcEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NewCalc calc = new NewCalc();

        calc.powerOn();

        // 연산자 입력받기
        System.out.print("사용할 연산자를 입력하세요(+ , - , * , / 중 하나): ");
        String operator = sc.next();
        // 연산자가 +-*/ 중 하나가 아닐 경우 종료
        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.println("잘못된 연산자입니다. 계산기를 종료합니다.");
            calc.powerOff();
            System.exit(0);
        }

        int a = -1;
        int b = -1;

        // 정수 2개 입력받기
        try{
            System.out.println("사용할 정수 2개를 입력하세요.");
            System.out.print("정수 1: ");
            a = sc.nextInt();
            System.out.print("정수 2: ");
            b = sc.nextInt();
        } catch (InputMismatchException e) {    // 정수가 아닌 값을 입력했을 경우
            System.out.println("잘못된 입력입니다. 계산기를 종료합니다.");
            calc.powerOff();
            System.exit(0);
        }

        // 입력이 문제 없이 완료되었다면 계산 수행 후 결과 출력
        System.out.printf("계산 결과: %.2f", calc.calculate(operator, a, b));

        // Scanner close
        sc.close();

    }
}
