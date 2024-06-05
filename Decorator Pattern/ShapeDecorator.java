public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    protected double price;

    public ShapeDecorator(Shape decoratedShape, double price) {
        this.decoratedShape = decoratedShape;
        this.price = price;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    @Override
    public double computeCost() {
        return decoratedShape.computeCost() + price;
    }
}
