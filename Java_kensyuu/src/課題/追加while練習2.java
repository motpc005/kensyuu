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

		Scanner scanner1 = new Scanner(System.in);
		int n = scanner1.nextInt();

		while (n >= 1) {
			System.out.println(n);
			n--;
		}

		System.out.println("How many times do you want to say Hello?");
		Scanner scanner2 = new Scanner(System.in);

		int n1 = scanner2.nextInt();

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
		Scanner scanner3 = new Scanner(System.in);
		int n2 = scanner3.nextInt();

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
		Scanner scanner4 = new Scanner(System.in);
		int h = scanner4.nextInt();

		while (h >= 1) {
			System.out.println(h);
			h -= 2;
		}
		
	}

}
