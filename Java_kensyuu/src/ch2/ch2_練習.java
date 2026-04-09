package ch2;

public class ch2_練習 {
	public static void main(String[] args) {
		System.out.println("ようこぞ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new java.util.Random().nextInt(4);//this gives value of 0 to 3
		fortune++;//this shifts the values plus 1, thus making the new value range 1 to 4
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune +"です");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
		//Lines 9 -  12 were difficult.  I had to look at the book for the answer.
	}

}
