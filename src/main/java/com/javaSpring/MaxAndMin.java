package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class MaxAndMin {

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
		
		
	    OptionalInt max = listNumber.stream().mapToInt(n -> n).max();
		
		OptionalInt min = listNumber.stream().mapToInt(n -> n).min();
		
		
		System.out.println("Maximum number : "+max.getAsInt());
		System.out.println("Minimum number : "+min.getAsInt());
	}	
}
