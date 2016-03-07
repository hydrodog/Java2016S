
public class TestFraction {
	public static void main(String[] args) {
		final double PI = 3.1415926535;
		//PI = 4;
		System.out.println(Fraction.HALF);
		Fraction.HALF.setNum(3); // final != constant!!!
		System.out.println(Fraction.HALF);
	}
}
