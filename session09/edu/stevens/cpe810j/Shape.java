package edu.stevens.cpe810j;
import java.awt.*;

public abstract class Shape {
	  private Color c;
	  private float x,y;
	  public Shape(Color c, float x, float y) {this.c = c; this.x = x; this.y = y; }  
	  public abstract double area(); // abstract method forces children to implement area()
	  public abstract double perimeter();
	  public abstract void draw(Graphics g);
	  public float getX() { return x; }
	  public float getY() { return y; }
	  
}
