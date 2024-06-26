/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 15, 2021: 1:20:12 AM
 */
package shapes;

public class AdvancedShapesFactory implements ShapesFactory {
	
	@Override
	public Shape getShape (String name) throws IllegalShapeException {
		
		failIfNull(name);
        return switch (name.toUpperCase()) {
            case "TRIANGLE" -> new Triangle();
            case "PENTAGON" -> new Pentagon();
            case "HEXAGON" -> new Hexagon();
            default ->
                    throw new IllegalShapeException("Unsupported shape for " + this.getClass().getSimpleName() + ": " + name);
        };
	}
}
