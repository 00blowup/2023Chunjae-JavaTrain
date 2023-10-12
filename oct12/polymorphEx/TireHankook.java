package oct12.polymorphEx;

public class TireHankook implements Tire{
    // 다형성 예제를 실습하기 위한 타이어 자식 클래스1
    @Override
    public void roll() {
        System.out.println("한국타이어! 구른다!");
    }
}
