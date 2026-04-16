package 自分の教科書;

public class SampleCalculator {

	//Method to add two numbers
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	//Method to subtract two numbers
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	//Method to multiply two numbers
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	//Method to divide two numbers
	public double divide(double num1, double num2) {
		if (num2 != 0) {
			return num1 / num2;
		} else {
			System.out.println("Error: Division by zero");
			return 0;
		}
	}

}
