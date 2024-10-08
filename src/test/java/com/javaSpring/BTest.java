package com.javaSpring;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BTest {

	
	
	@Test
	public void testPrime()
	{
		assertTrue(B.prime(7));
		assertFalse(B.prime(1));
	}
	
	@Test
	public void testPalindrome()
	{
		assertTrue(B.palindrome(121));
		assertFalse(B.palindrome(100));
		
	}
}
