public abstract class Vehicle {
	private int speed;

	public Vehicle(int s) { speed = s; }
	public abstract void payToll();
	public int getSpeed() { return speed; }

}
