package com.javaSpring;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSpringApplication {
	


	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int number1 = sc.nextInt();
		System.out.println("Enter number2 : ");
		int number2 = sc.nextInt();
		
		System.out.print("Add 2 numbers : ");
		System.out.println(A.add(number1,number2));
		System.out.print("Subtract 2 numbers : ");
		System.out.println(A.subtract(number1,number2));
		System.out.print("Multiply 2 numbers : ");
		System.out.println(A.multiply(number1,number2));
		
		
		System.out.println("Enter number3 : ");
		int number3 = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a string : ");
		String s = sc.nextLine();
		
		System.out.println("Is Prime : "+B.prime(number3));
		System.out.println("Is Palindrome : "+B.palindrome(number3));
		System.out.println("Is string palindrome : "+B.palindromeString(s));
		
//		SpringApplication.run(JavaSpringApplication.class, args);

	}

	
}
