public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee controller = new Employee();
        controller.generateOrganogram();
        controller.printDetails();

        System.out.println("\nActivating bonus...\n");
        controller.bonuses("year-end", 10);
        controller.printDetails();
    }
}
