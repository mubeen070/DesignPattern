public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(20.0);
        Shape rectangle = new Circle(25.0);
        Shape redCircle = new RedShapeDecorator(circle, 5.0);
        Shape redRectangle = new RedShapeDecorator(rectangle, 7.0);

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Rectangle with normal border");
        rectangle.draw();

        System.out.println("\nCircle with border");
        redCircle.draw();

        System.out.println("\nRectangle with border");
        redRectangle.draw();

    }
}
