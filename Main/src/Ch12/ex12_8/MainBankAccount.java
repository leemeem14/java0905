package Ch12.ex12_8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("왈도","111-22-3333",1000000);
        BankAccount b2 = new BankAccount("힘쎈 이끼","444-55-6666",10000000);


        try {
            File file = new File("result_account.txt");
            FileWriter fw = new FileWriter(file);
            fw.write(b1.toString()+"\n");
            fw.write(b2.toString()+"\n");
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
