package shapes;

public class Rectangle extends Polygon {
	
	protected Point p;
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.p = new Point(x, y); 
		this.width = width;
		this.height = height;
		this.angle = 4;
		
	}
	
	@Override
	public void draw() {
		System.out.println("[長方形(矩形)を描画]点("
				+ p.getX() + "," + p.getY() + ")を基準として幅"
				+ width + "、高さ"
				+ height + "の長方形");
	}
	
	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

}
