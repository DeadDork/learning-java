// Explores subclassing (holy fucking shit NO. Switching from Haskell's
// brilliant type system to this boilerplate idiocy is *painful*).

class Geometry {
	public static class Point {
		public double x, y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	public static class Shape {
		public static class Rectangle {
			public Point p1, p2;

			public Rectangle(Point p1, Point p2) {
				this.p1 = p1;
				this.p2 = p2;
			}

			public double area() {
				return (this.p2.x - this.p1.x) * (this.p2.y - this.p1.y);
			}
		}

		public static class Circle {
			public Point center;
			public double radius;

			public Circle(Point center, double radius) {
				this.center = center;
				this.radius = radius;
			}

			public double area() {
				return 3.14 * this.radius * this.radius;
			}
		}
	}
}

class Demo {
	public static void main(String[] argv) {
		Geometry.Shape.Circle c = new Geometry.Shape.Circle(new Geometry.Point(0,0), 3);
		Geometry.Shape.Rectangle r = new Geometry.Shape.Rectangle(new Geometry.Point(0,0), new Geometry.Point(2,2));

		System.out.println("circle.area() = " + c.area());
		System.out.println("rectangle.area() = " + r.area());
	}
}
