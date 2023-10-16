package oct16.exceptionbankex;

public class AccountEx {
    // 사용자 정의 예외 실습을 위한 실행 클래스

    public static void main(String[] args) {
        // 계좌 객체 생성
        Account account = new Account();

        // 입금
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        // 출금 시도
        try {
            account.withdraw(12000);
        } catch (InsufficientException e) {
            // 잔고부족 사용자 정의 예외의 메시지를 출력
            System.out.println(e.getMessage());
        }
    }

}
