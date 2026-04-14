package 自分の教科書;

public class pg78 {
	public static void main(String[] args) {
		
		String appleType = "Fuji";
		int numberOfApples = 5;
		String price = "$0.99"; //use this if all items are this price like Daiso 2
		double price1 = 0.99; //this is more common 1
		boolean stock = true;
		
		System.out.println("Apple Type: " + appleType);
		System.out.println("Number of Apples: " + numberOfApples);
		System.out.println("Price per Apple: " + price); //2
		System.out.println("Price per Apple: " + "$" + price1); //1
		System.out.println("Is Apple in Stock: " + stock);
	}

}
