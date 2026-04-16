package 課題;

public class 追加for練習 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
/*
class practice0 {
	public static void main(String[] args) {

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}

class practice1 {
	public static void main(String[] args) {

		for (int i = 0; i <= 20; i += 2) {
			System.out.println(i);
		}
	}
}

class practice2 {
	public static void main(String[] args) {

		for (int i = 1; i < 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}

class practice3 {
	public static void main(String[] args) {

		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}

class practice4 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");

		}
	}
}

class practice5 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println(sum);

	}
}

class practice6 {
	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}

class practice7 {
	public static void main(String[] args) {

		int sum = 1;

		for (int i = 1; i <= 5; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}

class practice8 {
	public static void main(String[] args) {

		for (int countDown = 10; countDown >= 0; countDown--) {
			System.out.println(countDown);
		}
		System.out.println("Blast Off!");
	}
}

class practice9 {
	public static void main(String[] args) {

		int score = 0;

		for (int i = 0; i < 5; i++) {
			score += 10;
			System.out.println(score);
		}
	}
}

class practice10 {
	public static void main(String[] args) {

		int totalDamage = 0;
		Random random = new Random();

		for (int i = 0; i < 5; i++) {
			int damage = random.nextInt(6) + 1;
			totalDamage += damage;
			System.out.println("You deal" + damage);
		}
		System.out.println("Your total damage is " + totalDamage);
	}
}

class practice11 {
	public static void main(String[] args) {

		int enemyHp = 30;

		for (int i = 0; i < 10; i++) {
			enemyHp -= 3;
			System.out.println("Boss HP: " + enemyHp);
			if (enemyHp <= 0) {
				System.out.println("You have defeated the boss");
				System.out.println("You win!");
				break;
			}
		}
	}
}
*/