/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 15, 2021: 1:04:04 AM
 */
package shapes;

public interface ShapesFactory {
	
	Shape getShape (String name) throws IllegalShapeException;
	
	default void failIfNull (String name) throws IllegalShapeException {
		if (name == null) {
			throw new IllegalShapeException("Name cannot be null");
		}
	}
}
