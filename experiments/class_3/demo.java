// Explores scope in inner classes.

// Conclusion: classes can refer to higher scoped objects, but not instances.

class Outer {
	public static int i = 1;

	static class Inner {
		public static int j = i + 1;
	}

	// i = j; // Out of scope
}

class Demo {
	public static void main(String[] argv) {
		Outer o1 = new Outer();
		Outer.Inner o2 = new Outer.Inner();

		System.out.println("o1.i = " + o1.i);
		System.out.println("o2.j = " + o2.j);

		//System.out.println("o1.j = " + o1.j); // Out of scope
		//System.out.println("o2.i = " + o2.i); // Out of scope
	}
}
