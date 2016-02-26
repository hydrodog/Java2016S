/**
 * 
 * @author dkruger
 *
 */

public class hw_Complex {

	public static void main(String[] args) {
		hw_Complex a = new hw_Complex(1.0,2.5); // 1 + 2.5i
		hw_Complex b = new hw_Complex(3); // 3 + 0i
		hw_Complex c = new hw_Complex(); // 0+0i
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		hw_Complex d = a.add(b); // make addition work
		hw_Complex d = a.times(b); // make multiplication work
		hw_Complex d = a.neg(); // negation
		int iterations = a.iterate(); // return an integer from 0 to 64
		// each time compute z = z*z + this
		System.out.println(iterations);
	}
}
