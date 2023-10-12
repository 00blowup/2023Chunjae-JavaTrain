package oct12.interfaceEx;

public class RemoteActual implements RemoteInterface, Searchable {
    // interface 실습을 위한 구현체 클래스

    // 필드
    private int volume;


    /*
    RemoteInterface override
     */

    // 추상 메소드 override
    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }
    // 추상 메소드 override
    @Override
    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
    // 추상 메소드 override
    @Override
    public void setVolume(int volume) {
        System.out.println("볼륨을 조정합니다.");
        if(volume<=MAX_VOLUME && volume>= MIN_VOLUME) this.volume = volume; // 인터페이스의 상수를 가져다 쓸 수 있다.
    }
    // 추상 메소드 override
    @Override
    public void getVolume() {
        System.out.println("현재 볼륨: " + volume);
    }

    // 추가 필드 선언
    private int memoryVolume;

    // 디폴트 메소드 override (선택사항)
    @Override
    public void mute() {
        System.out.println("무음을 설정합니다.");
        memoryVolume = volume;
        volume = MIN_VOLUME;
    }

    // 추상 메소드 override
    @Override
    public void unmute() {
        System.out.println("무음을 해제합니다.");
        volume = memoryVolume;
    }

    // Searchable override
    @Override
    public void search(String keyword) {
        System.out.println(keyword + "을(를) 검색합니다.");
    }



}
