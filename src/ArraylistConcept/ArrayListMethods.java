package ArraylistConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("PHP");
		ar1.add("Ruby");
		System.out.println(ar1);

		ArrayList<String> ar2 = new ArrayList<String>();
		/*
		 * ar2.add("Devop"); ar2.add("Testing"); //adding all array list to new array by
		 * below method //ar2.addAll(ar1); System.out.println(ar2);
		 * 
		 * //Add from specific index ar1.addAll(4, ar2); System.out.println(ar1);
		 */
		// For cloning refer below method

		@SuppressWarnings("unchecked")
		ArrayList<String> clonelist = (ArrayList<String>) ar1.clone();
		System.out.println(clonelist);

		// contains return true/false
		System.out.println(ar1.contains("ruby"));
		System.out.println(ar1.contains("Ruby"));
		System.out.println(ar1.contains("C"));

		// indexof to verify its present or not it will return true or false

		System.out.println(ar1.indexOf("Ruby") > 0);

		// Creating array list another method

		ArrayList<String> List = new ArrayList<String>(Arrays.asList("Shashank", "Sudhir", "Sase", "Tushar", "Ass"));
		System.out.println(List);

		// Last index
		int i = List.indexOf("Sase");
		System.out.println(i);
//if index is not present it will return "-1" it will not give any error.

		// Remove method to remove specific by index
		List.remove(2);
		System.out.println(List);

		// Remove specific value directly by name or ETC
		List.remove("Ass");
		System.out.println(List);

		ArrayList<Integer> number = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
		System.out.println(number);
		number.removeIf(num -> num % 3 == 0);
		System.out.println(number);

	}

}
