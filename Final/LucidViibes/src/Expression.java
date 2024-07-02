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
        context.addOrder("Buying " + product);
    }
}

class SellExpression implements Expression {
    private String product;

    public SellExpression(String product) {
        this.product = product;
    }

    @Override
    public void interpret(OrderContext context) {
        context.addOrder("Selling " + product);
    }
}

class OrderContext {
    private List<String> orders = new ArrayList<>();

    public void addOrder(String order) {
        orders.add(order);
    }

    public ArrayList<String> getOrders() {
        return (ArrayList<String>) orders;
    }
}

class OrderInterpreter {
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
