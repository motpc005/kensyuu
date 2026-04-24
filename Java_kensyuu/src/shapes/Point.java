package shapes;

public class Point {

	private int x;

	private int y;

	public Point() {
		int x = 0;
		int y = 0;
	}

	//dont put void to make it a constructor
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	//adding void makes it a getter
	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
