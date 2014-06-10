class Point {
	public int x, y;
	
	public Point(int a, int b) {
		x = a;
		y = b;
	}
}

class Circle {
	public Point center;
	public int radius;

	public Circle(int a, int b, int c) {
		center = new Point(a, b);
		radius = c;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}

class Demo {
	public static void main(String[] argv) {
		Circle myCircle = new Circle(3, 4, 2);

		System.out.println(myCircle.area());
	}
}
