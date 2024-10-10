package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Partitions {

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
		
		Map<Boolean,List<Integer>> evenOdd = listNumber.stream().collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println("Even numbers are : "+evenOdd.get(true));
		System.out.println("Odd numbers are : "+evenOdd.get(false));
		
 	}
}
