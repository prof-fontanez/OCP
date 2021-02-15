/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 4, 2021: 6:07:26 PM
 */
package demo;

public class DiceRoll {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 6; i++)
			for (int j = i; j <= 6; j++)
				for (int k = j; k <= 6; k++)
					System.out.println(i + " " + j + " " + k);
				
	}
	
}
