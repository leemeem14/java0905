package ex8.ex8_1.ex8_7;

public class Account {
    private int balance;
    private String name;
    private String pwd;
    private String accountNumber;

    public Account(String balance, String name, String pwd, int accountNumber) {
        this.balance = 0;
        this.name = "";
        this.pwd = "";
        this.accountNumber ="";
    }
    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    //입출금
    public void deposit(int money) {
        balance += money;
    }
    public void withdraw(int money) {
        balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}

