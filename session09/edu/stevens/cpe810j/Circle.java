package edu.stevens.cpe810j;
import java.awt.*;

public class Circle extends Shape {
	  private float r;
	  public Circle(Color c, float x, float y, float r) {
	    super(c, x, y);
	    this.r = r;
	  }
	  public double area() {
	     return Math.PI * r * r;
	  }
	  public double perimeter() { return Math.PI * 2 * r; }
	  public String toString() { return "I am a circle"; }
	  public void setRadius(float r) { this.r = r; }
	  public void draw(Graphics g) {
		 g.drawOval((int)getX(), (int)getY(), (int)r, (int)r); 
	  }
}
