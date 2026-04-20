package 週末の練習;

import java.util.Random;
import java.util.Scanner;

public class practice1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //dont forget (System.in)
		Random random = new Random();

		String[] choice = new String[3];
		choice[0] = "rock";
		choice[1] = "paper";
		choice[2] = "scissors";

		while (true) { //this makes it so the game loops until told to quit
			System.out.println("rock, paper, scissors, 1, 2, ...");
			System.out.println("Please imput `rock`, `paper`, `scissors` or `quit`.");
			String ans = scanner.nextLine().toLowerCase();

			if (ans.equals("quit")) {
				break;
			}

			if (!ans.equals("rock") && !ans.equals("paper") && !ans.equals("scissors")) {
				System.out.println("Invalid answer. Please try again.");
				continue;
			}

			String oppAns = choice[random.nextInt(3)];
			System.out.println("Opponent choice: " + oppAns);

			if (ans.equals(oppAns)) {
				System.out.println("It's a draw");

			} else if (ans.equals("rock") && oppAns.equals("scissors") ||
					ans.equals("paper") && oppAns.equals("rock") ||
					ans.equals("scissors") && oppAns.equals("paper")) {
				System.out.println("You win!");

			} else {
				System.out.println("You lose.");
			}

		}

		System.out.println("Thanks for playing");
		scanner.close();
	}

}
