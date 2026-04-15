package 自分の教科書;

import java.util.Scanner;

public class pg97 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		for (int i = 2; i <= number; i++) {
			if (isPrime(i)) {
				System.out.println(i + " is a prime number.");
			}
		}
	}
	
	private static boolean isPrime(int number) {
		for (int j = 2; j <= number / 2; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}
}
