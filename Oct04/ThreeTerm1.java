package Oct04;

public class ThreeTerm1 {
    public static void main(String[] args) {
        // 삼항연산자로 85점의 등급을 판별하는 코드.
        int score = 85;
        char grade = (score>90) ? 'A' : ( (score>80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
