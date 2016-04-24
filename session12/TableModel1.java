import javax.swing.table.*;
import java.util.*;

public class TableModel1 extends AbstractTableModel {
	private ArrayList<Stock> stocks;

	public TableModel1() {
		stocks = new ArrayList<Stock>();
		stocks.add(new Stock("IBM", 104.5, 1.2, .9));
		stocks.add(new Stock("BIDU", 89.82, .7, .8));
		stocks.add(new Stock("AAPL", 176.5, 1.3, .4));
	}
	public int getColumnCount() { return 4; }
	public int getRowCount() { return stocks.size(); }
	public Object getValueAt(int row, int col) {
		return stocks.get(row);
	}
};
