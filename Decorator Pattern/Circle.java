public class Circle implements Shape {
    private double price;

    public Circle(double price) {
        this.price = price;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle | Cost without border: " + computeCost());
    }

    @Override
    public double computeCost() {
        return price;
    }
}
