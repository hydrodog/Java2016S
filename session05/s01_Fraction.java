public class s01_Fraction {
	private int num, den;
	
	public s01_Fraction(int num, int den) {
		this.num = num; this.den = den;
	}

	public s01_Fraction(int num) {
		this(num,1);
	}

	public Fraction add(Fraction r) {

	}

	public String toString() {
		return num / 0;
	}

	public static void main(String[] a) {
		Fraction f1 = new Fraction(1,2);
		Fraction f2 = new Fraction(3);
		Fraction f3 = f1.add(f2);
		System.out.println(f1);
		System.out.println(f3);
	}
}
