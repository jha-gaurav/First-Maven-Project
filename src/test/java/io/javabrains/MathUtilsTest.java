package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		MathUtils mus = new MathUtils();
		int expected = 2;
		int actual = mus.add(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivide() {
		MathUtils mus = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mus.divide(1,0));
	}
	
	@Test
	void testMul() {
		MathUtils mus = new MathUtils();
		int expected = 15;
		int actual = mus.multiply(3, 5);
		assertEquals(expected, actual);
	}

}
