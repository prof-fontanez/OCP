/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Dec 27, 2020: 1:53:16 AM
 */
package demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListCopyDemo {
	
	public static void main (String[] args) {
		List<String> original = new LinkedList<>();
		original.add("Hello World!");
		original.add("Welcome to Java");
//		original.add(1);
//		original.add(2);
//		original.add(3);
		
		List<?> copy = ListCopyDemo.funcOri(original);
		
		for(Object o : copy) {
			System.out.println(o);
		}
	}
	
	public static List<Object> funcOri(List<?> arr1) {
		return arr1.stream().collect(Collectors.toList());
	}
}
