import java.util.regex.*;

public class Parse2      
{
	public static void main(String[] a) {
		String s = "This is a test.  iBM=. Find the data! Ibm=$123.45.  Hiding";
		
//		Pattern p = Pattern.compile("[Ii][Bb][Mm]=\\$?([0-9]*\\.[0-9]*)");
		Pattern p = Pattern.compile("[Ii][Bb][Mm]=\\$?([0-9]+\\.[0-9]*|[0-9]*\\.[0-9]+)");

		Matcher m = p.matcher(s);
		
		while (m.find()) {
			double price = Double.parseDouble(m.group(1));
			System.out.println(price);
		}
		
		
	}
}

class A {}

class B extends A {}
