package edu.stevens.cpe810j;
import java.io.*;

public class LoadVector {
	public static void main(String[] a) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("vector.saved"));
		Vector v = (Vector)ois.readObject();
		ois.close();
		System.out.println(v);
	}
}
