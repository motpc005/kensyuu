package ch3;

public class ch3_5練習 {
	public static void main(String[] args) {
		System.out.print("「メニュー」1:検索 2:登録 3:削除 4:変更");//original println
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.println("検索します");
			break;
		case 2:
			System.out.println("登録します");
			break;
		case 3:
			System.out.println("削除します");
			break;
		case 4:
			System.out.println("変更します");
			break;
		}
	}

}

//最初から自分のプログラムを作りましょう
/*public class main {
 * 	public static void main(String[] args) {
 * 		System.out.println("Menu 1:Go forward 2:Go back 3:Go right 4:Go left");
 * 		int number = new java.util.Scannar(System.in).nextInt();
 * 		switch (number) {
 * 		case 1:
 * 			System.out.println("You went forward");
 * 			break;
 * 		case 2:
 * 			System.out.println("You went back");
 * 			break;
 * 		case 3:
 * 			System.out.println("You went right");
 * 			break;
 * 		case 4:
 * 			System.out.println("You went left");
 * 			break;
 * 			}
 * 		}
 * }
*/
//もう一度練習したい
/*public class game
 * public static void main(String[] args) {
 * 	System.out.print("Your characher is confused and has choosen...");
 * 	int action = new java.util.Random().nextInt(4) + 1;
 * 	switch (action) {
 * 		case 1:
 * 			System.out.println("to lie down");
 * 			break;
 * 		case 2:
 * 			System.out.println("to attack");
 * 			break;
 * 		case 3:
 * 			System.out.println("to run away");
 * 			break:
 * 		case 4:
 * 			System.out.println("to scream and run around");
 * 			break;
 * 			}
 * 		}
 * }
 */
