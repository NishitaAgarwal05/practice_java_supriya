package com.javaSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlatMap {

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
		
		List<List<Integer>> listOfLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);
		
		List<Integer> flatMap = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println("Numbers in the list: " + flatMap);
	}
}
