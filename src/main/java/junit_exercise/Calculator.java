package junit_exercise;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		if (args.length < 3) {
			System.out.println("Not enough args");
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
				}
			} catch (Exception e) {
				System.out.println("Exception thrown");
			}
			
		}
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public double subtract(double a, double b) {
		return a - b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

}
