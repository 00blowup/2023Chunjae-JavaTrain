package Oct11;

public class InheritanceChildClass extends InheritanceParentClass{
    // 상속 실습(extends)을 위한 자식 클래스

    public InheritanceChildClass (String model, String color) {
        super(model, color);
        System.out.println("자식 클래스 생성자 실행");
    }
}
