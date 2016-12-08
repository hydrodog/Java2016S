public class MultiLineToString {
	public String toString() {
		final int n = 12;
		StringBuilder b = new StringBuilder(n*n*5);
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				b.append(i*j).append(' ');
			b.append('\n');
		}
		return b.toString();
	}
	public static void main(String[] a) {
		MultiLineToString m = new MultiLineToString();
		System.out.println(m);

	}
}
