package edu.stevens.cpe810j;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Drawing extends JFrame {
	private DrawingArea drawArea;
	public Drawing() {
		super("Drawing");
		setSize(800,600);
		Container c = getContentPane();
		JPanel p = new JPanel();
		p.setBackground(Color.BLUE);
		p.setLayout(new GridLayout(5,2));
		JButton b = new JButton("Circle");
		p.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawArea.setMode(new CircleMode());
			}
		});
		b = new JButton("Rect");
		p.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawArea.setMode(new RectMode());
			}
		});
		
		b = new JButton("Clear");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawArea.clear();
			}
		});
		p.add(b);
		for (int i = 0; i < 7; i++)
			p.add(new JButton("ok"));
		c.add(p, BorderLayout.WEST);

		drawArea = new DrawingArea();
		drawArea.setBackground(Color.YELLOW);
		c.add(drawArea, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] a) {
		new Drawing();
	}
}
