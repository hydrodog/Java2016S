public class Stock {
	private String sym;
	private double price;
	private double dividend;
	private double yield;

	public Stock(String sym, double price, double div, double y) {
		this.sym = sym;
		this.price = price;
		dividend = div;
		yield = y;
	}
	
	public String getSymbol() { return sym; }
	public void setSymbol(String sym) { this.sym = sym; }

	public double getPrice() { return price; }
	public void setPrice(double price) { this.price = price; }

	public double getDividend() { return dividend; }
	public void setDividend(double dividend) { this.dividend = dividend; }

	public double getYield() { return yield; }
	public void setYield(double yield) { this.yield = yield; }

}
