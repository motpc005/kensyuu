package 課題;

public class 追加for練習2 {
	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 30; i++) {

			if (i % 3 == 0) {
				count++;
			}
		}
		System.out.println(count);

		int sum = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 5 == 0) {
				sum += i;
			}
		}

		System.out.println(sum);

		int oddCount = 0;

		for (int i = 1; i <= 25; i++) {

			if (i % 2 == 1) {
				oddCount++;
			}
		}
		System.out.println(oddCount);

		int oddSum = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 1) {
				oddSum += i;
			}
		}
		System.out.println(oddSum);

		int count1 = 0;

		for (int i = 1; i <= 20; i++) {

			if (i > 10) {
				count1++;
			}
		}
		System.out.println(count1);

		int sum1 = 0;

		for (int i = 1; i <= 25; i++) {

			if (i < 15) {
				sum1 += i;
			}
		}
		System.out.println(sum1);

		int count2 = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0 && i % 3 == 0) {
				count2++;
			}
		}
		System.out.println(count2);

		int sum2 = 0;

		for (int i = 1; i <= 20; i++) {

			if (i % 4 != 0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);

		int count3 = 0;

		for (int i = 1; i <= 30; i++) {

			if (i % 2 == 0 || i % 5 == 0) {
				count3++;
			}
		}
		System.out.println(count3);

		int count4 = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 || i % 7 == 0) {
				if (i % 5 != 0) {
					//if ((i % 3 == 0 ||i % 7== 0) && i % 5 != 0+) same but cleaner
					count4++;
				}
			}
		}
		System.out.println(count4);

		int sum3 = 0;

		for (int i = 1; i <= 30; i++) {
			if (!(i >= 10 && i <= 20)) {
				//different ways: if (i < 10 || i > 20) most common
				//another: continue;  Note: move sum3 += i outside bracket
				sum3 += i;
			}
		}
		System.out.println(sum3);

		for (int row = 1; row <= 5; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			System.out.println();
		}

		for (int row2 = 5; row2 >= 1; row2--) {

			for (int col = 1; col <= row2; col++) {
				System.out.print("*");

			}
			System.out.println();
		}

		int sum4 = 0;

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0 && i % 5 != 0) {
				sum4 += i;
			}
		}
		System.out.println(sum4);

		int count5 = 0;

		for (int i = 1; i <= 40; i++) {
			if (i > 10 && i % 2 == 0) {
				count5++;
			}
		}
		System.out.println(count5);

		int max = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				max = Math.max(max, i);
			}
		}
		System.out.println(max);

		for (int i = 1; i <= 20; i++) {
			if (i % 4 != 0) {
				System.out.println(i);
			}
		}

		for (int row1 = 1; row1 <= 4; row1++) {
			for (int col1 = 1; col1 <= 3; col1++) {
				System.out.print(row1);
			}
			System.out.println();
		}
	}
}
