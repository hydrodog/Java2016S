
public class PlayWithStrings {
	public static void main(String[] args) {
		// there is a reserved word const, like c++
		// BUT NEVER IMPLEMENTED!
		//const String x = new STring()
		// Strings are IMMUTABLE (cannot change)
		String a = "abc";
		String b = "def";
		if (a == b) {
			System.out.println("a==b???");
		}
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1 == s2); // identity comparison: is s1 the same object as s2?
		String s3 = "abc";
		System.out.println(s2 == s3);
		String s3b = "ab" + "c";
		String s6 = "ab";
		String s7 = "c";
		String s8 = s6 + s7;
		System.out.println(s3 == s3b);
		System.out.println(s8 == s3b); // is s8 the same object as s3
		System.out.println(s8.equals(s3)); // does s8 have the same letters as s3?
		final String s5 = "def";
		String s4 = s1 + s2;
		s4 += s1;
		System.out.println(s4);
	}
}
