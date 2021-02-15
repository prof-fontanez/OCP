/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 10, 2021: 9:39:48 PM
 */
package demo;

class Unbruh {
  
  public Number average(String x, String y) throws NumberFormatException {
  	
  	Number d1;
  	Number d2;
  	boolean isFloat = false;
  	
  	if (x.contains(".")) {
  		  d1 = Double.parseDouble(x);
  		  isFloat = true;
  	} else {
  		d1 = Integer.parseInt(x);
  	}
  	
  	if (y.contains(".")) {
  		d2 = Double.parseDouble(y);
		  isFloat = true;
  	} else {
  		d2 = Integer.parseInt(y);
  	}
		
		if (isFloat) {
			return (d1.doubleValue() + d2.doubleValue()) / 2.0;
		}
		
		return (d1.intValue() + d2.intValue()) / 2;
	}
}


