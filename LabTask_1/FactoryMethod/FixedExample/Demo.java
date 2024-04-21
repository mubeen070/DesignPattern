package FixedExample;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<>();

		GeometeryFactory factory = new GeometeryFactory();

		shapes.add(factory.createShape("Circle"));
		shapes.add(factory.createShape("Square"));
		shapes.add(factory.createShape("Square"));
		shapes.add(factory.createShape("Triangle"));

		for (Shape s : shapes) {
			s.draw();
		}
	}
}
