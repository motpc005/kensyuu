package 自分の教科書;

class Animal {
	public void sound() {
		System.out.println("Some Sound");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("Meow");
	}
}

class Cow extends Animal {
	public void sound() {
		System.out.println("Moo");
	}
}

public class TestPolymorphism {
	public static void main(String[] args) {
		Animal myAnimal = new Cat();
		myAnimal.sound();
		Animal myAnimal1 = new Cow();
		myAnimal1.sound();
	}

}
