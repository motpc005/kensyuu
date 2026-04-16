package 自分の練習;

import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please, input your age.");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("adult");

		} else if (age < 1 || age > 111) {
			System.out.println("Really?");

		} else {
			System.out.println("minor");
		}
		scanner.close();
	}

}
