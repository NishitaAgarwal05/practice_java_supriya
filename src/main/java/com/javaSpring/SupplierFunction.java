package com.javaSpring;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunction {

	public static void main(String[] args) {

		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(100) + 1;
		};

		for (int i = 0; i < 5; i++) {
			System.out.println(randomIntegerSupplier.get());
		}

	}
}
