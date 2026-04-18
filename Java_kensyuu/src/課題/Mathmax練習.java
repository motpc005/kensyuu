package 課題;

public class Mathmax練習 {
	public static void main(String[] args) {

		int max = Math.max(5, 9);
		System.out.println(max);

		int a = 3;
		int b = 7;
		int c = 5;

		int max1 = Math.max(a, b);
		int max2 = Math.max(max1, c);
		System.out.println(max2);

		int max3 = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 4 == 0) {
				max3 = Math.max(max3, i);
			}
		}
		System.out.println(max3);

		int sum = 0;
		int max4 = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
			max4 = Math.max(max4, i);
		}
		System.out.println("Sum: " + sum);
		System.out.println("Max: " + max4);
	}
}
