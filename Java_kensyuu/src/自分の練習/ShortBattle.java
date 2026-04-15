package 自分の練習;

import java.util.Scanner;

public class ShortBattle {
	public static void main(String[] args) {

		System.out.println("Welcome to the arena!");
		System.out.println("Will you bath in honour and riches or will you cower away?");
		System.out.println("Please enter `fight` or `run away`");

		Scanner scanner = new Scanner(System.in);

		String ans;

		while (true) {
			ans = scanner.nextLine();

			if (ans.equals("run away")) {
				System.out.println("A crowd of people boo and throw tomatoes at you");
				System.out.println("as you walk away in shame.");
				System.out.println("Game Over");
				break;

			} else if (ans.equals("fight")) {
				System.out.println("The crowd cheers for you as you walk to the pit to prepare.");
				System.out.println("As you prepare your weapon and armor, the crowd's cries are so loud "
						+ "it feels like an earthquake.");
				System.out.println("You feel your nerves getting to you.");
				System.out.println("You have a choice, `continue` or `sneak out`");
				ans = scanner.nextLine();

			}
			if (ans.equals("continue")) {
				System.out.println("The battle starts and...");

				startBattle.startBattle(); //battle.main(args);

				break;

			} else if (ans.equals("sneak out")) {
				System.out.println("You are able to successfully sneak out , but");
				System.out.println("live your remaining days secluded in shame.");
				System.out.println("Game Over");
				break;

			} else {
				System.out.println("Please put in a valad answer");
			}
		}

	}

}
