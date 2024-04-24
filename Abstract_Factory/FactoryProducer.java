public class FactoryProducer {
   public static AbstractFactory getFactory(String type) {
      if (type.equalsIgnoreCase("rounded")) {
         return new RoundedShapeFactory();
      } else if (type.equalsIgnoreCase("bordered")) {
         return new BorderedShapeFactory();
      } else {
         return new ShapeFactory();
      }
   }
}