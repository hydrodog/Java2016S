package edu.stevens.cpe810j;
import java.awt.*;

public class Rect extends Shape {
	  private float width, height;
	  public Rect(Color c, float x, float y, float width, float height) {
	    super(c, x, y);
	    this.width = width;
	    this.height = height;
	  }
	  public double area() {
	     return width * height;
	  }
	  public double perimeter() { return (width + height) * 2; }
	  public String toString() { return "I am a circle"; }
	  public void setWidth(float w) { width = w; }
	  public float getWidth() { return width; }
	  public void draw(Graphics g) {
		  g.drawRect((int)getX(), (int)getY(), (int)width, (int)height);
	  }
}
