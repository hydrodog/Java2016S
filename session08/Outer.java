public class Outer {
	private class Inner {


	}

  private Inner x;
	public Outer() {
    x = new Inner(); // points to this
	}
	public static void main(String[] a) {
		// ILLEGAL: Must be within a method of Outer		Inner x = new Inner();
		new Outer();
	}
}
