package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class FindFirst {

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
		
		Optional<String> firstString = listString.stream().filter(string -> string.startsWith("A")).findFirst();
		
		System.out.println("String with the first letter as A : "+firstString.get());
	}
}
