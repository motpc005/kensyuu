package ch5;

public class ch5_4 {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("湊");
		hello("朝香");
		hello("菅原");
		System.out.println("メソッドを呼び出しました");
	}

	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは");
	}

}
/*public static void main(String[] args) {
 * 	System.out.println("List of things I will practice.");
 * 		list("organization");
 * 		list("conditionals");
 * 		list("modern formatting");
 * 
 * public static void list(String list) {
 */