package oct13.exceptionEx;

import java.sql.SQLOutput;

public class ExceptionHandlingExample {
    // Exception 핸들링을 실습하기 위한 코드
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 : " + result);
        } catch (NullPointerException e) {
            System.out.println("NullPointException 발생! 입력값이 null입니다!");
        }

    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");

        // 함수 안에서 Exception catch
        printLength("This is Java");

        printLength(null);



        // 다른 Exception 실험
        String[] arr = new String[1];

        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(arr[0]);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n[프로그램 종료]");
    }
}
