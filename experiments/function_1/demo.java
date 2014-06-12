// Explores function order.

// Conclusion: order doesn't matter.

class Demo {
	public static void main(String[] argv) {
		greetSomeone("world");
	}

	public static void greetSomeone(String name) {
		greet();
		System.out.println(name);
	}

	public static void greet() {
		System.out.print("Hello ");
	}
}
