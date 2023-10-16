package oct16.exceptionbankex;

public class Account {
    // 사용자 정의 예외 실습을 위한 계좌 클래스

    private long balance; // 잔액

    // 생성자
    public Account() {}

    // 잔액조회 메소드
    public long getBalance() {
        return balance;
    }

    // 입금 메소드
    public void deposit (int money) {
        balance += money;
    }

    // 출금 메소드
    public void withdraw (int money) throws InsufficientException{
        // 잔액이 출금액보다 적을 경우 예외 발생
        if(balance < money) throw new InsufficientException("잔고 부족: " + (money-balance) + "원 모자람");
        // 예외가 발생하지 않았을 경우 출금 진행
        balance -= money;
    }
}
