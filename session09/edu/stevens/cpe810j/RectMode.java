package edu.stevens.cpe810j;

import java.awt.Color;

/**
 * Factory for Circle
 * @author dkruger
 *
 */
public class RectMode extends Mode {
	public Shape create(Color c, float x, float y, float w, float h) {
		return new Rect(c, x, y, w, h);
	}
}
