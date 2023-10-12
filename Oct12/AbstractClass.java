package Oct12;

public abstract class AbstractClass {
    // abstract 실습을 위한 추상 클래스

    String owner;

    public AbstractClass (String owner) {
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("전원을 켭니다. (owner: " + owner + ")");
    }

    void turnOff() {
        System.out.println("전원을 끕니다. (owner: " + owner + ")");
    }
}
