package 自分の練習;

import java.util.Random;

public class battle {
	public static void main(String[] args) {
		
		int playerHp = 20;
		int enemyHp = 20;
		
		Random random = new Random();
		int playerDam = random.nextInt(7);
		int enemyDam = random.nextInt(7);
		
		while (playerHp > 0 && enemyHp > 0) {
			int enemyHp = enemyHp - playerDam;
			int playerHp = playerHp - enemyDam;
			
		} if (enemyHp <= 0) {
			System.out.println("After a glorious battle, you are standing there, victorious.");
			System.out.println("You win!");
			System.out.println("Game Over");
			break;

		} else if (playerHp <= 0) {
			System.out.println("You lie there face up as everything goes black.");
			System.out.println("You lose.");
			System.out.println("Game Over");
			break;
		}	
	}
}		