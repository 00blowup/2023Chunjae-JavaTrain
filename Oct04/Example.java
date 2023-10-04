package Oct04;

public class Example {
    // 카페에 게재된 선배의 코드. 구구단을 모아서 한 화면에 많이 출력되도록 함.
    public static void main(String[] args) {
        for(int k=0; k<2; k++){
            for(int j=1; j<=9; j++) {
                for(int i=2+(k*4); i<=5+(k*4); i++) {
                    System.out.printf("%d x %d = %2d ", i, j, i*j);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
