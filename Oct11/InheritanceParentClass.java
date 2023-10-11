package Oct11;

public class InheritanceParentClass {
    // 상속 실습(extends)을 위한 부모 클래스

    public String model;
    public String color;

    public InheritanceParentClass (String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("부모 클래스 생성자 실행");
    }
}
