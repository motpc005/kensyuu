package ch3;

public class ch3自分のゲーム1 {
	public static void main(String[] args) {
		System.out.println("You have stumbled across a fierce looking enemy.");
		System.out.println("It caught you by surprise.");
		System.out.println("You look for an escape but the chances are slim if you try.");
		int enemyHp = 30;
		int playerHp = 20;
		while (enemyHp > 0 && playerHp > 0)	{
			System.out.println("attack or run away");
			String ans = new java.util.Scanner(System.in).nextLine();
				if (ans.equals("attack")) { //3
					int playerDamage = new java.util.Random().nextInt(10);
						System.out.println("You deal" + playerDamage + "damage.");
							if (playerDamage == 0) { //2
							System.out.println("You missed.");
						System.out.println("Enemy HP:" + "" + (enemyHp - playerDamage)); //1
					int enemyDamage = new java.util.Random().nextInt(12);
							if (enemyDamage == 0) { //2
							System.out.println("The enemy missed");
						System.out.println("Your HP:" + "" + (playerHp - enemyDamage)); //1
				if (enemyHp <=0) {
					System.out.println("You have defeated the enemy!");
					System.out.println("You win!");
					System.out.println("Game Over");
				if (playerHp <=0) {
					System.out.println("You have been defeated.");
					System.out.println("You lose.");
					System.out.println("Game Over");
				if (ans.equals("run away")) { //3
					int runAway = new java.util.Random().nextInt(10) + 1;
				}
				
				/*switch (run away) {
				case 1:
				case 2:
				case 3:
					System.out.println("As you turn you back, you see a sword sticking through you chest.");
					System.out.println("You lose.");
					System.out.println("Game Over");
					break;
				case 4:
				case 5:
				case 6:
					System.out.println("You start running away and suddely notice you are being lifted high above the ground.");
					System.out.println("You are dropped and see nothing but black.");
					System.out.println("You lose.");
					System.out.println("Game Over");
					break;
				case 7:
				case 8:
				case 9:
					System.out.println("You turn and run away");
					System.out.println("It looks like your about to make an escape but suddenly...");
					System.out.println("Before you see nothing but black, you get a glipse of the creature");
					System.out.println("laughing as your head falls to the floor.");
					System.out.println("You lose.");
					System.out.println("Game Over");
					break;
				case 10:
					System.out.println("Despite the grim outlook, you were able to run away successfully!");
					System.out.println("You win!");
					System.out.println("Game Over");
					break;
				}
				}
				
		


/*mistakes I made: forgot to add () around calculations //1
 * forgot the double the = (==) when defining in if statements //2 Conects a string with a number
 * forgot the proper way to connect two strings in if statement //3  (<string>.equals("<whatever you want defined>"))
 */
