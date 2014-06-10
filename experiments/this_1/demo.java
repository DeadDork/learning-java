class Point {
	double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	Point center;
	double radius;

	public Circle(Point c, double r) {
		this.center = c;
		this.radius = r;
	}

	public double area() {
		return 3.14 * this.radius * this.radius;
	}
}

class Demo {
	public static void main(String[] argv) {
		Circle a = new Circle(new Point(1.0, 2.0), 17.0);

		System.out.println("a.area() = " + a.area());
	}
}
