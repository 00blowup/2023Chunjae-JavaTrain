package oct04;

public class Star2_2 {
    // 백준 2442번 숏코딩 정답코드.
    // 응용하여 마름모로 바꾸려고 하였으나 코드를 완전히 이해하지 못하여 보류함.

    /*
    이하의 주석은 코드를 분석하며 적은 메모임.
     */

    // for문의 () 내부에 쉼표 및 후위연산자를 사용
    // 1) 초기치: int i를 0으로 초기화, int n을 Scanner로 읽어오기
    // 2) 조건식: i가 n보다 작을때까지 반복하되, i에 후위연산자 추가
    // 3) 증감식: 조건식에서 i에 후위연산자가 있으므로 생략

    // 삼항연산자 이용
    //
    public static void main(String[] args) {
        String t="";
        for(int i=0,n=new java.util.Scanner(System.in).nextInt();i++<n;)
            System.out.printf("%"+(n>1?n-1:"")+"s%s\n",t,t+="*");
    }
}
