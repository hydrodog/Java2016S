package session06;

public class Sportscar  extends Car { // A sportscar IS_A car or IS_A kind of Car
	private int horsePower;
	
	public Sportscar(String color, int hp) {
		super(color);
		this.horsePower = hp;
	}
	public String toString() { return "I am a sportscar! I am " + this.getColor(); }

}



