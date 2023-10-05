package Oct05;

import java.util.Scanner;

public class CalcGrade_SwitchCase {
    // 점수 구간에 따라 학점 등급을 나누는 코드 (switch-case 사용)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = -1; // 점수를 저장할 변수
        String grade = "";  // 학점을 저장할 변수

        // score 값을 받아오며, 올바르지 않은 형식의 입력을 예외 처리
        try{
            score = sc.nextInt();
        } catch (Exception e){
            System.out.println("입력값의 형식이 올바르지 않습니다.");
            System.exit(0);
        }

        int div = score/10;

        // 받은 입력값을 기준으로 학점 계산
        if(score > 100 || score < 0) {  // 점수가 0미만 또는 100 초과일 경우를 처리
            System.out.print("입력값이 0~100 사이의 정수가 아닙니다.");
            System.exit(0);
        }
        switch (div) {
            case 9 : grade = "A"; break;
            case 8 : grade = "B"; break;
            case 7 : grade = "C"; break;
            case 6 : grade = "D"; break;
            default: grade = "F"; break;
        }

        // 결과 출력
        System.out.print("학점은 " + grade + "입니다.");

        // Scanner close
        sc.close();
    }
}
