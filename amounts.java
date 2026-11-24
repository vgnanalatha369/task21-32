abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    void showAmount() {
        System.out.println("Payment Amount: ₹" + amount);
    }

    abstract void processPayment();
}

class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    @Override
    void processPayment() {
        System.out.println("Payment processed successfully using UPI");
    }
}
class amounts{
    public static void main(String[] args) {
        UPIPayment p = new UPIPayment(5000);

        p.showAmount();
        p.processPayment();
    }
}
