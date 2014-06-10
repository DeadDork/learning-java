// Ummm wat?

class Circle {
	public static int startX = 0, startY = 0, radius = 1;

	public void coordinates() {
		System.out.println("x = " + startX + ", y = " + startY + ", radius = " + radius);
	}

	public void reset(Circle circle) {
		circle = new Circle(0, 0, 1);
	}

	public Circle(int x, int y, int r) {
		startX = x;
		startY = y;
		radius = r;
	}
}

class Demo {
	public static void main(String[] argv) {
		Circle circleA = new Circle(1, 2, 3);

		circleA.coordinates(); // x = 1, y = 2, radius = 3
		circleA.reset(circleA);
		circleA.coordinates(); // x = 0, y = 0, radius = 1
	}
}
