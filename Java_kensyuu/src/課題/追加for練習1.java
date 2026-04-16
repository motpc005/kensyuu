package 課題;

public class 追加for練習1 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello " + i);
		}

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		for (int i = 0; i < 7; i++) {
			System.out.println("I am learning Java");
		}

		for (int i = 0; i <= 20; i += 5) {
			System.out.println(i);
		}
	}

}
