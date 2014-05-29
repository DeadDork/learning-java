class Demo {
	public static void main(String[] argv) {
		int i = 0, j = 0;
	loop1:
		for (; ; ++i) {
			for (; ; ++j) {
				break loop1;
			}
		}
		System.out.println("i = " + i);
		System.out.println("j = " + j);

		int ii = 0, jj = 0;
		for (; ii < 10; ++ii) {
			for (; ; ++jj) {
				break;
			}
		}
		System.out.println("ii = " + ii);
		System.out.println("jj = " + jj);

		int iii = 0, jjj = 0, kkk = 0;
		for (; iii < 10; ++iii) {
loop2:
			for (; jjj < 10; ++jjj) {
				for (; kkk < 10; ++kkk) {
					break loop2;
				}
			}
		}
		System.out.println("iii = " + iii);
		System.out.println("jjj = " + jjj);
		System.out.println("kkk = " + kkk);
	}
}
