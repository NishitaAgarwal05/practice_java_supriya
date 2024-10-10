package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class PredicateFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n number : ");
		int number = sc.nextInt();
		sc.nextLine();
		List<Integer> listNumber = new ArrayList<>();
		System.out.println("Enter numbers in the list : ");
		for (int i = 0; i < number; i++) {
			int num = sc.nextInt();
			listNumber.add(num);
		}

		Predicate<Integer> isEven = number1 -> number1 % 2 == 0;

		List<Integer> evenNumbers = listNumber.stream().filter(isEven).collect(Collectors.toList());

		System.out.println("Even numbers : " + evenNumbers);

	}
}
