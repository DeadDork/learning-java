class AClass {
	public int aMethod(int i) {
		return i;
	}
	public int aMethod(double f) {
		return (int)f;
	}
}

class Demo {
	public static void main(String[] argv) {
		AClass integer = new AClass();
		AClass floater = new AClass();

		System.out.println("integer = " + integer.aMethod(20));
		System.out.println("floater = " + floater.aMethod(33.3));
	}
}
