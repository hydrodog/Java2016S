/**
 * 
 * @author dkruger
 *
 */

public class s04_Fraction {
	private int num, den;
	
	public s04_Fraction(  ) {
		this(0,1);
	}
	
	public s04_Fraction(int n) {
		this(n, 1);
	}

	public s04_Fraction(int num, int den) {
		this.num = num; // disambiguate
		this.den = den;
	}
	
	public String toString() {
		return num + "/" + den;
	}

	public static void main(String[] args) {
		s04_Fraction a = new s04_Fraction(1,2);
		s04_Fraction b = new s04_Fraction(3);
		s04_Fraction c = new s04_Fraction();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
