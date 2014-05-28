// Explores continue & blocking control flow statements

class Demo {
	public static void main(String[] argv) {
		/* Won't work, as int x != bool x
		int x;

		do {
			if (x == 11)
				break;
			if (x % 2 > 1)
				continue;
			System.out.println(x);
		} while (++x);
		*/

		for (int x = 0; ; ++x) {
			if (x == 11)
				break;
			if (x % 2 > 1)
				continue;
			System.out.println(x);
		}
	}
}
