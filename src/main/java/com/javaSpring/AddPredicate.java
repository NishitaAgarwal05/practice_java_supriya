package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AddPredicate {

	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n number : ");
		int number = sc.nextInt();
		sc.nextLine();
		List<String> listString = new ArrayList<>();
		System.out.println("Enter strings in the list : ");
		for(int i=0; i<number; i++) {
			String s = sc.nextLine();
			listString.add(s);
		}
		
		 Predicate<String> isNotEmpty = str -> !str.isEmpty();
		 
		 Predicate<String> lengthLessThanOrEqualToFive = str -> str.length() <= 5;

	        Predicate<String> combinedPredicate = isNotEmpty.and(lengthLessThanOrEqualToFive);

	        List<String> filteredStrings = listString.stream()
	                                              .filter(combinedPredicate)
	                                              .collect(Collectors.toList());

	        // Print the filtered strings
	        System.out.println("Filtered strings: " + filteredStrings); 
		
	}
}
