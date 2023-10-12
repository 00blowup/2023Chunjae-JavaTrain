package oct04;

import java.util.Scanner;

public class Mul {
    public static void main(String[] args) {

        // 몇 단을 출력할지 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 단을 출력하시겠습니까? : ");
        int num = sc.nextInt();

        // 곱셈 결과를 저장할 변수
        int mul = 0;

        // mul에 num씩 9번을 덧셈하여 정답 계산
        for(int i=1; i<=9; i++){
            mul += num;
            System.out.printf("%3d x %3d = %3d \n", num, i, mul); // 세 자리로 정렬하여 출력
        }

        System.out.println(num + "단 출력이 완료되었습니다.");

        // Scanner close
        sc.close();
    }
}
