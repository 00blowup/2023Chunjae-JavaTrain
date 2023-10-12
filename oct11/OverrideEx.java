package oct11;

public class OverrideEx {
    // Override 실습을 위한 실행 클래스
    public static void main(String[] args) {
        int r = 10;

        OverrideParentClass parent = new OverrideParentClass();
        System.out.println("원 면적: " + parent.areaCircle(r));
        System.out.println();

        OverrideChildClass child = new OverrideChildClass();
        System.out.println("원 면적: " + child.areaCircle(r));

    }
}
