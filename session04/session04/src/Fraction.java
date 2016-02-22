/**
 * 
 * @author dkruger
 *
 *
 * Class: 
 * Object:
 * Message:
 * Method:
 */




public class Fraction {
	private int num, den;
	
	// function whose name is same as class = Constructor
	// takes NO return type (not void)
	public Fraction(  ) {
		den = 1; // fractions default to 0/1
	}
	public Fraction(int n, int d) {
		num = n; den = d;
	}
	
	public String toString() {
		return num + "/" + den;
	}
	
	public static void main(String[] a) {
		int x;
		x = 5;
		Fraction f1 = null; // this is not a fraction, it's NOTHING
		f1 = new Fraction();
		System.out.println(f1); // prints out the hash of the object
		System.out.println(f1.num);
		System.out.println(f1.den);
		Fraction f2 = new Fraction(1,2);
		System.out.println(f2.num);
		System.out.println(f2.den);
	}
}
