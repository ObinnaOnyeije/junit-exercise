package junit_exercise;

public class Calculator {

	private static double result;
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		if (args.length < 3) {
			System.out.println("Not enough args");
			result = Double.MIN_VALUE;
		} else {
			try {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[2]);
				if (args[1].equals("+")) {
					System.out.println(calc.add(a, b));
				} else if (args[1].equals("-")) {
					System.out.println(calc.subtract(a, b));
				} else if (args[1].equals("*")) {
					System.out.println(calc.multiply(a, b));
				} else if (args[1].equals("/")) {
					System.out.println(calc.divide(a, b));
				} else {
					System.out.println("False operator");
					result = Double.MIN_VALUE;
				}
			} catch (Exception e) {
				System.out.println("Exception thrown");
				result = Double.MIN_VALUE;
			}
			
		}
	}
	
	public double add(double a, double b) {
		result = a + b;
		return result;
	}
	
	public double subtract(double a, double b) {
		result = a - b;
		return result;
	}

	public double multiply(double a, double b) {
		result = a * b;
		return result;
	}

	public double divide(double a, double b) {
		result = a / b;
		return result;
	}
	
	public static double getResult() {
		return result;
	}

}
