package session11;
public interface A {
	public void f();
}

public abstract class B implements A {
	public B() {}

}
public class C extends B {
	
	public void f() { System.out.println("test"); }
	
	
	public static void main(String[] a) {
		A a1;
//		A a2 = new A(); // NOT LEGAL A is an interface
		B b1;
		b1 = new B(); // NOT LEGAL: B is ABSTRACT CLASS
		C c1 = new C();
	}
}

public class Test2Review {

}
