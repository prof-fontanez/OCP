/*
 * Name: Hector
 * CSC2340 - Object-Oriented Programming (Java)
 * Prof. Fontanez
 * Assignment: [i.e. Homework #1, Problem 2.3]
 * Date/Time: Feb 4, 2021: 8:28:00 PM
 */
package demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AnagramDemo {
	
	public static void main (String[] args) {
		String input = "mary cooks army food";
//		String input = "mary cooks in the army";
		
		Map<Integer, ArrayList<String>> wordmap =
			new HashMap<Integer, ArrayList<String>>();
		String[] arr = input.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			int length = arr[i].length();
			String word = arr[i];
			ArrayList<String> list = wordmap.get(length);
			if (list == null) list = new ArrayList<>();
			list.add(word);
			wordmap.put(length, list);
		}
		
		Iterator<Entry<Integer, ArrayList<String>>> iter =
			wordmap.entrySet().iterator();
		
		while (iter.hasNext()) {
			Entry<Integer, ArrayList<String>> entry = iter.next();
			if (entry.getValue().size() <= 1) continue;
			
			List<String> words = entry.getValue();
			
			boolean isAnagram = true;
			for (int i = 0, j = 1; i < words.size() - 1; i++, j++) {
				String word1 = words.get(i);
				String word2 = words.get(j);
				
				for (int c = 0; c < entry.getKey(); c++) {
					if (!word2.contains(String.valueOf(word1.charAt(c)))) {
						isAnagram = false;
						break;
					}
				}
				if (isAnagram) {
					break;
				}				
			}
			System.out.println(input + (isAnagram ? " has " : " doesn't have ") + "anagrams");
		}
	}
}
