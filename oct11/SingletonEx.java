package oct11;

public class SingletonEx {
    public static void main(String[] args) {
        // 아무리 객체를 여러 번 만들어도 동일한 하나의 객체만 사용하게 됨을 확인하기
        SingletonClass obj1 = SingletonClass.getInstance();
        SingletonClass obj2 = SingletonClass.getInstance();

        if(obj1 == obj2) System.out.println("같은 객체입니다.");
        else System.out.println("서로 다른 객체입니다.");
    }
}
