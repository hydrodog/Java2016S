import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Stock {
	private double price;
	private String symbol;
public
	Stock(String sym, double price) { symbol = sym; this.price = price; }

}


public class JListExample2 extends JFrame {
	public JListExample2() {
    super("JListExample 2");
		Container c = getContentPane();

		Integer[] data = new Integer[1000];
		for (int i  = 0; i < data.length; i++)
			data[i] = i;
		
		JList list = new JList(data);
		JScrollPane pane = new JScrollPane(list); 
		c.add(pane, BorderLayout.CENTER);
		JButton b = new JButton("+1");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < data.length; i++)
            data[i]++;  //data [i] = new Integer(data[i].intValue + 1);
				}
			} );
		c.add(b, BorderLayout.EAST);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] a) {
		new JListExample2();
	}
}
