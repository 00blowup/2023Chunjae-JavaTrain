package Oct04;

public class ThreeTerm3 {
    public static void main(String[] args) {
        // ThreeTerm1의 코드를 if 문으로 바꾼 코드.
        int score = 85;
        char grade;
        if(score>90) grade = 'A';
        else if (score>80) grade = 'B';
        else grade = 'C';

        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
