package session11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GraphingWin extends JFrame {
	private GraphicalStockViewer v;
	public GraphingWin() {
		super("graph");
		v = new GraphicalStockViewer();
		Container c = getContentPane();
		c.add(v,  BorderLayout.CENTER);
		setSize(800,600);
		addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);					
				}
			} );
		setVisible(true);
	}
	
	public void add(Stock s) {
		s.addObserver(v);
	}
}
