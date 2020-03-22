package junit_exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificationOfCalculationsTest {
	
	Calculator calc = new Calculator();
	double result;
	double a = 2;
	double b = 2;
	String[] operators = {"+", "-", "*", "/"};
	double[] answers = {4, 0, 4, 1};

	@Test
	void testMain() {
		for (int i = 0; i < operators.length; i++) {
			String[] args = {Double.toString(a), operators[i], Double.toString(b)};
			Calculator.main(args);
			assertEquals(answers[i], Calculator.getResult());
		}
		String[] noArgs = {};
		Calculator.main(noArgs);
		assertEquals(Double.MIN_VALUE, Calculator.getResult());
		
		String[] falseOp = {Double.toString(a), "b", Double.toString(b)};
		Calculator.main(falseOp);
		assertEquals(Double.MIN_VALUE, Calculator.getResult());
		
		String[] except = {"s", "/", "0"};
		Calculator.main(except);
		assertEquals(Double.MIN_VALUE, Calculator.getResult());
		
	}

	@Test
	void testAdd() {
		result = calc.add(a, b);
		assertEquals((a + b), result);
	}

	@Test
	void testSubtract() {
		result = calc.subtract(a, b);
		assertEquals((a - b), result);
	}

	@Test
	void testMultiply() {
		result = calc.multiply(a, b);
		assertEquals((a * b), result);
	}

	@Test
	void testDivide() {
		result = calc.divide(a, b);
		assertEquals((a / b), result);
	}

}
