package Oct05;

import java.util.Scanner;

public class OneDimensionArraySumAndAvgEx {
    // 배열에 들어있는 정수의 평균을 구하고, 평균의 총합을 출력하는 코드
    public static void main(String[] args) {
        int[] a = new int[3];
        int[] b = new int[3];
        int[] c = new int[3];

        Scanner sc = new Scanner(System.in);

        // 각 배열에 저장할 정수 받아오기
        System.out.println("배열 a에 저장될 정수 3개를 입력하세요.");
        System.out.print("첫 번째 수: ");
        a[0] = sc.nextInt();
        System.out.print("두 번째 수: ");
        a[1] = sc.nextInt();
        System.out.print("세 번째 수: ");
        a[2] = sc.nextInt();

        System.out.println("배열 b에 저장될 정수 3개를 입력하세요.");
        System.out.print("첫 번째 수: ");
        b[0] = sc.nextInt();
        System.out.print("두 번째 수: ");
        b[1] = sc.nextInt();
        System.out.print("세 번째 수: ");
        b[2] = sc.nextInt();

        System.out.println("배열 c에 저장될 정수 3개를 입력하세요.");
        System.out.print("첫 번째 수: ");
        c[0] = sc.nextInt();
        System.out.print("두 번째 수: ");
        c[1] = sc.nextInt();
        System.out.print("세 번째 수: ");
        c[2] = sc.nextInt();

        // 각 배열 평균 및 평균의 총합 구하여 출력
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for(int n : a) sumA += n;
        for(int n : b) sumB += n;
        for(int n : c) sumC += n;

        System.out.println("총합: " + (sumA+sumB+sumC));
        System.out.println("배열 a의 평균: " + (int)(sumA/3));
        System.out.println("배열 b의 평균: " + (int)(sumB/3));
        System.out.println("배열 c의 평균: " + (int)(sumC/3));

        sc.close();

    }
}
