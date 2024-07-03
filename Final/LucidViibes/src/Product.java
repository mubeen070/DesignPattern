interface Product {
    String getDescription();

    double getCost();
    double extendedPrice();
}

class BasicProduct implements Product {
    private String name;
    private double nprice;
    private double exprice;

    public BasicProduct(String name, double nprice, double eprice) {
        this.name = name;
        this.nprice = nprice;
        this.exprice=eprice;
    }

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public double getCost() {
        return nprice;
    }
    @Override
    public double extendedPrice()
    {
        return nprice+exprice;
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

    public double extendedPrice()
    {
        return decoratedProduct.extendedPrice();
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
class CombinedPrice extends ProductDecorator
{
    public CombinedPrice(Product decoratedProduct)
    {
        super(decoratedProduct);

    }
    public String getDescription()
        {
            return decoratedProduct.getDescription();
        }
    public double getCost()
    {
        return decoratedProduct.getCost();
    }
    public double extendedPrice()
    {
        return decoratedProduct.extendedPrice();
    }
    
}

