package BusinessTraining;

public class Sales extends Employee {

	public Sales(String name) {
		super(name, "Sales");
	}

	public void weeklyReport() {
		System.out.println("週報の返信をした");
	}

	public void scheduleMeeting(Engineer engineer) {
		System.out.println(engineer.getName() + "の面談を組んだ");
	}

	public void newMeeting() {
		System.out.println("新規の打ち合わせをした");
	}

	@Override
	public void displayInfo() {
		System.out.println(getName() + " : " + getDepartment());
	}

}
