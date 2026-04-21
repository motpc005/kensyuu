package 課題;

public class Mathmax練習1 {
	public static void main(String[] args) {

		int a = 12;
		int b = 7;

		System.out.println(Math.max(a, b));

		int x = -3;
		int y = 5;

		System.out.println(Math.max(x, y));

		int c = 0;
		int d = -10;

		System.out.println(Math.max(c, d));

		int e = 15;
		int f = 15;
		int g = 10;

		int max1 = Math.max(e, f);
		System.out.println(Math.max(max1, g));

		int h = -8;
		int i = -3;
		int j = -12;

		System.out.println(Math.max(Math.max(h, i), j));

		int k = 4;
		int l = 9;
		int m = 2;

		System.out.println(Math.max(Math.max(k, l), m));

		int n = 6;
		int o = 2;
		int p = 10;
		int q = 4;

		System.out.println(Math.max(Math.max(Math.max(n, o), p), q));
		// System.out.println(Math.max(Math.max(n,o), Math.max(p,q))); works and is cleaner.
		
		System.out.println("C:\\Users");
			

	}

}
