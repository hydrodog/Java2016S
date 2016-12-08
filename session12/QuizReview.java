public interface A {
	public void f();
}

public class B implements A {
	public void f() { System.out.println("test"); }
}

public abstract class C extends B {
	public abstract void g();
}

public class Test {
	public static void main(String[] a) {
		A a1;
		A a2 = new A(); // illegal  You cannot instantiate an interface
		B b1;
		b1 = new B();
		C c1 = new C(); // illegal, C is abstract
		c1 = new C() { // Test$1
				public void g() {
					
        }
			};
	}
}
