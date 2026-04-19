class BankAccount {
    int accountNumber;
    String accountHolder;
    int balance;

    BankAccount(int accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {
        if (amount > balance)
            System.out.println("Not enough balance!");
        else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class MainClass {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(101, "Ali", 5000);
        BankAccount b2 = new BankAccount(102, "Sara", 3000);

        b1.display();
        b1.deposit(1000);
        b1.withdraw(500);
        b1.display();

        b2.display();
        b2.withdraw(5000);
    }
}