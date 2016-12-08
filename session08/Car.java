import java.awt.*;

public class Car extends Vehicle {
 	private Color color;

	public Car(int speed, Color c) {
		super(speed); // call parent's constructor
		color = c; }

	public Car() {
		this(0, Color.RED);
	}

	public String toString() {
		return "I'm a car! speed=" + getSpeed() + " color=" + color;
	}
	public void payToll() {
		System.out.println("pay $10");
	}
}
