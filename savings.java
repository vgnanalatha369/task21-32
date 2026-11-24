abstract class BankAccount {
    abstract double calculateInterest();

    void displayAccountType() {
        System.out.println("Bank Account Details");
    }
}

class SavingsAccount extends BankAccount {
    double balance;

    @Override
    double calculateInterest() {
        return balance * 0.05;
    }
}
class savings {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();

        s.balance = 50000;

        s.displayAccountType();

        System.out.println("Calculated Interest: " + s.calculateInterest());
    }
}
