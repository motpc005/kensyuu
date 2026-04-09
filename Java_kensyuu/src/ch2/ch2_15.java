package ch2;

public class ch2_15 {
	public static void main(String[] args) {
		System.out.println("あなたの名前を入力ください。");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力ください。");
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこぞ、" + age + "歳の" + name + "さん");
	}
}
