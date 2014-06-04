class Hate {
	public int f(double f) {
		return (int)f;
	}
}

class Demo {
	public static void main(String[] argv) {
		Hate hater = new Hate();

		System.out.println(hater.f(1.5));
	}
}
