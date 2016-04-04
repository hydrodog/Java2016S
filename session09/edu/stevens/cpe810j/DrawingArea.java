package edu.stevens.cpe810j;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class DrawingArea extends JPanel {
	private ArrayList<Shape> drawList;
	private Mode mode;
	private Shape current;
	private int x,y;
	public DrawingArea() {
		mode = new CircleMode();
		drawList = new ArrayList<Shape>();
		setBackground(Color.YELLOW);
		addMouseListener(
			new MouseListener() {
				public void mousePressed(MouseEvent e) {
					Graphics g = getGraphics();
					g.setXORMode(Color.WHITE);
					x = e.getX(); y = e.getY();
					current = mode.create(Color.BLUE, x, y, 1,1);
					current.draw(g);
				}
				public void mouseReleased(MouseEvent e) {
					int w = e.getX() - x, h = e.getY() - y;
					current = mode.create(Color.BLUE, x, y, w, h);
					current.draw(getGraphics());
					drawList.add(current);					
				}
				public void mouseEntered(MouseEvent e) {
					DrawingArea.this.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
				}

				
				public void mouseExited(MouseEvent e) {					
					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
				public void mouseClicked(MouseEvent e) {
				}
			} );
		addMouseMotionListener(new MouseMotionListener() {
			public void 	mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.setXORMode(Color.WHITE);
				int w = e.getX() - x, h = e.getY() - y;
				current.draw(g);
				current = mode.create(Color.BLUE, x, y, w, h);
				current.draw(g);
			}
			public void 	mouseMoved(MouseEvent e) {
			}
		});
	}
	public void setMode(Mode m) { mode = m; }
	public void clear() {
		drawList.clear();
		repaint();
	}
	public void paint(Graphics g) {
		g.setColor(getBackground());
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		for (int i = 0; i < drawList.size(); i++)
			drawList.get(i).draw(g);
	}
}
