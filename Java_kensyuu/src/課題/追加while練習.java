package 課題;

import java.util.Scanner;

public class 追加while練習 {
	public static void main(String[] args) {

		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		while (i <= 20) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int i1 = 0;
		int sum = 0;

		while (i1 <= N) {
			sum += i1;
			i1++;
		}
		System.out.println(sum);

		int i2 = 10;

		while (i2 > 0) {
			System.out.println(i2);
			i2--;
		}
		Scanner scanner1 = new Scanner(System.in);
		int n = scanner1.nextInt();

		int i3 = 1;

		while (i3 <= 10) {
			System.out.println(n + "*" + i3 + "=" + (n * i3));
			i3++;
		}

	}

}
