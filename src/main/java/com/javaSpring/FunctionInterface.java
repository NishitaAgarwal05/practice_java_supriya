package com.javaSpring;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionInterface {

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

		Function<String, Integer> stringLength = str -> str.length();

		List<Integer> lengths = listString.stream().map(stringLength) // Transform each string to its length
				.collect(Collectors.toList());

		System.out.println("Length of Strings are : " + lengths);

	}
}
