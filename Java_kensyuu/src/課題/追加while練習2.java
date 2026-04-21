package 課題;

import java.util.Scanner;

public class 追加while練習2 {
	public static void main(String[] args) {

		int a = 1;

		while (a <= 50) {
			System.out.println(a);
			a++;
		}
		System.out.println("Imput a number");

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();

		int b = 1;

		while (b <= N) {
			System.out.println(b);
			b++;
		}

		int c = 3;

		while (c <= 30) {
			System.out.println(c);
			c += 3;
		}

		int d = 1;

		while (d <= 20) {
			if (d % 2 != 0) {
				System.out.println(d);
			}
			d++;
		}

		System.out.println("Imput a number");

		int n = scanner.nextInt();

		while (n >= 1) {
			System.out.println(n);
			n--;
		}

		System.out.println("How many times do you want to say Hello?");

		int n1 = scanner.nextInt();

		while (n1 >= 0) {
			System.out.println("Hello");
			n1--;
		}

		int sum = 0;
		int e = 1;

		while (e <= 10) {
			sum += e;
			e++;
		}
		System.out.println(sum);

		int f = 1;

		while (f <= 50) {
			if (f % 5 == 0) {
				System.out.println(f);
			}
			f++;

		}

		System.out.println("Enter a number and I will only add the even numbers.");
		int n2 = scanner.nextInt();

		int sum3 = 0;

		while (n2 > 0) {
			if (n2 % 2 == 0) {
				sum3 += n2;

			}
			n2--;
		}
		System.out.println(sum3);

		int count = 0;
		int g = 1;

		while (g <= 20) {
			if (g % 3 == 0) {
				count++;
			}
			g++;
		}
		System.out.println("The count is " + count);

		System.out.println("Imput a number.");
		int h = scanner.nextInt();

		while (h >= 1) {
			System.out.println(h);
			h -= 2;
		}

		int n3 = scanner.nextInt();
		int i = 1;

		while (i <= n3) {
			if (i % 7 == 0) {
				System.out.println(i);
				break;
			}
			i++;
		}

		int sum4 = 0;

		while (true) {
			int n4 = scanner.nextInt();

			if (n4 == 0) {
				break;
			}
			sum4 += n4;
		}
		System.out.println(sum4);
		System.out.println("end");

		int n5 = scanner.nextInt();

		int result = 1;

		int j = 1;
		while (j <= n5) {
			result *= j;
			j++;
		}
		System.out.println(result);

		int n6 = scanner.nextInt();

		int counter = 0;

		while (n6 > 0) {
			n6 = n6 / 10;
			counter++;
		}
		System.out.println(counter);
	}

}
