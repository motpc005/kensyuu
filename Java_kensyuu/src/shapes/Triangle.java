package shapes;

public class Triangle extends Polygon {
	
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.p1 = new Point(x1,y1);
		this.p2 = new Point(x2,y2);
		this.p3 = new Point(x3,y3);
	}
	
	@Override
	public void draw() {
		System.out.println("[三角形を描画] 点1("
				+ p1.getX() + "," + p1.getY()
				+ ")から点2("
				+ p2.getX() + "," + p2.getY()
				+ ")、点3("
				+ p3.getX() + "," + p3.getY()
				+ ")の三角形");
	}
	
	@Override
	public double getPerimeter() {
		
		double dx1 = p1.getX() - p2.getX();
		double dy1 = p1.getY() - p2.getY();
		double side1 = Math.sqrt(Math.pow(dx1, 2) + Math.pow(dy1, 2));
		
		double dx2 = p2.getX() - p3.getX();
		double dy2 = p2.getY() - p3.getY();
		double side2 = Math.sqrt(Math.pow(dx2, 2) + Math.pow(dy2, 2));
		
		double dx3 = p3.getX() - p1.getX();
		double dy3 = p3.getY() - p1.getY();
		double side3 = Math.sqrt(Math.pow(dx3, 2) + Math.pow(dy3, 2));
		
		return side1 + side2 + side3;
	}

}
