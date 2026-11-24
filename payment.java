interface PaymentGateway {
    void makePayment();
}

class GooglePay implements PaymentGateway {

    @Override
    public void makePayment() {
        System.out.println("Payment completed using Google Pay");
    }
}

class PhonePe implements PaymentGateway {

    @Override
    public void makePayment() {
        System.out.println("Payment completed using PhonePe");
    }
}
class payment {
    public static void main(String[] args) {

        PaymentGateway p1 = new GooglePay();
        PaymentGateway p2 = new PhonePe();

        p1.makePayment();
        p2.makePayment();
    }
}
