package 自分の練習;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Please, input your age.");
			int age = scanner.nextInt();

			if (age < 1 || age > 111) {
				System.out.println("Really?");

			} else if (age >= 18) {
				System.out.println("Adult");
				break;

			} else {
				System.out.println("Minor");
				break;
			}

		}
		Scanner close;
	}
}
