package edu.stevens.cpe810j;
import java.awt.Color;
/**
 * Abstract parent of all modes
 * @author dkruger
 *
 */
public abstract class Mode {
	public abstract Shape create(Color c, float x, float y, float w, float h);
}
