package 自分の教科書;

public class Calculator {
	public static int addNumbers(int a, int b) {
		return a + b;
	}

	public static int subNumbers(int a, int b) {
		return a - b;
	}

	public static void main(String[] args) {
		int result = addNumbers(5, 10);
		System.out.println("The sum is: " + result);

		int result1 = addNumbers(1, 2);
		System.out.println(result1);

		int result2 = subNumbers(5, 10);
		System.out.println(result2);

		int result3 = subNumbers(10, 5);
		System.out.println(result3);
	}
}
