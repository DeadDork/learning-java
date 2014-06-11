class Point {
	public double x, y;

	//public static final int z = 3;
	public final int z = 3; // is it OK to not have `static`? Yes

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void fields() {
		System.out.println("[" + this.x + ", " + this.y + ", " + this.z + "]");
	}
}

class Demo {
	public static void main(String[] argv) {
		Point p1 = new Point(1.0, 2.0);
		Point p2 = new Point(3.0, 4.0);

		p1.fields();
		p2.fields();

		//p1.z = 4; // Should not compile. Does not compile.

		p1.fields();
		p2.fields();
	}
}
