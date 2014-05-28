class ArrayCopyOfDemo {
	public static void main(String[] argv) {
		char[] source = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
		char[] target = java.util.Arrays.copyOfRange(source, 2, 9);
		System.out.println(new String(target));
	}
}
