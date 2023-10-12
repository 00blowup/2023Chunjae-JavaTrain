package oct11;

public class InheritanceEx {
    // 상속 실습(extends)을 위한 실행 클래스
    public static void main(String[] args) {
        InheritanceChildClass child = new InheritanceChildClass("아이폰SE2", "블랙");

        System.out.println("기종: " + child.model);
        System.out.println("색상: " + child.color);
    }
}
