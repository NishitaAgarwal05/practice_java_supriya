package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reduce {

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
		
		int product = listNumber.stream().reduce(1,(x,y) -> x*y);
		
		System.out.println("Product of 2 numbers are : "+product);
		
	}
}
