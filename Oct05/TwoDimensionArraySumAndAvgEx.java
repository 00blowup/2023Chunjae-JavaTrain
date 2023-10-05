package Oct05;

import java.util.Scanner;

public class TwoDimensionArraySumAndAvgEx {
    // 2차원 배열의 모든 요소 & 행별 평균 & 모든 요소의 총합을 출력하는 코드
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2차원 배열 생성
        int[][] arr = new int[3][4];

        // 2차원 배열의 요소들을 입력받기
        for(int i=0; i<3; i++) {
            System.out.println((i+1) + "번째 행의 수 4개를 입력하세요.");
            for(int j=0; j<4; j++) {
                System.out.print((i+1) + "번째 행의 " + (j+1) + "번째 수 : ");
                arr[i][j] = sc.nextInt();
            }
        }

        int[] sums = new int[3];    // 첫째, 둘째, 셋째 행의 총합을 저장할 정수형 배열

        // 모든 요소 & 행별 평균 & 모든 요소 총합 출력
        System.out.println("---모든 요소 출력---");
        for(int i=0; i<3; i++) {
            System.out.print((i+1) + "번째 행: ");
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j] + " ");
                sums[i] += arr[i][j];
            }
            System.out.println();
        }

        System.out.println("---행별 평균 출력---");
        for(int i=0; i<3; i++) System.out.println((i+1) + "번째 행의 평균: " + (int)(sums[i]/3));

        System.out.println("---모든 요소 총합 출력---");
        System.out.println("모든 요소의 총합: " + (sums[0]+sums[1]+sums[2]));


        // Scanner close
        sc.close();
    }
}
