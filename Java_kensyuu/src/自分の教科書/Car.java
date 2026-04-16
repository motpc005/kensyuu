package 自分の教科書;

class Car extends Vehicle { //Subclass
	public void display() {
		super.display(); // Calls the display method of Vehicle
		System.out.println("This is a Car");
	}
}
