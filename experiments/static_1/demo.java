// Explores static fields between different objects of the same class.

class Point {
	public double x, y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	public Point center;
	public double radius;

	public static int SomeNumber = 1;

	public Circle(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}

	public double area() {
		return 3.14 * this.radius * this.radius;
	}
}

class Demo {
	public static void main(String[] argv) {
		Circle c1 = new Circle(new Point(1,1), 2);
		Circle c2 = new Circle(new Point(3,3), 4);

		System.out.println("c1.SomeNumber = " + c1.SomeNumber); // 1
		System.out.println("c2.SomeNumber = " + c2.SomeNumber); // 1

		c2.SomeNumber = 2;

		System.out.println("c1.SomeNumber = " + c1.SomeNumber); // 2
		System.out.println("c2.SomeNumber = " + c2.SomeNumber); // 2
	}
}
