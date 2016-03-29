import java.awt.*;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c);
		Car c2 = new Car(55, new Color(255,0,120));
		System.out.println(c2);
		Bus b = new Bus(45, 20);
		System.out.println(b);
		Vehicle v;
		//		v = new Vehicle(25); // error, abstract class Vehicle cannot be instantiated
		
	}
}
		
