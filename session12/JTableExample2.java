import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.table.*;

public class JTableExample2 extends JFrame {
	private TableModel1   model = new TableModel1();

	static class SymRenderer extends DefaultTableCellRenderer {
    public SymRenderer() { super(); }
    public void setValue(Object value) {
			Stock s = (Stock)value;
			setText(s.getSymbol());
    }
	}
	
	public JTableExample2() {
    super("JTable Example 2");
		Container c = getContentPane();

		JTable table = new JTable(model) {
				public boolean isCellEditable(int row, int col) {
					return true;
        }
				
				TableColumn col0 = table.getColumnModel().getColumn(0);
				col0.setCellRenderer(new SymRenderer());
			};


		
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
		new JTableExample2();
	}
}
