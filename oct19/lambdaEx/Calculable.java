package oct19.lambdaEx;

@FunctionalInterface    // 이 인터페이스가 함수형 인터페이스임을 보장하기 위한 어노테이션. 이것을 붙이면 컴파일 과정에서 정말 추상메소드 하나만 있는지 검사한다.
public interface Calculable {
    // 매개변수가 있는 람다식 실습을 위한 인터페이스. 단 하나의 추상메소드를 가진 인터페이스를 함수형 인터페이스라고 한다.
    // 함수형 인터페이스만 람다식으로 표현할 수 있다!
    void calculate (int x, int y);  // 추상 메소드 하나 정의
}
