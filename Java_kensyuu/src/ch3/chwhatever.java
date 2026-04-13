package ch3;

public class chwhatever {
	public static void main(String[] args) {
		System.out.println("You have stumbled across a fierce looking enemy.");
		System.out.println("It caught you by surprise.");
		System.out.println("You look for an escape but the chances are slim if you try.");

		int enemyHp = 30;
		int playerHp = 20;

		while (enemyHp > 0 && playerHp > 0) {
			System.out.println("attack or run away");
			String ans = new java.util.Scanner(System.in).nextLine();

			if (ans.equals("attack")) { // FIXED: attack block
				int playerDamage = new java.util.Random().nextInt(10);
				System.out.println("You deal " + playerDamage + " damage.");

				if (playerDamage == 0) {
					System.out.println("You missed.");
				} else {
					enemyHp = enemyHp - playerDamage; // FIXED: actually subtract HP
					System.out.println("Enemy HP: " + enemyHp);
				}

					// ✅ ENEMY ATTACK (moved outside miss condition)
				if (enemyHp > 0) {
					int enemyDamage = new java.util.Random().nextInt(12);
					System.out.println("Enemy deals " + enemyDamage + " damage.");

					if (enemyDamage == 0) {
						System.out.println("The enemy missed");
					} else {
						playerHp = playerHp - enemyDamage; // FIXED
						System.out.println("Your HP: " + playerHp);
					}
				}
			}

				// ✅ RUN AWAY LOGIC (moved outside attack block)
			else if (ans.equals("run away")) {
				int runAway = new java.util.Random().nextInt(10) + 1;

				if (runAway <= 3) {
					System.out.println("As you turn your back, you see a sword through your chest.");
					playerHp = 0; // lose
				} else if (runAway > 3 && runAway <= 7) { // FIXED syntax
					System.out.println("You are lifted into the air and dropped.");
					playerHp = 0; // lose
				} else if (runAway < 10) { // FIXED condition
					System.out.println("You almost escape... but fail.");
					playerHp = 0; // lose
				} else {
					System.out.println("You successfully escaped!");
					break; // exit loop = win
				}
			}
		}

			// ✅ CLEAN WIN/LOSE CONDITIONS
		if (enemyHp <= 0) {
			System.out.println("You have defeated the enemy!");
			System.out.println("You win!");
		} else if (playerHp <= 0) {
			System.out.println("You have been defeated.");
			System.out.println("You lose.");
		}

		System.out.println("Game Over");
	}
}

