// Explores inheritence.

// Conclusion: I clearly do not understand inheritence in the leaste.

class Point {
	public double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

class Rectangle {
	public Point p1, p2;

	public Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public double area() {
		return (this.p2.x - this.p1.x) * (this.p2.y - this.p1.y);
	}

	public double perimeter() {
		return 2 * (this.p2.x - this.p1.x) + 2 * (this.p2.y - this.p1.y);
	}

	static class Square {
		public Point p1, p2;
		private double side;

		public Square(Point origin, double side) {
			this.p1 = origin;
			this.p2 = new Point(this.p1.x + side, this.p1.y + side);
		}

		public double perimeter() {
			return 4 * (this.p2.x - this.p1.x);
		}
	}
}

class Demo {
	public static void main(String[] argv) {
		Rectangle r = new Rectangle(new Point(0,1), new Point(2,3));
		Rectangle.Square s = new Rectangle.Square(new Point(4,5), 6);

		System.out.println("r.area() = " + r.area());
		// System.out.println("s.area() = " + s.area()); // Scope error

		System.out.println("r.perimeter() = " + r.perimeter());
		System.out.println("s.perimeter() = " + s.perimeter());
	}
}
