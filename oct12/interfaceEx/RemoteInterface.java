package oct12.interfaceEx;

public interface RemoteInterface {
    // interface 실습을 위한 인터페이스

    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);
    void getVolume();

    // 디폴트 메소드. 이건 실행부가 존재하기 때문에, 구현 클래스에서 override를 해도 되고 안 해도 된다.
    default void mute () {
        System.out.println("무음을 설정합니다.");
        setVolume(MIN_VOLUME);  // 추상 메소드를 호출하면서 상수 필드를 사용
    }

    // 추상 메소드
    void unmute();
}
