public class Matrix {
	private double[] data;
	private int rows, cols;

	public Matrix(int rows, int cols) {



	}
	public static Matrix ident(int n) {
		//		return new Matrix( ...)
	}

	public void set(int i, int j, double v) {

	}

	public double get(int i, int j) {
		return ...;
	}

	public Matrix add(Matrix right) {

	}
	
	public static void main(String[] args) {
		Matrix a = new Matrix(3, 4); // 0 0 0 0
		                             // 0 0 0 0
		                             // 0 0 0 0
		System.out.println(a); // print it out!

		Matrix b = Matrix.ident(3); // 1 0 0
		                            // 0 1 0
		                            // 0 0 1
		//		Matrix c = a.add(b); // failure!!!

		Matrix c = new Matrix(3,3);
		c.set(0,2, 5.5); // 0.0 0.0 5.5
		                 // 0.0 0.0 0.0
		                 // 0.0 0.0 0.0

		System.out.println(m.get(1,1)); // prints 1.0
		Matrix d = b.add(c); // 1.0 0.0 5.5
		                     // 0.0 1.0 0.0
		                     // 0.0 0.0 1.0


	}

}
