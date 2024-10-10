package ex8.ex8_1.ex8_10;

public class Account {
    private String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean transfer(Account toAccount, int amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            toAccount.setBalance(toAccount.getBalance() + amount);
            return true;
        } else {
            System.out.println("잔액이 부족해 송금이 불가능합니다.");
            return false;
        }
    }

    public String toStr() {
        return "계좌번호: " + getAccountNumber() + ", 잔액: " + getBalance();
    }
}


