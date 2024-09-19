package ex8_7;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter account number(5 digits): ");
        String accountNumber = sc1.nextLine();
        System.out.print("Enter account name: ");
        String name = sc1.nextLine();
        System.out.print("Enter account pwd: ");
        String pwd = sc1.nextLine();
        System.out.print("입금량 입력: ");
        int balance = sc2.nextInt();

        //개설
        Account account = new Account(accountNumber,name,pwd,balance);
        System.out.println(account);

        //
        System.out.print("입금량 입력: ");
        int deposit = sc2.nextInt();
        account.deposit(deposit);

        System.out.print("출금량 입력: ");
        int withdraw = sc2.nextInt();
        account.withdraw(withdraw);

        System.out.printf("%s님의 잔고는%d입니다.\n",account.getName(),account.getBalance());

        sc1.close();
        sc2.close();
    }
}
