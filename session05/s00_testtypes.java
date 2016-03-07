public class s00_testtypes {
	public static void main(String[] a) {
    double x = 3 / 2;
		//int y = 3.0 / 2; // type conversion error 
		int y2 = (int)(3.0 / 2); // y = 1
		int y3 = (int)1.99999 / 2; // y = 0
		char c = '0' + 5; // '0' == 48
		int d = '0' + 5; // '0' == 48
		double e = 4.2e+2;
		System.out.println(e);
		System.out.println(4.2e+2);
		System.out.println(1241247618246718L);
		System.out.println(c);
		System.out.println(d);
		System.out.println(y3);
		System.out.println(y2);
		//		final double ´ó = 1.234e+40;
	}
}
