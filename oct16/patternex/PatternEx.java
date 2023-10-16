package oct16.patternex;

import java.util.regex.Pattern;

public class PatternEx {
    // 정규표현식 실습을 위한 실행 클래스

    public static void main(String[] args) {
        String regExp1 = "(02|010)-\\d{3,4}-\\d{4}";
        String data1 = "010-123-4567";

        boolean result = Pattern.matches(regExp1, data1);

        if(result) System.out.println("정규식과 일치합니다.");
        else System.out.println("정규식과 일치하지 않습니다.");

        String regExp2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
        String data2 = "example@mycomputer.com";

        result = Pattern.matches(regExp2, data2);

        if(result) System.out.println("정규식과 일치합니다.");
        else System.out.println("정규식과 일치하지 않습니다.");
    }
}
