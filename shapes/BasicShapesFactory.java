/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 15, 2021: 1:05:18 AM
 */
package shapes;

public class BasicShapesFactory implements ShapesFactory {
	
	@Override
	public Shape getShape (String name) throws IllegalShapeException {
		
		failIfNull(name);
        return switch (name.toUpperCase()) {
            case "CIRCLE" -> new Circle();
            case "RECTANGLE" -> new Rectangle();
            case "SQUARE" -> new Square();
            default ->
                    throw new IllegalShapeException("Unsupported shape for " + this.getClass().getSimpleName() + ": " + name);
        };
	}
}
