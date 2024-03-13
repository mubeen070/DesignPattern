public class HerdingDog extends Dog {
    private String name;

    HerdingDog(String n) {
        this.name = n;
    }

    @Override
    void bark() {
        System.out.println(name + " barks.");
    }

    void herd() {
        System.out.println(name + " is  herding");
    }
}
