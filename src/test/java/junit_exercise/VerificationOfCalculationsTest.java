package junit_exercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificationOfCalculationsTest {
	
	Calculator calc = new Calculator();
	double result;
	double a = 2;
	double b = 2;
	double[] operands = {2, 2.5, 3.25, Double.MAX_VALUE, Double.MIN_VALUE};
	String[] operators = {"+", "-", "*", "/"};
	double[] answerSet1 = {4, 0, 4, 1};
	double[] answerSet2 = {5.75, -0.75, 8.125, (2.5/3.25)};

	@Test
	void testMain() {
		for (int i = 0; i < operators.length; i++) {
			String[] args = {Double.toString(operands[0]), operators[i], Double.toString(operands[0])};
			Calculator.main(args);
			assertEquals(answerSet1[i], Calculator.getResult());
		}
		
		for (int i = 0; i < operators.length; i++) {
			String[] args = {Double.toString(operands[1]), operators[i], Double.toString(operands[2])};
			Calculator.main(args);
			assertEquals(answerSet2[i], Calculator.getResult());
		}
		
		String[] overflowArgs1 = {Double.toString(operands[3]), operators[0], Double.toString(operands[3])};
		Calculator.main(overflowArgs1);
		assertEquals(Double.POSITIVE_INFINITY, Calculator.getResult());
		
		String[] overflowArgs2 = {Double.toString(operands[4]), operators[1], Double.toString(operands[4])};
		Calculator.main(overflowArgs2);
		assertEquals(0, Calculator.getResult());
		
		String[] overflowArgs3 = {Double.toString(operands[3]), operators[2], Double.toString(operands[3])};
		Calculator.main(overflowArgs3);
		assertEquals(Double.POSITIVE_INFINITY, Calculator.getResult());
		
		String[] noArgs = {};
		Calculator.main(noArgs);
		assertEquals(Double.MIN_VALUE, Calculator.getResult());
		
		String[] falseOp = {Double.toString(operands[0]), "b", Double.toString(operands[0])};
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
