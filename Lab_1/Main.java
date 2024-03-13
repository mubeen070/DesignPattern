public class Main {
    public static void main(String[] args) {
        Dog Rufus = new Dog("Rufus");
        HerdingDog Fluffy = new HerdingDog("Fluffy");
        HerdingDog Maisel = new HerdingDog("Maisel");
        TrackingDog Duke = new TrackingDog("Duke");
        Car myCar = new Car("Dinky", "red", "Dodge", "Charger");
        Car helensCar = new Car("Dinky2", "blue", "Nissan", "Ultima");
        System.out.println();
        myCar.repaint();
        System.out.println();
        helensCar.repaint();
        System.out.println();

        Rufus.bark();
        System.out.println();
        Fluffy.bark();
        System.out.println();
        Fluffy.herd();
        System.out.println();

        Maisel.bark();
        System.out.println();
        Maisel.herd();
        System.out.println();

        Duke.bark();
        System.out.println();
        Duke.track();
    }
}
