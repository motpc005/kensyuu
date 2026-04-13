package 自分の教科書;

public class pg67 {
	int instanceVar; //`instanceVar` is an instance variable

	public static void main(String[] args) {
		pg67 obj = new pg67();
		//The above has to be the same as the class name when creating obj. ;thus, pg67 and not InstanceVarExample.
		obj.instanceVar = 5;
		System.out.println("Instance Variable Value: " + obj.instanceVar);
	}
}
