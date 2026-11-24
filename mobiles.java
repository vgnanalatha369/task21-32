class Mobile {

    String brand;
    double price;

    Mobile() {
        brand = "Samsung";
        price = 25000;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}
class mobiles {
    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.displayDetails();
    }
}
