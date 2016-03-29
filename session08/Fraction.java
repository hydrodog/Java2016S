public class Fraction {
	private int num, den; // instance variables, member variables
	private static int count;

	public Fraction(int n, int d) {
		num = n; den = d; count++;
	}

	public void finalize() {
		count--;
	}
}

	
