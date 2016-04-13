package session11;

import java.util.*;

public class StockViewer implements Observer{
	public void update(Observable o, Object arg) {
//		Stock s = (Stock) o;
		System.out.println(o);
	}
}
