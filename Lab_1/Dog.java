/**
 * Dog
 */
public class Dog {
    private String name;

    Dog() {

    }

    Dog(String n) {
        this.name = n;
    }

    void bark() {
        System.out.println(name + " barks.");
    }
}