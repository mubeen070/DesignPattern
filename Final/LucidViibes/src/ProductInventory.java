
import java.util.List;

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

class Order {
    private String product;
    private String paymentType;

    public Order(String product, String paymentType) {
        this.product = product;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Order: " +
                "product='" + product + '\'' +
                ", paymentType'" + paymentType + '\'' +
                '}';
    }
}

class ECommerceFacade {
    private ProductInventory inventory;
    private PaymentGateway payment;
    private ShippingService shipping;
    private OrderContext orderContext;

    public ECommerceFacade(OrderContext orderContext) {
        inventory = new ProductInventory();
        payment = new PaymentGateway();
        shipping = new ShippingService();
        this.orderContext = orderContext;
    }

    public void placeOrder(String product, String paymentType) {
        inventory.checkInventory(product);
        payment.processPayment(paymentType);
        shipping.shipProduct(product);
        orderContext.addOrder(new Order(product, paymentType));
    }

    public List<Order> getOrders() {
        return orderContext.getOrders();
    }
}