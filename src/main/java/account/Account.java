package account;

public class Account {
    private String name;
    private int balance = 0;
    private boolean debit;
    private int maxDebit = -1000;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setMaxDebit(int maxDebit) {
        this.maxDebit = maxDebit;
    }

    public void deposit(int amount) {
        int beforeDeposit = getBalance();
        if (amount < 0) {
            System.out.println("Krota wpłaty/wypłaty musi być dodatni");
        } else {
            balance = balance + amount;
            if (balance > 0) {
                debit = false;
            }
            System.out.println("Stan konta: " + this.getName() + ":" + beforeDeposit + " | Wpłata " + amount + " | Po operacji " + getBalance());
        }
    }

    public void withdraw(int amount) {

        if (amount < 0) {
            System.out.println("Kwota wpłaty/wyplaty musi byc dodatnia");
            return;
        }
        if (getBalance() - amount < maxDebit) {
            System.out.println("nie mozna wykonac operacji");
            return;
        }
        int beforeDeposit = getBalance();
        balance = balance - amount;
        if (balance < 0) {
            debit = true;
            System.out.println("ujemny stan konta");
        }
        System.out.println("Stan konta: " + this.getName() + ":" + beforeDeposit + " | Wypłata " + amount + " | Po operacji " + getBalance());
    }

    public void transfer(Account other, int amount) {
        if (amount < 0) {
            System.out.println("Kwota przelewu nie moze byc ujemna");
            return;
        }
        if (getBalance() - amount < maxDebit) {
            System.out.println("Przekroczono debet!");
            return;
        }
        this.withdraw(amount);
        other.deposit(amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}



