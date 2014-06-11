// Explores scope in inner classes.

// On second thought, I can't really figure out a way to test scope with
// class blocks like this...

class Outer {
	public int i = 1;

	static class Inner {
		public int i = 2;
	}
}

class Demo {
	public static void main(String[] argv) {
		Outer o1 = new Outer();
		Outer.Inner o2 = new Outer.Inner();

		System.out.println("o1 = " + o1.i);
		System.out.println("o2 = " + o2.i);
	}
}
