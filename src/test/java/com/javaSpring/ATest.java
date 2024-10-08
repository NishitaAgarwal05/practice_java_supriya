package com.javaSpring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ATest {

	@Test
	public void testAddTwoNumbers() {
		assertEquals(5, A.add(2, 3));
	}

	@Test
	public void testSubtractTwoNumnbers() {
		assertEquals(7, A.subtract(10, 3));
	}

	@Test
	public void testMultiplyTwoNumbers() {
		assertEquals(6, A.multiply(2, 3));
	}

}
