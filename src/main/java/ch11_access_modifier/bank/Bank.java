package ch11_access_modifier.bank;

import java.util.Scanner;

/*
    과제 가이드라인
    1. 필드
        int accountNum(계좌번호)
        String accountHolder(예금주이름)
        int balance(잔액)
        int pinNumber(비밀번호, 4자리 정수 0~9999) // get 안 만듦

    2. 생성자
        기본 생성자
        계좌번호만 있는 생성자
        계좌번호, 예금주를 받는 생성자
        계좌번호, 예금주, 초기 잔액을 받는 생성자
        계좌번호, 예금주, 초기 잔액, 비밀번호를 받는 생성자

    3. 메서드
        setter / getter
            특히 setter의 경우에는 유효성 검증 로직을 삽입해야 함.
                -> 잔액은 음수일 수 없음
                -> 비밀번호는 0 이상 9999 이하까지만 가능. -> 실패하면 "불가능한 비밀번호입니다."
        2) deposit(int amount, int inputPin) -> 입금 관련 메서드 / call2() 유형으로 작성
            - 올바른 비밀번호인지 확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
            - 유효한 금액인지 검증(amount가 0초과인지) -> 실패하면 "불가능한 입력 금액입니다."
            - 콘솔창에
                입금 성공 ! 현재 잔액 : 00000원

            withdraw(int amount, int inputPin) -> 출금 관련 메서드 / cal2() 유형으로 작성
                - 올바른 비밀번호인지  확인 -> 틀리면 "비밀번호가 틀렸습니다."하고 메서드 종료
                - 유효한 금액인지 검증(amount 0초과) -> 실패하면 "불가능한 입력 금액입니다."
                - 출금 후 잔액이 0 이상인지 확인 -> 음수

        3) showAccountInfo() / call1() 유형으로 작성
            - 콘솔창에
                계좌번호 :
                계좌 소유자 : 홍길동
                현재 잔액 : 100000원
            라고 출력될 수 있도록 작성할 것

            전체 실행 예

            계좌 번호 : 123456
            계좌 소유자 : 홍길동
            현재 잔액 : 100000원

            계좌 번호 : 123456
            계좌 소유자 : 홍길동
            현재 잔액 : 100000원

            50000원이 입금되었습니다. 현재 잔액 : 150000원        # account1에 대한 입금(오만원)
            잔액이 부족하여 출금할 수 없습니다.                    #acocount1에서 200000원 출금 시도 실패 사례(이십만원)
            100000원이 출금되었습니다. 현재 잔액 : 50000원        # account1에 대한 출금(십만원 출금 성공)

            100000원이 출금되었습니다. 현재 잔액 : 400000원       # account2에 대한 입금(오만원)
            200000원이 입금되었습니다. 현재 잔액 : 600000원

            최종 계좌 정보
            계좌 번호 : 123456
            현재 잔액 : 50000원  (5만원)

            계좌 번호 : 987654
            현재 잔액 : 600000원 (60만원)
 */
public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    Scanner scanner = new Scanner(System.in);

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNumber = pinNumber;
    }

    //getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    // setter
    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(int balance) {
        // 0원 초과가 입금이 가능해야하므로
        if (balance <= 0) {
            System.out.println("불가능한 잔액입니다.");
            return;
        }
        this.balance = balance;     // 이거 초기 잔액 세팅이기 때문에 입금은 얘로 이루어질 수 없음
    }

    public void setPinNumber(int pinNumber) { // 비밀번호 확인 set
        if (pinNumber < 0 || pinNumber > 9999) {
            System.out.println("불가능한 비밀번호입니다.");
            return;
        }
        this.pinNumber = pinNumber;
    }


    // 입금 메서드
    void deposit ( int amount, int inputPin) {
        // 1. 비밀번호 체크
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
//        if (amount > 0) {
//            System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + (balance += amount));
//        } else if (amount <= 0) {
//            System.out.println("불가능한 입력 금액입니다.");
//        }
        // 강사 코드
        // 2. 입금 금액이 0원 초과인지 체크
        if (amount < 0){
            System.out.println("불가능합 입력 금액입니다.");
            return;
        }
        // 이상의 두 개의 조건문 다 통과하면 입금 금액 더해주기
        balance+=amount;
        System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance);
    }

    // 출금 메서드
    void withdraw (int amount, int inputPin) {
        if (inputPin != pinNumber) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
//        if (amount > 0) {
//            System.out.print(amount + "원이 출금되었습니다. 현재 잔액 : " + (balance -= amount));
//        } else if (amount < 0) {
//            System.out.println("불가능한 입력 금액입니다.");
//        }
        
        // 강사 코드
        if (amount < 0){
            System.out.println("불가능합 입력 금액입니다.");
            return;
        }
        if (balance - amount >= 0){ // 출금 후 잔액이 0원 이상인지 체크
            balance-=amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println("잔액이 부족하여 출금할 수 없습니다.");
        }

    }

    void showAccountInfo() {
        System.out.println("\n계좌 번호 : " + accountNum);
        System.out.println("계좌 소유자 : " + accountHolder);
        System.out.println("현재 잔액 : " + balance + "원");
    }

}


