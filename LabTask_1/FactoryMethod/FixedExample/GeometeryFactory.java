package FixedExample;

class GeometeryFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equals("Circle")) {
            return new Circle();
        } else if (shapeType.equals("Square")) {
            return new Square();
        } else if (shapeType.equals("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}
