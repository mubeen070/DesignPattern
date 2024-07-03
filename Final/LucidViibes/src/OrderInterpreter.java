import java.util.*;

interface Expression {
    void interpret(OrderContext context);
}

class BuyExpression implements Expression {
    private String product;

    public BuyExpression(String product) {
        this.product = product;
    }

    @Override
    public void interpret(OrderContext context) {
        context.addOrder(new Order(product, "Buy"));
    }
}

class SellExpression implements Expression {
    private String product;

    public SellExpression(String product) {
        this.product = product;
    }

    @Override
    public void interpret(OrderContext context) {
        context.addOrder(new Order(product, "Sell"));
    }
}

class OrderContext {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }
}

public class OrderInterpreter {
    public void interpret(String command, OrderContext context) {
        String[] parts = command.split(" ");
        String action = parts[0];
        String product = parts[1];

        Expression expression = null;

        if (action.equalsIgnoreCase("buy")) {
            expression = new BuyExpression(product);
        } else if (action.equalsIgnoreCase("sell")) {
            expression = new SellExpression(product);
        }

        if (expression != null) {
            expression.interpret(context);
        }
    }
}
