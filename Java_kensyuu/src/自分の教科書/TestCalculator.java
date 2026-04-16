package 自分の教科書;

public class TestCalculator {
	public static void main(String[] args) {
		SampleCalculator myCalc = new SampleCalculator(); //create a Calculator object

		//Test addition
		System.out.println("5 + 3 = " + myCalc.add(5, 3));

		//Test subtraction
		System.out.println("5 - 3 = " + myCalc.subtract(5, 3));

		//Test multipication
		System.out.println("5 * 3 = " + myCalc.multiply(5, 3));

		//Test division
		System.out.println("5 / 3 = " + myCalc.divide(5, 3));
	}
}
