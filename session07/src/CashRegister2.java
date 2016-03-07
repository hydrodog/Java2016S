import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CashRegister2 extends JFrame {
	private JTextField display;
	public CashRegister2() {
		super("Cash Register");
		display = new JTextField();
		Font f = new Font("Helvetica", Font.BOLD, 32);
		display.setFont(f);
		display.setEditable(false);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4,4));
		String[] names = {
				"test", "123", "hamburger", "fries",
				"test", "123", "hamburger", "fries",
				"test", "123", "hamburger", "fries",
				"test", "123", "hamburger", "fries"
		};
		for (int i = 0; i < names.length; i++) {
			JButton b = new JButton(names[i]);
			p.add(b);
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					display.setText(  ((JButton)e.getSource()).getText() );
				}
			});
		}
		setSize(800,500);
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, p);
		c.add(BorderLayout.NORTH, display);
		setVisible(true);
	}
	public static void main(String[] a) {
		new CashRegister2();
	}
}
