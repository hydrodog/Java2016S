import java.io.*;
import java.util.regex.*;

public class Parse3 {
	public static void main(String[] a) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("src/Parse2.java"));
		String line;
		Pattern p = Pattern.compile("\\sclass\\s+([\\$A-Za-z_][\\$A-Za-z_0-9]*)");
		
		while ( (line = br.readLine()) != null) {
			Matcher m = p.matcher(line);
		
			while (m.find()) {
				System.out.println(m.group(1));
			}
		}
		
	}
}
