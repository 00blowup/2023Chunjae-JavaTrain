package oct12.abstractEx;

public class AbstractActual extends AbstractClass{
    // abstract 실습을 위한 자식 클래스
    public AbstractActual(String owner) {
        super(owner);
    }

    void doSearch() {
        System.out.println("검색을 합니다. (owner: " + owner + ")");
    }
}
