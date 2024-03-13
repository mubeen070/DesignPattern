public class TrackingDog extends Dog {

    private String name;

    TrackingDog(String n) {
        this.name = n;
    }

    @Override
    void bark() {
        System.out.println(name + " barks.");
    }

    void track() {
        System.out.println(name + " is  tracking");
    }
}
