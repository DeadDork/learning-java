class ArrayDemo {
	public static void main(String[] argv) {
		int[][] multiDim = {
			{1, 2, 3, 4, 5},
			{10, 20, 30, 40, 50}
		};

		for (int i = 0; i < 2; ++i) {
			for (int ii = 0; ii < 5; ++ii) {
				System.out.println("multiDim[" + i + "][" + ii + "] = " + multiDim[i][ii]);
			}
		}
	}
}
