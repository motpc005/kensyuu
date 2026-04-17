package 課題;

public class 追加for練習1 {
	public static void main(String[] args) {
		//The below is practice from 4-17

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		int sum = 0;

		for (int i = 0; i <= 5; i++) { //putting i = 1 is better
			sum += i;
			System.out.println(sum);
		}
		System.out.println("Total: " + sum);

		for (int i = 1; i <= 10; i++) {

			if (i >= 5) { // was ask for i > 5
				System.out.println(i);
			}
		}

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				continue;

			} else if (i % 2 == 0) {
				System.out.println(i);

				/* there are two cleaner version below
				 * if (i % 2 == 0) {
				 * System.out.println(i);
				 * 
				 * or
				 * 
				 * if (i % 2 == 1) {
				 * continue; 
				 * System.out.println(i);	
				 */

			}
		}

		for (int i = 0; i <= 10; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");

			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else if (i % 3 == 0) {
				System.out.println("Fizz");

			} else {
				System.out.println(i);
			}
		}

		for (int i = 1; i <= 20; i += 2) {
			System.out.println(i);
		}

		sum = 0; // not 1

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println(sum);
		//NOTE for code below: in this case (i += 4) is more efficient and cleaner
		for (int i = 1; i <= 30; i++) { //this way is...

			if (i % 4 == 0) { // ... good for flexiblity. Ex: adding more if statements
				System.out.println(i);
			}
		}

		int count = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {//i put count instead of i.  when done the result is 1 not 10
				count++;
			}
		}
		System.out.println(count);

		sum = 0;
		//int i = 0; not needed because defined in for line

		for (int i = 1; i <= 15; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);

	}
}

//The below was practice from 4-16
/*		for (int i = 1; i <= 10; i++) {
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

}*/
