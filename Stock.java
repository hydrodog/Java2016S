public class Stock {
	private String sym;
	private double price;
	private double dividend;

	public Stock(String sym, double price, double dividend) {
		this.sym = sym;
		this.price = price;
		this.dividend = dividend;
	}
	public String toString() {
		return "Stock: " + sym + " price=" + price + " dividend=" + dividend;
	}
	public void setSym(String sym) { this.sym = sym; }
	public String getSym() { return sym; }

	public void setPrice(double price) { this.price = price; }
	public double getPrice() { return price; }

	public void setDividend(double dividend) { this.dividend = dividend; }
	public double getDividend() { return dividend; }
}
