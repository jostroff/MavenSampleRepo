package ertert;

import static org.junit.Assert.*;

import org.junit.Test;

import com.first.MathOperation;

public class TestMath {

	@Test
	public void testAdd() {
		MathOperation mo = new MathOperation();
		int actual = mo.add(5, 5);
		int expected = 10;
		assertEquals(expected, actual);
	}
	@Test
	public void testSub() {
		MathOperation mo = new MathOperation();
		int actual = mo.sub(5, 5);
		int expected = 0;
		assertEquals(expected, actual);
	}
	@Test
	public void testMul() {
		MathOperation mo = new MathOperation();
		int actual = mo.mul(5, 5);
		int expected = 25;
		assertEquals(expected, actual);
	}
} //Must do Maven => Update, Run as => Maven Build => Goals: "test".





