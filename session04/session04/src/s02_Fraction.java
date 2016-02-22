/**
 * 
 * @author dkruger
 *
 */

public class s02_Fraction {
	private int num, den;
	
	public static int f(int x) {
		  return x*x;
		}	
	// s02_Fraction.gcd(3025,1025)
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
	
	// function whose name is same as class = Constructor
	// takes NO return type (not void)
	public s02_Fraction(  ) {
		den = 1; // fractions default to 0/1
	}
	public s02_Fraction(int n, int d) {
		int g = gcd(n,d);
		num = n/g; den = d/g;
	}
	
	public String toString() {
		return num + "/" + den;
	}
/*
	// this will refer to the object
	public Fraction add(Fraction r) {
		//this.num  this.den    r.num  r.den
		Fraction ans = new Fraction(this.num*r.den + this.den*r.num,this.den * r.den);
		return ans;
	}
	*/
	//shorter!
	public s02_Fraction add(s02_Fraction r) {
		return new s02_Fraction(num * r.den + den*r.num, den * r.den);
	}
	public s02_Fraction times(s02_Fraction x) {
		return new s02_Fraction(num * x.num, den * x.den);
	}
	public s02_Fraction neg() {
		return new s02_Fraction(-num, den);
	}
	
	public static void main(String[] args) {
		s02_Fraction a = new s02_Fraction(1,2);
		s02_Fraction b = new s02_Fraction(1,3);
		s02_Fraction c = a.add(b);
//		s02_Fraction x = new s02_Fraction(1,5);
//		c = a.add(x);
		System.out.println(c);
		s02_Fraction d = a.times(b);
		System.out.println(d);
//		s02_Fraction e = a.div(b);
		s02_Fraction f = a.neg();
		System.out.println(f);
		System.out.println(new s02_Fraction(1,2).add(a));
		System.out.println(new s02_Fraction(1,2).times(new s02_Fraction(2,1)));

		
		
		
	}
}
