/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 10, 2021: 9:39:03 PM
 */
package demo;

import java.util.Scanner;

public class Bruh {
  public static void main(String[] args) {
      
      System.out.println("Enter number");
      Scanner input = new Scanner(System.in);
      String x = input.next();
      String y = input.next();
      input.close();
      Unbruh a = new Unbruh();
      System.out.println(a.average(x, y));
  }
}