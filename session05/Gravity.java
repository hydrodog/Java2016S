public class Gravity {
	public static void main(String[] a) {
		double earthOrbit = 150e9;
		Vector3D earth = new Vector3D(earthOrbit, 0, 0);
		double moonOrbit = 400e6; // distance earth to moon
		Vector3D moon = earth.add(new Vector3D(moonOrbit, 0, 0));
		Vector3D diff = earth.sub(moon);

		double dot = earth.dot(moon);
		//https://en.wikipedia.org/wiki/Dot_product

    Vector3D q = earth.mult(2);

		//		double f = G*m1*m2/(dist*dist)
		System.out.println(diff);
	}

}
