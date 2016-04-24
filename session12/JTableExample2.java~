import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JTableExample1 extends JFrame {
	private TableModel1   model = new TableModel1();
	public JTableExample1() {
    super("JTable Example 1");
		Container c = getContentPane();

		JTable table = new JTable(model);
		JScrollPane pane = new JScrollPane(table); 
		c.add(pane, BorderLayout.CENTER);
		/*
		JButton b = new JButton("+1");
		b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//					for (int i = 0; i < model.getSize(); i++)
					//            model.set(i, model.get(i)+1);  //model [i] = new Integer(data[i].intValue + 1);
				}
			} );
		c.add(b, BorderLayout.EAST);
		*/
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] a) {
		new JTableExample1();
	}
}
