package com.javaSpring;

import java.util.Scanner;

@FunctionalInterface
interface Calculator {
	int calculate(int a, int b);
}

public class LambdaExpression {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number1 : ");
		int number1 = sc.nextInt();

		System.out.print("Enter number2 : ");
		int number2 = sc.nextInt();

		Calculator cAdd = (a, b) -> a + b;
		System.out.println("Add 2 numbers : " + cAdd.calculate(number1, number2));

		Calculator cSubtract = (a, b) -> a - b;
		System.out.println("Subtract 2 numbers : " + cSubtract.calculate(number1, number2));

		Calculator cMultiply = (a, b) -> a * b;
		System.out.println("Multiply 2 numbers : " + cMultiply.calculate(number1, number2));

	}

}
