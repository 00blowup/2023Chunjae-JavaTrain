package oct04;

public class Star1 {
    // 각 줄에 1, 3, 5, 7, 5, 3, 1개의 별을 찍는 문제. 최초 풀이코드.
    public static void main(String[] args) {
        // 1~4번째 줄
        for(int i=1; i<=7; i +=2) {
            for(int j=0; j<(7-i)/2; j++) System.out.print(" "); // 왼쪽 공백 찍기
            for(int j=0; j<i; j++) System.out.print("*");       // 별 찍기
            System.out.println();
        }
        // 5~7번째 줄
        for(int i=5; i>=1; i -=2) {
            for(int j=0; j<(7-i)/2; j++) System.out.print(" "); // 왼쪽 공백 찍기
            for(int j=0; j<i; j++) System.out.print("*");       // 별 찍기
            System.out.println();
        }
    }
}
