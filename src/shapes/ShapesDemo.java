/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 15, 2021: 1:23:58 AM
 */
package shapes;

public class ShapesDemo {
	
	public static void main (String[] args) {
		ShapesFactory shapeFactory = new BasicShapesFactory();

		// try a bad shape name for basic factory
		try {
			shapeFactory.getShape("TRIANGLE");
		} catch (IllegalShapeException ise) {
			System.err.println(ise.getMessage());
		}
		
		try {
			Shape shape = shapeFactory.getShape("circle");
			shape.draw();
			shape = shapeFactory.getShape("Rectangle");
			shape.draw();
			shape = shapeFactory.getShape("SQUARE");
			shape.draw();
		} catch (IllegalShapeException ise) {
			System.err.println(ise.getMessage());
		}

		shapeFactory = new AdvancedShapesFactory();

		// try a bad shape name for advanced factory
		try {
			shapeFactory.getShape("CIRCLE");
		} catch (IllegalShapeException ise) {
			System.err.println(ise.getMessage());
		}
		
		try {
			Shape shape = shapeFactory.getShape("triangle");
			shape.draw();
			shape = shapeFactory.getShape("Pentagon");
			shape.draw();
			shape = shapeFactory.getShape("HEXAGON");
			shape.draw();
		} catch (IllegalShapeException ise) {
			System.err.println(ise.getMessage());
		}
	}
}
