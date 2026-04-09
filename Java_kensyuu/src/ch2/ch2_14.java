package ch2;

public class ch2_14 {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(90);
		/*the boundries of the generation is from 0 to whatever number was imput minus 1.
		in this case, 89 is the maximum*/
		System.out.println("あなたはたぶん、" + r + "歳ですね？");
	}
}
