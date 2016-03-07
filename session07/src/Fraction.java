
public class Fraction {
	// an instance is an object of this type
	private int num, den; // instance variables
	private static int count; //  shared by the  class (static)

	public final static Fraction HALF = new Fraction(1,2);
	public Fraction(int n, int d) {
		this.num = n; this.den = d;
		count++;
		System.out.println("Constructing Fraction!" + count);
	}
	public void finalize() {
		count--;
		System.out.println("Destroyed Fraction!" + count);
	}
	public void setNum(int n) { num = n; }
	public void setDen(int d) { den = d; }
	public int getNum() { return num;}
	public int getDen() { return den;}
	public String toString() { 
		return num + "/" + den;
	}
	public static void main(String[] args) {
		Fraction a = new Fraction(1,2);
		a.setNum(3);
		Fraction b = new Fraction(1,2);
		for (int i = 0; i < 10; i++)
			new Fraction(1,3);
		System.gc();
	}
}
