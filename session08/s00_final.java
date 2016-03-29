public class s00_final {
  private int abc;

	

	public static void main(String[] args) {
		final int y = 3; // y can't change
		final s00_final x = new s00_final();
		x.abc = 5;
		// x cannot point to anything else		x = new 

		String a = "abc";
		a += "def";
		System.out.println(a);
		final String b = "abc";
		//		 b.text = "xx"; // does not exist.  Strings are IMMUTABLE

		String c = "abc";
		String d = "abc";
		if (c == d) {
			// means a is the same object as b
			// This is true
			System.out.println(true);
		}
		String e = "a";
		e += "bc";
		if (c == e) { // false
			System.out.println("NO WAY");
		}
		if (c.equals(e)) {
			System.out.println("c and e have SAME LETTERS (equal)");
		}			
	}
}
