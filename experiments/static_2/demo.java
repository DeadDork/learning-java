// Explores static fields in classes.

class Auto {
	public static int n = 0;

	public Auto() {
		++n;
	}
}

class Demo {
	public static void main(String[] argv) {
		Auto a = new Auto();
		System.out.println(a.n);

		Auto b = new Auto();
		System.out.println(b.n);
	}
}
