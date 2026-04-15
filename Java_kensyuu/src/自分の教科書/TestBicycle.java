package 自分の教科書;

public class TestBicycle {
	public static void main(String[] args) {
		Bicycle myBike = new Bicycle();

		myBike.increaseSpeed();

		System.out.println(myBike.speed);
	}

}

class Lamp {
	boolean isOn;

	void turnOn() {
		isOn = true;
		System.out.println("Lamp is on");
	}

	void turnOff() {
		isOn = false;
		System.out.println("Lamp is off");
	}

}