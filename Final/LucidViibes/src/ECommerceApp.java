public class ECommerceApp {
    public static void main(String[] args) {
        // Singleton
        Configuration config = Configuration.getInstance();
        System.out.println("Config: " + config.getConfig());

        // Factory Method
        UserFactory userFactory = new UserFactory();
        User admin = userFactory.createUser("Admin");
        admin.displayRole();

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

        System.out.println("Orders: " + context.getOrders());

        // Decorator
        Product giftWrappedProduct = new GiftWrap(new BasicProduct("Smartphone", 700.00));
        System.out.println(giftWrappedProduct.getDescription() + " costs $" + giftWrappedProduct.getCost());

        // Facade
        ECommerceFacade facade = new ECommerceFacade();
        facade.placeOrder("Tablet", "Credit Card");
    }
}
