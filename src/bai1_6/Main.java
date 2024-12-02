package bai1_6;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("001", "Nhu Y");
        Account account2 = new Account("002", "Duc Tuong");

        account1.credit(1000);
        System.out.println(account1);

        account1.debit(300);
        System.out.println(account1);

        account1.transferTo(account2, 200);
        System.out.println(account1);
        System.out.println(account2);
    }
}
