package oct04;

public class ThreeTerm2 {
    public static void main(String[] args) {
        // Scanner로 입력받은 수의 등급을 판별하는 코드.
        int score = new java.util.Scanner(System.in).nextInt();
        char grade = (score>90) ? 'A' : ( (score>80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
