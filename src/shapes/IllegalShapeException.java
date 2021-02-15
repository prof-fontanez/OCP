/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 15, 2021: 1:06:55 AM
 */
package shapes;

public class IllegalShapeException extends Exception {
	
	private static final long serialVersionUID = 8336187901411786675L;

	public IllegalShapeException(String message) {
		super(message);
	}
	
	public IllegalShapeException(Throwable cause) {
		super(cause);
	}
	
	public IllegalShapeException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public IllegalShapeException(String message, Throwable cause,
		boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
