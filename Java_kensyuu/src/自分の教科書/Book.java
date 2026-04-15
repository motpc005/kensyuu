package 自分の教科書;

public class Book {
	String title;
	String author;

	//constructor
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	void displayInfo() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}
//coding from here should be in another file for organization
//public was written at here but it's a mistake (public class TestBook)
