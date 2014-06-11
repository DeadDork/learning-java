class Point {
	double x, y;

	public Point() {
		this(0,0);
	}

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

class Rectangle {
	Point p1, p2;

	public Rectangle() {
		this(new Point(), new Point(1,1));
	}

	public Rectangle(Point p2) {
		this(new Point(), p2);
	}

	public Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public double area() {
		return (this.p2.x - this.p1.x) * (this.p2.y - this.p1.y);
	}
}

class Demo {
	public static void main(String[] argv) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(new Point(2,2));
		Rectangle r3 = new Rectangle(new Point(3,3), new Point(4,4));

		System.out.println("r1.area() = " + r1.area()); // expected 1.0
		System.out.println("r2.area() = " + r2.area()); // expected 4.0
		System.out.println("r3.area() = " + r3.area()); // expected 1.0
	}
}
