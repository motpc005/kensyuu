package ch3;

public class ch3_6練習 {
	public static void main(String[] args) {
		System.out.print("【数あてゲーム】");
		int ans = new java.util.Random().nextInt(10);/*thought i had to define the number
														so i thought only one util was needed.  */
		for (int x = 0; x < 5; x++) { // i put x < 10; x += 2 / the x < 5 means you get 5 tries
			System.out.println("0～9の数字を入力してください");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {//i put x == 5; thought i had to choose my own number
				System.out.println("アタリ！");
				break;
			} else { //I forgot the } {
				System.out.println("違います");
			}
		}
		System.out.println("ゲームを終了します");
	}
}
//i will look at the answer and make notes on the corrections.  I will practice a few more times after.

/*public class game
 * 	public static void main(String[] args) {
 * 		System.out.println("Let's play a guessing game.");
 * 		System.out.println("You get five tries.");
 * 		int ans = new java.util.Random().nextInt(10);
 * 		for (int i = 0; i < 5; i++) {
 * 			System.out.println("Guess a number 1 through 10");
 * 			int guess = new java.Scanner(System.in).nextInt();
 * 				if (ans == guess) {
 * 					System.out.println("Correct!")
 * 					break;
 * 					} else {
 * 					System.out.println("Try again");
 * 					}
 * 				}
 * 			System.out.println("Game over");
 * 		}
 * }
 */
