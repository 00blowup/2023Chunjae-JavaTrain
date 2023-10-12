package oct04;

import java.util.Scanner;

public class Star2 {

    public static void main(String[] args) {
        // 홀수를 입력받아 그 크기만큼의 가운데정렬 마름모를 찍는 문제. 최초 풀이코드.
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수를 입력해주세요 : ");
        int n = sc.nextInt();

        // 윗부분 (1부터 n까지)
        for(int i=1; i<=n; i +=2) {
            for(int j=0; j<(7-i)/2; j++) System.out.print(" "); // 왼쪽 공백
            for(int j=0; j<i; j++) System.out.print("*");       // 별
            System.out.println();                               // 줄바꿈
        }
        // 아랫부분 (n-2부터 1까지)
        for(int i=n-2; i>=1; i -=2) {
            for(int j=0; j<(7-i)/2; j++) System.out.print(" "); // 왼쪽 공백
            for(int j=0; j<i; j++) System.out.print("*");       // 별
            System.out.println();                               // 줄바꿈
        }

        sc.close();
    }

}
