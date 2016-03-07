import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Equalizer2 extends JFrame {
	public Equalizer2() {
		super("equalizer");
		setSize(700,300);
		JScrollBar b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3, 10, 5));
		p.setBackground(Color.YELLOW);
		c.add(BorderLayout.CENTER, p);
		
		p.add(b);
		b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		p.add(b);
		b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		p.add(b);
		setVisible(true);
		
		JButton power = new JButton("power");
		// anonymous inner class
		// Equalizer2$1
		power.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("yo!");
					}
				} );
		c.add(BorderLayout.WEST, power);
		JPanel colorSample = new JPanel();
//		colorSample.setBackground(Color.GREEN);
		colorSample.setPreferredSize(new Dimension(200,100));
		c.add(BorderLayout.NORTH, colorSample);
		
		
		
	}
	public static void main(String[] args) {
		new Equalizer2();
	}
}


