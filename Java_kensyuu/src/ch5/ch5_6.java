package ch5;

public class ch5_6 {
	public static void main(String[] args) {
		add(12, 8);
		add(77, 90);
		sub(87, 22);
		sub(24, 78);
		mult(2, 5);
		mult(8, 8);
		div(90, 4);
		div(9.00, 10.00);
	}
	public static void add(int x, int y) {
		int ans = x + y;
		System.out.println(x + "+" + y + "=" + ans);
	}	
	public static void sub(int x, int y) {
		int ans = x - y;
		System.out.println(x + "-" + y + "=" + ans);
	}
	public static void mult(int x, int y) {
		float ans = x * y ;
		System.out.println(x + "*" + y + "=" + ans);
	}
	public static void div(double x, double y) {
		double ans = x / y;
		System.out.println(x + "/" + y + "=" + ans);
	}
		
}
