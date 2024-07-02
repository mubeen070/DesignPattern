interface Product {
    String getDescription();

    double getCost();
}

class BasicProduct implements Product {
    private String name;
    private double price;

    public BasicProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return price;
    }
}

abstract class ProductDecorator implements Product {
    protected Product decoratedProduct;

    public ProductDecorator(Product decoratedProduct) {
        this.decoratedProduct = decoratedProduct;
    }

    public String getDescription() {
        return decoratedProduct.getDescription();
    }

    public double getCost() {
        return decoratedProduct.getCost();
    }
}

class GiftWrap extends ProductDecorator {
    public GiftWrap(Product decoratedProduct) {
        super(decoratedProduct);
    }

    public String getDescription() {
        return decoratedProduct.getDescription() + ", with Gift Wrap";
    }

    public double getCost() {
        return decoratedProduct.getCost() + 5.00;
    }
}

class ExtendedWarranty extends ProductDecorator {
    public ExtendedWarranty(Product decoratedProduct) {
        super(decoratedProduct);
    }

    public String getDescription() {
        return decoratedProduct.getDescription() + ", with Extended Warranty";
    }

    public double getCost() {
        return decoratedProduct.getCost() + 20.00;
    }
}
