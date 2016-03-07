package session06;

public class Car {
	private String color;
	
	public Car(String c) { color = c;}
	public String toString() { return "I am a Car! I am " + color; }
	
	public String getColor() { return color; }
	
	public static void main(String[] a) {
		Car c = new Car("red");
		System.out.println(c);
		Sportscar s = new Sportscar("blue", 320);
		System.out.println(s);
	}
}
