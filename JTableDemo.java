import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class JTableDemo extends JFrame {
	private static class SymRenderer extends DefaultTableCellRenderer {
    public SymRenderer() { super(); }

		@Override  public void setValue(Object value) {
			Object col = value;
			if (value != null && value instanceof Stock) {
				Stock s = (Stock)value;
				col = value;
			}
			super.setValue(col);
		}
	}
	private Model1 data;
	public JTableDemo() {
		super("JTable Demo");
		setSize(800, 600);
		Container c = getContentPane();
		data = new Model1();
		Font f = new Font("Arial", Font.BOLD, 32);
		JTable table = new JTable(data); //, (Object[])data.getColumnNames());
		table.setFont(f);
		table.setRowHeight(120);
		TableColumnModel cm = table.getColumnModel();
		TableColumn tc = cm.getColumn(0);
		tc.setCellRenderer(new SymRenderer());
		c.add(new JScrollPane(table), BorderLayout.CENTER);

		data.add(new Stock("IBM", 104.5, 1.2));
				data.add(new Stock("AAPL", 111.24, 1.9));
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableDemo();
	}
}

class Model1 extends AbstractTableModel {
	private ArrayList<Stock> rows;
	private String[] columnNames;

	public Model1() {
		columnNames = new String[] {
			"Symbol", "Price", "Dividend"
		};
		rows = new ArrayList<Stock>();
	}
	public String[] getColumnNames() { return columnNames; }
	public void add(Stock s) {
		rows.add(s);
	}
	public void remove(Stock s) {
	}
	public Object getValueAt(int row, int col) {
		return rows.get(row);
	}
	public int getColumnCount() { return 3; }
	public int getRowCount() { return rows.size(); }
}
