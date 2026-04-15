package 自分の練習;

import java.util.Random;

public class startBattle {
	public static void startBattle() {

		int playerHp = 21;
		int enemyHp = 20;

		while (playerHp > 0 && enemyHp > 0) {
			Random random = new Random();
			int playerDam = random.nextInt(7);
			int enemyDam = random.nextInt(7);
			enemyHp = enemyHp - playerDam;
			playerHp = playerHp - enemyDam;

		}
		if (enemyHp <= 0) {
			System.out.println("After a glorious battle, you are standing there, victorious.");
			System.out.println("You win!");
			System.out.println("Game Over");

		} else if (playerHp <= 0) {
			System.out.println("You lie there face up as everything goes black.");
			System.out.println("You lose.");
			System.out.println("Game Over");
		}
	}
}
