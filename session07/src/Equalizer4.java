import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Equalizer4 extends JFrame {
	private JScrollBar red, green, blue;
	private JPanel colorSample;
	private AdjustmentListener scrollListener;
	private JScrollBar addColorScroll(JPanel p) {
		JScrollBar b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
		p.add(b);
		b.addAdjustmentListener(scrollListener);
		return b;
	}
	public Equalizer4() {
		super("equalizer");
		setSize(700,300);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(1,3, 10, 5));
		p.setBackground(Color.YELLOW);
		c.add(BorderLayout.CENTER, p);
		
		scrollListener = new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				colorSample.setBackground(
						new Color(red.getValue(), green.getValue(), blue.getValue()));
			}
		};
		red = addColorScroll(p);
		green = addColorScroll(p);
		blue = addColorScroll(p);
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
		new Equalizer4();
	}
}


