package oct12.interfaceEx;

public class RemoteEx {
    // interface 실습을 위한 실행 클래스
    public static void main(String[] args) {
        // 상수는 구현 객체와 관련 없는 인터페이스 소속 멤버이므로, 바로 접근할 수 있다.
        System.out.println("최대볼륨 상수: " + RemoteInterface.MAX_VOLUME);
        System.out.println("최대볼륨 상수: " + RemoteInterface.MIN_VOLUME);
        System.out.println();

        RemoteActual remote = new RemoteActual();

        remote.turnOn();
        remote.setVolume(3);
        remote.getVolume();
        remote.setVolume(21);
        remote.getVolume();
        remote.mute();
        remote.getVolume();
        remote.unmute();
        remote.getVolume();
        remote.search("검색어");   // 만약
        remote.turnOff();

    }
}
