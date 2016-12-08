package edu.stevens.cpe810j;

public class MyWin extends JFrame {
	public MyWin() {
//		super("hello");
//		super(); // no title (this happens by default)
		this.setTitle("hello");
	}
}

class A {
	int x;
	public void f() { System.out.println("hello"); }
}

class B extends A {
	int y;
	public B() {
		x = 2;
		f();
	}
}