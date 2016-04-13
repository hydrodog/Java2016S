package session11;
import java.awt.*;
import java.awt.event.*;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

public class GraphicalStockViewer extends JPanel implements Observer {
	private double[] prices;
	private int current;
	private double min, max;
	GraphicalStockViewer() {
		resize();
		min  = 0;
		max = 200;
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				resize();
			}
		});
	}
	
	public void resize() {
		prices = new double[getWidth()];
		current = 0;
	}
	public void update(Observable o, Object arg) {
		if (current >= prices.length)
			current = 0;
		Stock s = (Stock)o;
		prices[current++] = s.getPrice();
		repaint();
	}
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.WHITE);
		final int h = getHeight();
		for (int i = 0; i < prices.length; i++) {
			double f = (prices[i] - max) / (min-max);
			int y = (int)(f * h);
			System.out.println(y);
			g.drawLine(i, y, i, h-1);
		}
		
	}
}
