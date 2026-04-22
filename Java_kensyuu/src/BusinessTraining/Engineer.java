package BusinessTraining;

public class Engineer extends Employee {

	private String language;

	public Engineer(String name, String language) {
		super(name, "Engineer");
		this.language = language;
	}

	public void develop() {
		System.out.println(language + "で開発を行なった");
	}

	@Override
	public void displayInfo() {
		System.out.println(getName() + " : " + getDepartment() + " 使用言語 : " + language);

	}

}
