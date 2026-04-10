package ch3;

public class ch3自分のゲーム {
	public static void main(String[] args) {

		System.out.println("You have encountered an enemy.");

		int enemyHp = 20;
		int userHp = 20;

		while (enemyHp > 0 && userHp > 0) {
			System.out.println("Fight or Flight?");
			String ans = new java.util.Scanner(System.in).nextLine();

			if (ans.equals("Fight")) {
				int userDamage = new java.util.Random().nextInt(10);

				System.out.println("You attack and deal " + userDamage + " damage.");

				if (userDamage == 0) {
					System.out.println("You missed.");
				} else {
					enemyHp = enemyHp - userDamage;
					System.out.println("Enemy HP: " + enemyHp);
				}

				// 🔽 ENEMY TURN STARTS HERE 🔽
				if (enemyHp > 0) {

					int enemyDamage = new java.util.Random().nextInt(7);

					System.out.println("Enemy attacks and deals " + enemyDamage + " damage.");

					if (enemyDamage == 0) {
						System.out.println("Enemy missed.");
					} else {
						userHp = userHp - enemyDamage;

						// 👉 PRINT USER HP
						System.out.println("Your HP: " + userHp);
					}
				}
			}

			if (ans.equals("Flight")) {
				System.out.println("You run away.");
				System.out.println("Game Over");
				break;
			}
		}

		if (enemyHp <= 0) {
			System.out.println("You win! Congrats!");
			System.out.println("Game Over");
		}
		if (userHp <= 0) {
			System.out.println("You died.");
			System.out.println("Game Over");
		}

	}
}