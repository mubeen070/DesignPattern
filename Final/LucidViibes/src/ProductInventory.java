class ProductInventory {
    public void checkInventory(String product) {
        System.out.println("Checking inventory for " + product);
    }
}

class PaymentGateway {
    public void processPayment(String paymentType) {
        System.out.println("Processing " + paymentType + " payment");
    }
}

class ShippingService {
    public void shipProduct(String product) {
        System.out.println("Shipping " + product);
    }
}

class ECommerceFacade {
    private ProductInventory inventory;
    private PaymentGateway payment;
    private ShippingService shipping;

    public ECommerceFacade() {
        inventory = new ProductInventory();
        payment = new PaymentGateway();
        shipping = new ShippingService();
    }

    public void placeOrder(String product, String paymentType) {
        inventory.checkInventory(product);
        payment.processPayment(paymentType);
        shipping.shipProduct(product);
    }
}
