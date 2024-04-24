public class BorderedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("SINGLE BORDERED TRIANGLE")) {
            return new SingleBorderedTriangle();
        } else if (shapeType.equalsIgnoreCase("DOUBLE BORDERED TRIANGLE")) {
            return new DoubleBorderedTriangle();
        }
        return null;
    }
}