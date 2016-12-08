import java.awt.*;

public class Bus extends Vehicle {
	private int numPassengers;

	public Bus(int speed, int n) { super(speed); numPassengers = n; }
	public String toString() {
		return "I'm a bus! speed=" + getSpeed() +
			" numPassengers=" + numPassengers;
	}
	public void payToll() {
		System.out.println("pay $3");
	}										
}
