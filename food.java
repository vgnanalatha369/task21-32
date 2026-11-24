abstract class Delivery {

    void acceptOrder() {
        System.out.println("Delivery order accepted");
    }

    abstract void deliverProduct();
}

class FoodDelivery extends Delivery {

    @Override
    void deliverProduct() {
        System.out.println("Food order delivered to customer");
    }
}

class ParcelDelivery extends Delivery {

    @Override
    void deliverProduct() {
        System.out.println("Parcel delivered successfully");
    }
}
class food {
    public static void main(String[] args) {

        FoodDelivery food = new FoodDelivery();
        ParcelDelivery parcel = new ParcelDelivery();

        food.acceptOrder();
        food.deliverProduct();

        parcel.acceptOrder();
        parcel.deliverProduct();
    }
}
