package session11;

import java.util.Observable;
import java.util.Random;

/*
 * Represent a share of ownership in a company
 * Has symbol and price
 */
public class Stock extends Observable {
	private String symbol;
	private double price;


	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}
	
	public void setPrice(double x) {
		price = x;
		if (price < 0)
			price = 0;
		setChanged();
		notifyObservers();
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return symbol + "=" + price;
	}
	public static void main(String[] a) {
		
		Random r = new Random();
		StockViewer view = new StockViewer();
		GraphingWin w = new GraphingWin();
		
		Stock s = new Stock("IBM", 149.72);
		s.addObserver(view);
		w.add(s);
		System.out.println(s);
		for (int i = 0; ; i++) {
			double x = r.nextDouble();
			s.setPrice(s.getPrice() + x-.5);
		}
	}
}
