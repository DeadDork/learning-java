class UnaryPlus {
	public static void main(String[] argv) {
		int n, nn = 10;

		n = -nn; // n = -10? Yes
		System.out.println(n);

		nn = +n; // nn = 10? No
		System.out.println(nn);
	}
}
