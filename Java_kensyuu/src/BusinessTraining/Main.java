package BusinessTraining;

public class Main {
	
	public static void main(String[] args) {
		
		//Create system
		BusinessTraining bt = new BusinessTraining();
		
		//Create HR
		HR hr = new HR("Tanaka", bt);
		
		//Conduct interview
		hr.employeeInterview("Yamada", "Java");
		
		//Show all employees
		bt.displayEmployeeInfo();
	}

}
