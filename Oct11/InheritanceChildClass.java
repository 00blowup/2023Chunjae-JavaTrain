package Oct11;

public class InheritanceChildClass extends InheritanceParentClass{
    // 상속 실습(extends)을 위한 자식 클래스

    public InheritanceChildClass (String model, String color) {
        super(model, color);
        /*
        super()에 대하여:
        만약 부모 클래스에 매개변수 없는 기본 생성자가 존재한다면
        super()를 적지 않아도 컴파일 과정에서 super()가 자식의 생성자에 자동으로 추가된다.
        자동 추가된 super()는 부모의 매개변수 없는 기본 생성자를 호출한다.
        그러나 이 코드의 경우와 같이 부모에게 매개변수가 있는 생성자밖에 없다면
        반드시! 자식의 생성자에 super(매개변수);를 적어주어야 한다.
         */
        System.out.println("자식 클래스 생성자 실행");
    }
}
