public class Outer2 {
	private static class Inner { // static class are NOT INNER CLASSES
		// name of this class is Outer2.Inner

	}

  private Inner x;
	public Outer() {
    x = new Inner(); // there is no pointer to parent
	}
	public static void main(String[] a) {
		Inner x = new Inner();
		new Outer();
	}
}
