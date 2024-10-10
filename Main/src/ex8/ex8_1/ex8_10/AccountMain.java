package ex8.ex8_1.ex8_10;

public class AccountMain {
    public static void main(String[] args) {
        Account a = new Account("123-45",10000);
        Account b = new Account("567-89",10000);
        while ( a.transfer(b,3000)){
            System.out.println("송금이 완료되었습니다.");
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}
