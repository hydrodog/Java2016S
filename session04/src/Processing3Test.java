import processing.core.PApplet;

public class Processing3Test extends PApplet {
	
	public void settings() {
		size(600,600);
	}
	
	public void draw() {
		line(0,0, 100, 100);
		
	}
	public static void main(String[] args) {
	    String[] a = {"MAIN"};
	    PApplet.runSketch( a, new Processing3Test());
	}
}
