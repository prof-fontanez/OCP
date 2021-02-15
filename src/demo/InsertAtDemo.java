/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 3, 2021: 12:33:25 AM
 */
package demo;

public class InsertAtDemo {
	
	public static void main (String[] args) {
		String test = "012345 test test test";
		
//		test = test.substring(0, 2) + ":" + test.substring(2, 4) + ":" + test.substring(4, test.length());
    StringBuilder sbuff = new StringBuilder();
    sbuff.append(test.substring(0,2));
    sbuff.append(":");
    sbuff.append(test.substring(2,4));
    sbuff.append(":");
    sbuff.append(test.substring(4,test.length()));
    test = sbuff.toString();
		System.out.println(test);
		

	}
	
}
