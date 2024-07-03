public class Shopify {
    public static void main(String[] args) {
        // Singleton
        Configuration config = Configuration.getInstance();
        System.out.println("Config: " + config.getConfig());

        // Factory Method
        UserFactory userFactory = new UserFactory();
        User admin = userFactory.createUser("Admin");
User special=userFactory.createUser("special");
        admin.displayRole();
        special.displayRole();

        // Observer
        NotificationService notificationService = new NotificationService();
        UserObserver user1 = new UserObserver("User1");
        UserObserver user2 = new UserObserver("User2");
        notificationService.addObserver(user1);
        notificationService.addObserver(user2);
        notificationService.notifyObservers("New product available!");

        // Interpreter (Command)
        OrderContext context = new OrderContext();
        OrderInterpreter interpreter = new OrderInterpreter();
        interpreter.interpret("buy Laptop", context);
        interpreter.interpret("sell Phone", context);

        System.out.println("Interpreted Orders: " + context.getOrders());

        // Decorator
        Product giftWrappedProduct = new GiftWrap(new BasicProduct("Smartphone", 700.00,100));
        Product extendedw=new ExtendedWarranty(new BasicProduct("Smartphone with extended warranty", 1000,100));
        
        System.out.println(giftWrappedProduct.getDescription() + " costs $" + giftWrappedProduct.getCost());
        System.out.println(extendedw.getDescription() + " costs $" + extendedw.extendedPrice());

        // Facade
        ECommerceFacade facade = new ECommerceFacade(context);
        facade.placeOrder("Tablet", "Credit Card");
        facade.placeOrder("Laptop", "PayPal");
        facade.placeOrder("Phone", "Cash");

        // Display all orders
        System.out.println("Placed Orders:");
        for (Order order : facade.getOrders()) {
            System.out.println(order);
        }
    }
}
