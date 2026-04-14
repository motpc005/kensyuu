package 自分の教科書;

public class pg71 {
	static int staticVar = 0;
	
	public static void main(String[] args) {
		pg71.staticVar = 10;
		System.out.println("Static Variable Value: " + pg71.staticVar);
		
		pg71 anotherInstance = new pg71();
		anotherInstance.staticVar = 20;
		System.out.println("Static Variable Updated Value: " + pg71.staticVar);
	}

}
