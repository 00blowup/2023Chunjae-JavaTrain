package oct13.exceptionEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {
    // throws를 사용하여 자신을 호출한 곳으로 예외 처리를 떠넘기는 실습을 위한 코드
    public static void main(String[] args) {
        try {
            getIntInput();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException 발생!");
        }
    }

    static void getIntInput() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.close();
    }
}
