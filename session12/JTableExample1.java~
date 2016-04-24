import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

class Stock {
	private double price;
	private String symbol;

	private static Random r;

	private static int count;

	// use static initializer for static variables
	static {
		r = new Random(0);
		count = 0;
	}
	
	public Stock(String sym, double price) { symbol = sym; this.price = price; }
	public Stock() {
		int len = r.nextInt(4) + 3;
		char s[] = new char[len];
		for (int i = 0; i < len; i++)
			//			s[i] = (char)('A' + r.nextInt(26));
			s[i] = (char)('\u4e00' + r.nextInt(1024));
		symbol = new String(s);
		price = Math.round(r.nextDouble() * 10000) / 100.0;
	}
	public String toString() {
		return symbol + "=" + price;
	}

}

public class JListExample4 extends JFrame {
	private DefaultListModel<Stock> model;
	public JListExample4() {
    super("JListExample 4");
		Container c = getContentPane();

 		model = new DefaultListModel<Stock>();
		for (int i = 0; i < 1000; i++)
			model.addElement(new Stock() ); 
		JList list = new JList(model);
		JScrollPane pane = new JScrollPane(list); 
		c.add(pane, BorderLayout.CENTER);
		JButton b = new JButton("+1");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//					for (int i = 0; i < model.getSize(); i++)
					//            model.set(i, model.get(i)+1);  //model [i] = new Integer(data[i].intValue + 1);
				}
			} );
		c.add(b, BorderLayout.EAST);
		b = new JButton("Add to list");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					model.add(0, new Stock());

				}
			} );
		c.add(b, BorderLayout.WEST);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] a) {
		new JListExample4();
	}
}
