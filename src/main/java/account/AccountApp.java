package account;

public class AccountApp {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        account1.setName("Konto Premium");
        account2.setName("Konto Oszczednosciowe");

        System.out.println("Nazwa " + account1.getName());
        System.out.println("Nazwa " + account2.getName());



        account1.transfer(account2,100);
        System.out.println(account1.getBalance());
        account1.transfer(account2,100_00_00);
        System.out.println(account1.getBalance());
    }
}