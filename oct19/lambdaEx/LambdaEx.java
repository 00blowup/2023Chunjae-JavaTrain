package oct19.lambdaEx;

public class LambdaEx {
    // 람다식 실습을 위한 실행 코드
    public static void main(String[] args) {

        /*
        매개변수가 있는 람다식 사용해보기
         */
        // argsAction의 매개변수로서, 함수형 인터페이스인 Calculable의 메소드 calculate를 구현한 람다식을 넣음
        argsAction((x, y) -> {
            int result = x + y;
            System.out.println("result: " + result);
        });

        argsAction((x, y) -> {
            int result = x - y;
            System.out.println("result: " + result);
        });


        /*
        매개변수가 없는 람다식 사용해보기
         */
        Person person = new Person();
        // noArgsAction의 매개변수로서, 함수형 메소드인 Workable의 메소드 work를 구현한 람다식을 넣음
        person.noArgsAction(() -> {
            System.out.println("일하기!");
            System.out.println("또 일하기!");
        });

        // 실행문이 한 개인 람다식은 중괄호를 생략할 수 있다
        person.noArgsAction(() -> System.out.println("퇴근하기!"));

    }


    // 매개변수가 있는 람다식 실습을 위한 메소드
    public static void argsAction (Calculable calculable) {
        // 데이터
        int x = 10;
        int y = 4;

        // 데이터 처리
        calculable.calculate(x, y);
    }
}
