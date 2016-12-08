import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Stock {
	private double price;
	private String symbol;
public
	Stock(String sym, double price) { symbol = sym; this.price = price; }

}


public class JListExample1 extends JFrame {
	public JListExample1() {
    super("JListExample 1");
		Container c = getContentPane();

		Object[] data = new Object[] {
			"Dov",
			3,
			5.5, // --> new Double(5.5)
			new Stock("IBM", 104.5)
		};
		JList list = new JList(data);
		c.add(list, BorderLayout.CENTER);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] a) {
		new JListExample1();
	}
}
