package com.javaSpring;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GroupBy {



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
		
		Map<Integer, List<String>> lengthValue = listString.stream().collect(Collectors.groupingBy(s -> s.length()));
		
		lengthValue.forEach((length,string)->{
			System.out.println("String : "+string+" Length : "+length);
		});
	}
}
