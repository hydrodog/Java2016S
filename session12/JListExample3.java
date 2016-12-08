import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JListExample3 extends JFrame {
	private DefaultListModel<Integer> model;
	public JListExample3() {
    super("JListExample 3");
		Container c = getContentPane();

 		model = new DefaultListModel<Integer>();
		for (int i = 0; i < 1000; i++)
			model.addElement(i); //  new Integer(i)  //auto boxing
		JList list = new JList(model);
		JScrollPane pane = new JScrollPane(list); 
		c.add(pane, BorderLayout.CENTER);
		JButton b = new JButton("+1");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					for (int i = 0; i < model.getSize(); i++)
            model.set(i, model.get(i)+1);  //model [i] = new Integer(data[i].intValue + 1);
				}
			} );
		c.add(b, BorderLayout.EAST);
		b = new JButton("Add to list");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					model.add(0, 100);

				}
			} );
		c.add(b, BorderLayout.WEST);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] a) {
		new JListExample3();
	}
}
