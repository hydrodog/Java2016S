/**
 * 
 * @author dkruger
 *
 */

public class s03_Fraction {
	private int num, den;
	
	public s03_Fraction(  ) {
		this(0,1);
	}
	
	public s03_Fraction(int n) {
		this(n, 1);
	}

	public s03_Fraction(int n, int d) {
		num = n;
		den = d;
	}
	
	public String toString() {
		return num + "/" + den;
	}

	public static void main(String[] args) {
		s03_Fraction a = new s03_Fraction(1,2);
		s03_Fraction b = new s03_Fraction(3);
		s03_Fraction c = new s03_Fraction();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
}
