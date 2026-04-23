package BusinessTraining;

public class HR extends Employee {

	private BusinessTraining system;

	public HR(String name, BusinessTraining system) {
		super(name, "HR");
		this.system = system;
	}

	public void employeeInterview(String name,String language) {

		String result = "Sales";

		Employee employee;

		if (result.equals("Sales")) {
			System.out.println("面接を行い、結果は採用だった (Sales)");

			//All the lines with "new" call the constructor
			employee = new Sales(name);
			system.createEmployee(employee);

		} else if (result.equals("HR")) {
			System.out.println("面接を行い、結果は採用だった (HR)");

			employee = new HR(name, system);
			system.createEmployee(employee);

		} else if (result.equals("Engineer")) {
			System.out.println("面接を行い、結果は採用だった (Engineer)");

			employee = new Engineer(name, language);
			system.createEmployee(employee);

		} else {

			System.out.println("面接を行い、結果は不採用だった");
			return;
		}

		System.out.println("登録完了: " + employee.getName());

	}

	public void payroll() {
		System.out.println("給与計算を行なった");
	}

	@Override
	public void displayInfo() {
		System.out.println(getName() + " : " + getDepartment());
	}

}
