package 自分の教科書;

import java.util.Random;
import java.util.Scanner;

public class pg89 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberToGuess = random.nextInt(100) + 1;
		int numberOfTries = 0;
		int guess;
		boolean win = false;
		
		System.out.println("Guess a number between 1 and 100");
		
		while (!win) {
			guess = scanner.nextInt();
			numberOfTries++;
			
			if (guess == numberToGuess) {
				win = true;
			} else if (guess < numberToGuess) {
				System.out.println("Too low");
			} else if (guess > numberToGuess) {
				System.out.println("Too high");
			}
			}
		System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries");
	}

}
