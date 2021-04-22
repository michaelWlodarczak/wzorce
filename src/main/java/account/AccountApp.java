package account;

public class AccountApp {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account();
        account1.setName(null);
        account2.setName("Konto Oszczednosciowe");

        System.out.println("Nazwa " + account1.getName());
//        System.out.println("Nazwa " + account2.getName());


//        account1.deposit(150);
//        account1.withdraw(50);
//        account1.transfer(account2,90);
//        System.out.println(account2.getBalance());
//        System.out.println(account1);



          System.out.println(account1.getBalance());
//        account1.transfer(account2,100_00_00);
//        System.out.println(account1.getBalance());
    }
}