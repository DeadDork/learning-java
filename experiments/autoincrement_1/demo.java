// Explores whether it's possible to initialize to 1 via autoincrementing
// the default value. Lots of reasons why not...

class Demo {
	public static void main(String[] argv) {
		int i; // 0? Errors out: not initialized
		int ++j; // Error? 1? Error: not a statment

		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
}
