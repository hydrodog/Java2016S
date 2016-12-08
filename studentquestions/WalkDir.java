import java.util.*;
import java.io.*;
public class WalkDir {
	public static void main(String[] a) throws Exception {
		Properties p = new Properties();

		p.load(		new FileReader("test.conf"));

		System.out.println(p.get("basedir"));
		String dirname = (String)p.get("basedir");
		File dir = new File(dirname);
		File[] files = dir.listFiles();
		for (File file : files ) {
			System.out.println(file);
		}
	}
}
