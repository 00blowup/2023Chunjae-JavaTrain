package oct11;

public class SingletonClass {

    // 인스턴스를 private 필드로 생성
    private static final SingletonClass singletonClass = new SingletonClass();

    // 생성자를 private로 선언
    private SingletonClass () {
    }

    // 만들어놓은 인스턴스를 리턴하는 메소드 선언
    public static SingletonClass getInstance() {
        return singletonClass;
    }
}
