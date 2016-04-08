import java.util.regex.*;

public class Parse {
	public static void main(String[] a) {
		String s = "This is a test.  Find the data! Ibm=123.45.  Hiding";
		
		Pattern p = Pattern.compile("[\\$_A-Za-z][\\$_A-Za-z0-9]*");
//		if (s.matches("[\\$_A-Za-z][\\$_A-Za-z0-9]*)")

		Matcher m = p.matcher(s);
		
		while (m.find()) {
			System.out.println(m.group());
		}
		
		
	}
}
