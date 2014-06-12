// Explores recursion & class methods

class Math {
	public static int factorial(int n) {
		if (n < 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}

class Demo {
	public static void main(String[] argv) {
		System.out.println("12! = " + Math.factorial(12));
	}
}
