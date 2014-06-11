// Explores whether an `if` is a function.

class Demo {
	public static voic main(String[] argv) {
		int x, y;

		x = 0;
		//x = 1;
		y = if (x == 0) 0 else 1; // error: illegal start of expression

		System.out.println("y = " + y);
	}
}
