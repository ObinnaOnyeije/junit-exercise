package junit_exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificationOfCalculationsTest {
	
	Calculator calc = new Calculator();
	double result;
	double a = 2;
	double b = 2;
	String[] operators = {"+", "-", "*", "/"};

	@Test
	void testMain() {
		for (int i = 0; i < operators.length; i++) {
			String[] args = {Double.toString(a), operators[i], Double.toString(b)};
			Calculator.main(args);
		}
		String[] noArgs = {};
		Calculator.main(noArgs);
		
		String[] falseOp = {Double.toString(a), "b", Double.toString(b)};
		Calculator.main(falseOp);
		
		String[] except = {"s", "/", "0"};
		Calculator.main(except);
		
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
