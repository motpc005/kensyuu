package BusinessTraining;

import java.util.ArrayList;

public class Engineer extends Employee {

	private ArrayList<String> languages = new ArrayList<>();

	public Engineer(String name) {
		super(name, "Engineer");
	}

	public void addLanguage(String lang) {
		languages.add(lang);
	}

	public void develop(String lang) {
		System.out.println(lang + "で開発を行った");
	}

	@Override
	public void displayInfo() {
		System.out.print(getName() + ": Engineer 信用言語:");

		for (String lang : languages) {
			System.out.print(lang + " ");
		}

		System.out.println();
	}

}
