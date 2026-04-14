package 自分の教科書;

import java.util.Random;
import java.util.Scanner;

public class pg89c {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberToGuess = random.nextInt(50) + 1;
		int numberOfTries = 0;
		int guess;
		boolean win = false;
		
	System.out.println("Guess a number from 1 to 50");
	
		while (win != true) {
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
		System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
	}

}
