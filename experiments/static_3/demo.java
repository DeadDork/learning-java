// Explores changing a class variable directly.

class Point {
	public double x, y;

	public static int i = 0;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void fields() {
		System.out.println("x = " + this.x);
		System.out.println("y = " + this.y);
		System.out.println("i = " + this.i + "\n");
	}
}

class Demo {
	public static void main(String[] argv) {
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,3);

		p1.fields();
		p2.fields();

		Point.i = 10;

		p1.fields();
		p2.fields();
	}
}
