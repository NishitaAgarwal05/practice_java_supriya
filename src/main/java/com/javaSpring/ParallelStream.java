package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ParallelStream {

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
		
		long start1 = System.nanoTime();
		int sum1 = listNumber.stream().filter(num -> num % 2 == 0).mapToInt(n -> n).sum();
		long end1 = System.nanoTime();
		
		long sequential = end1 - start1;
		
		long start2 = System.nanoTime();
		int sum2 = listNumber.parallelStream().filter(num -> num % 2 == 0).mapToInt(n -> n).sum();
		long end2 = System.nanoTime(); 
		
		long parallel = end2 - start2;
		
		System.out.println("Sum of even number (Sequential) : "+sum1);
		System.out.println("Time taken by Sequential stream : "+sequential);
		
		System.out.println("Sum of even number (Parallel) : "+sum2);
		System.out.println("Time taken by Parallel stream : "+parallel);
		
	}
}
