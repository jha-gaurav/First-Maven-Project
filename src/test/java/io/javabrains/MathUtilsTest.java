package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		//System.out.println("Test ran successfully");
		MathUtils mus = new MathUtils();
		int expected = 2;
		int actual = mus.add(1, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDivide() {
		MathUtils mus = new MathUtils();
		assertThrows(ArithmeticException.class, () -> mus.divide(1,0));
		//assertThrows(NullPointerException.class, () -> mus.divide(1,0));
	}

}
