class Object {
	public int field = 0;

	public Object() {
		field = 1;
	}
}

class Demo {
	public static void main(String[] argv) {
		Object objA = new Object();
		System.out.println(objA.field);
	}
}
