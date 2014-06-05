class Object {
	public int field = 0;

	public Object() {
		field = 1;
	}

	public Object(int a) {
		field = a;
	}
}

class Demo {
	public static void main(String[] argv) {
		Object objA = new Object();
		System.out.println(objA.field);

		Object objB = new Object(4);
		System.out.println(objB.field);
	}
}
