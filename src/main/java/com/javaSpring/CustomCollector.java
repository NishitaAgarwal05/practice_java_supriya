package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomCollector {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n number : ");
		int number = sc.nextInt();
		sc.nextLine();
		List<String> listString = new ArrayList<>();
		System.out.println("Enter strings in the list : ");
		for (int i = 0; i < number; i++) {
			String s = sc.nextLine();
			listString.add(s);
		}
		
		String strings = listString.stream().collect(Collectors.joining(","));
		
		System.out.println("Strings are : "+strings);
}


}