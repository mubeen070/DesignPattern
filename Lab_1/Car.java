public class Car {

    String name;
    String color;
    String brand;
    String model;

    Car(String n, String c, String b, String m) {
        this.name = n;
        this.color = c;
        this.brand = b;
        this.model = m;
    }

    void repaint() {
        System.out.println("My car name is " + name + " it is of color " + color + " and its brand is " + brand
                + " and its model is " + model);
    }

}
