package ch3;

public class ch3_1練習 {
	public static void main(String[] args) {
		int isHungry = 1;
		String food = "鍋";
		System.out.println("こんにちは");
		//int isHungry = java new.util.Scanner(System.in).nextLine(); (wasnt needed)
		if (isHungry == 0) {
			System.out.println("お腹がいっぱいです");
			//break;  (not needed because there is no loop
		} else {
			System.out.println("はらぺこです");
		}
		if (isHungry == 1) { //i didnt put this in. had to look at answer
			System.out.println(food + "をいただきます");
		}
		System.out.println("ごちそうさまでした");
	}
}
