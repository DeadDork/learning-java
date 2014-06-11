// Explores IO

class Demo {
	public static void main(String[] argv) {
		int i;

		while ((i = System.in.read()) != '\n') {
			System.out.print("You entered [" + i + "]");
			System.out.println(i);
		}
	}
}
