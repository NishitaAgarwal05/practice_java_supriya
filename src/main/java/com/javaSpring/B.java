package com.javaSpring;

import java.util.*;

/**
 * The {@code B} class provides methods to check for prime numbers,
 * palindrome integers, and palindrome strings.
 */

public class B {

	
	/**
     * Checks if a number is prime.
     *
     * @param n the number to check
     * @return {@code true} if {@code n} is prime, {@code false} otherwise
     */
	
	public static boolean prime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	 /**
     * Checks if an integer is a palindrome.
     *
     * @param n the integer to check
     * @return {@code true} if {@code n} is a palindrome, {@code false} otherwise
     */

	public static boolean palindrome(int n) {
		int temp = n;
		int rev = 0;

		while (temp != 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp /= 10;
		}
		if (n == rev) {
			return true;
		}
		return false;
	}

	
	/**
     * Checks if a string is a palindrome.
     *
     * @param s the string to check
     * @return {@code true} if {@code s} is a palindrome, {@code false} otherwise
     */
	
	public static boolean palindromeString(String s) {
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)

		{
			rev += s.charAt(i);

		}
		if (s.equals(rev)) {
			return true;
		}
		return false;
	}

}
