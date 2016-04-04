package edu.stevens.cpe810j;

import java.awt.Color;

public class CircleMode extends Mode {
	public Shape create(Color c, float x, float y, float w, float h) {
		return new Circle(c, x, y, w);
	}
}
