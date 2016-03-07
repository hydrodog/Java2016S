import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Equalizer3 extends JFrame {
	private JScrollBar red, green, blue;
	private JPanel colorSample;
	public Equalizer3() {
		super("equalizer");
		setSize(700,300);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3, 10, 5));
		p.setBackground(Color.YELLOW);
		c.add(BorderLayout.CENTER, p);
		
		red = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		p.add(red);
		red.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				colorSample.setBackground(
						new Color(red.getValue(), green.getValue(), blue.getValue()));
			}
		});
		green = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		p.add(green);
		blue = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		p.add(blue);
		setVisible(true);
		
		JButton power = new JButton("power");
		// anonymous inner class
		// Equalizer2$1
		power.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				} );
		c.add(BorderLayout.WEST, power);
		colorSample = new JPanel();
//		colorSample.setBackground(Color.GREEN);
		colorSample.setPreferredSize(new Dimension(200,100));
		c.add(BorderLayout.NORTH, colorSample);
		
		
		
	}
	public static void main(String[] args) {
		new Equalizer3();
	}
}


