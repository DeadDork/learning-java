class Point {
	public double x, y;

	public Point(double a, double b) {
		x = a;
		y = y;
	}
}

class Circle {
	public Point center;
	public double radius;

	public Circle(double a, double b, double c) {
		center = new Point(a, b);
		radius = c;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}

class Demo {
	public static Circle nudger(Circle circle, Point newCenter) {
		return new Circle(newCenter.x, newCenter.y, circle.radius);
	}

	public static void main(String[] argv) {
		Circle circleOld = new Circle(0, 0, 5);
		Circle circleNew = nudger(circleOld, new Point(5, 5));

		System.out.println("circleOld.center = [" + circleOld.center.x + ", " + circleOld.center.y + "]");
		System.out.println("circleOld.area() = " + circleOld.area() + "\n");

		System.out.println("circleNew.center = [" + circleNew.center.x + ", " + circleNew.center.y + "]");
		System.out.println("circleNew.area() = " + circleNew.area());
	}
}
