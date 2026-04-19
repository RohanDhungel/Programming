class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println(holderName + " deposited: $" + amount);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance for " + holderName);
        } else {
            balance = balance - amount;
            System.out.println(holderName + " withdrew: $" + amount);
        }
    }

    void displayBalance() {
        System.out.println("Account No : " + accountNumber);
        System.out.println("Name       : " + holderName);
        System.out.println("Balance    : $" + balance);
        System.out.println("-------------------");
    }
}

public class MainClass {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1001, "Alice", 5000);
        BankAccount account2 = new BankAccount(1002, "Bob", 3000);

        account1.deposit(1000);
        account1.withdraw(500);

        account2.deposit(700);
        account2.withdraw(4000);  

        System.out.println("\n--- Final Balance ---");
        account1.displayBalance();
        account2.displayBalance();
    }
}
