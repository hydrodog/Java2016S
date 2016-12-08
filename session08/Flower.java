public interface Flower {
	public void smell(); // abstract functions only (note, no word abstract)
	public int getColor();

	// no data: 	private int x;
	// no functions	public int f(int x) { return x*x; }
}

/*
Use interface where possible, NOT abstract class
public abstract class Flower {
	public abstract  void smell(); // abstract functions only (note, no word abstract)
	public abstract int getColor();

 	// no data: 	private int x;
	// no functions	public int f(int x) { return x*x; }
	} */
