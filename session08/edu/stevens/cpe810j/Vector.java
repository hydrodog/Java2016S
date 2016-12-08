package edu.stevens.cpe810j;

import java.io.*;
import java.util.ArrayList;

public class Vector implements Serializable {	
	private double x, y, z;
	
	public Vector(double x, double y, double z) {
		this.x = x; this.y = y; this.z = z;
	}
	public Vector add(Vector b) {
		return new Vector(x + b.x, y + b.y, z + b.z);
	}
	
	public static void main(String [] a) {
		Vector v = new Vector(1,2.5, 3);
		Vector v2 = new Vector(1,2,3);
		Vector v3 = v.add(v2);

		ArrayList<Vector> myList = new ArrayList<Vector>();
		for (int i = 0; i < 10; i++)
			myList.add(new Vector(i,0,0));

		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vector.saved"));
//		oos.write(3);
			oos.writeObject(v);
			oos.writeObject(myList);
			oos.close();
		} catch(IOException e) {
			System.out.println(e);
		}
	}		
}
