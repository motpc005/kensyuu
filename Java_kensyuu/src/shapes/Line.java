package shapes;

public class Line implements Figure {

	private Point p1;
	private Point p2;

	public Line() {
		this.p1 = new Point(0,0);
		this.p2 = new Point(0,0);
	}

	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1 , y1);
		this.p2 = new Point(x2 , y2);
	}

	@Override
	public void draw() {
		System.out.println("[線を描画] 始点(" 
				+ p1.getX() + "," 
				+ p1.getY() + ")から終点(" 
				+ p2.getX() + "," 
				+ p2.getY() + ")まで");
	}

	public double getPerimeter() {
		
		double dx = p2.getX() - p1.getX();
		double dy = p2.getY() - p1.getY();
		
		return Math.sqrt
				(Math.pow(dx, 2) + Math.pow(dy, 2));
		
	}

}
