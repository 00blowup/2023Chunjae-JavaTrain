package oct05;

import java.util.Scanner;

public class CalcGrade_ElseIf {
    // 점수 구간에 따라 학점 등급을 나누는 코드 (else if 사용)
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

        // 받은 입력값을 기준으로 학점 계산
        if(score > 100 || score < 0) {  // 점수가 0미만 또는 100 초과일 경우를 처리
            System.out.print("입력값이 0~100 사이의 정수가 아닙니다.");
            System.exit(0);
        }
        else if (score >= 90) grade = "A";
        else if (score >= 80) grade = "B";
        else if (score >= 70) grade = "C";
        else if (score >= 60) grade = "D";
        else grade = "F";

        // 결과 출력
        System.out.print("학점은 " + grade + "입니다.");

        // Scanner close
        sc.close();
    }
}
