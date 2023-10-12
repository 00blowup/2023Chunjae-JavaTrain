package oct11;

public class OverrideChildClass extends OverrideParentClass{
    // Override 실습을 위한 자식 클래스
    @Override
    public double areaCircle(double r) {
        System.out.println("자식 클래스 메소드 실행");
        return Math.PI * r * r;
    }
}
