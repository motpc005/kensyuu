package BusinessTraining;

import java.util.ArrayList;

public class BusinessTraining {

	private final String companyName = "BT";

	private ArrayList<Employee> employeeList = new ArrayList<>();
	private ArrayList<String> departmentList = new ArrayList<>();

	public BusinessTraining() {
		departmentList.add("HR");
		departmentList.add("Sales");
		departmentList.add("Engineer");
	}

	public void createEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public void displayEmployeeInfo() {
		for (Employee employee : employeeList) {
			employee.displayInfo();
		}
	}
}
