package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DistinctValue {

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
		
		List<Integer> distinctValue = listNumber.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Distinct values are : ");
		
		for(int value : distinctValue)
		{
			System.out.println(value);
		}
	}
}
