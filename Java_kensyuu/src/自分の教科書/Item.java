package 自分の教科書;

class Item {
	String title;
	boolean isCheckedOut;

	public Item(String title) {
		this.title = title;
		this.isCheckedOut = false;
	}

	public void checkOut() {
		if (!isCheckedOut) {
			isCheckedOut = true;
			System.out.println(title + " has been checked out.");
		} else {
			System.out.println(title + " is already checked out.");
		}
	}

	public void checkIn() {
		if (isCheckedOut) {
			isCheckedOut = false;
			System.out.println(title + " has been checked in.");
		} else {
			System.out.println(title + " is already checked in.");
		}
	}

	public void displayStatus() {
		System.out.println(title + " is " +
				(isCheckedOut ? "checked out" : "available") + ".");
	}
}

class Book extends Item {
	String author;

	public Book(String title, String author) {
		super(title);
		this.author = author;
	}
}

class DVD extends Item {
	String director;

	public DVD(String title, String director) {
		super(title);
		this.director = director;
	}
}

public class LibrarySystem {
	public static void main(String[] args) {

		Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		DVD dvd = new DVD("Inception", "Christopher Nolan");

		book.checkOut();
		dvd.checkOut();

		book.displayStatus();
		dvd.displayStatus();

		book.checkIn();
		dvd.checkIn();

		book.displayStatus();
		dvd.displayStatus();
	}
}