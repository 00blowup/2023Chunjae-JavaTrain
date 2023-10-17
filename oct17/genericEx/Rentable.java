package oct17.genericEx;

public interface Rentable<P> {
    // 대여 가능한 모든 객체를 다룰 수 있도록 제네릭 사용
    P rent();
}
