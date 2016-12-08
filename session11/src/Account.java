
public class Account {
	private double balance;
	
	/*
	 * Race condition
	 * balance = 0
	 * 
	 * deposit(1)    deposit(1)
	 * read balance = 0 + 1        read balance = 0 + 1
	 * balance = 1                 balance = 1
	 * 
	 */
	
	
	public synchronized void deposit(double amt) {
		balance += amt;
	}
	public String toString() {
		return "balance=" + balance;
	}
	public static void main(String[] args) {
		Account2 a = new Account2();
		System.out.println(a);
		final long n = 100000000;
		long t0 = System.currentTimeMillis();
		Mythread t1 = new Mythread(a, n);
		Mythread t2 = new Mythread(a, n);
		t1.start();
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {}
		try {
			t2.join();
		} catch (InterruptedException e) {}
		long tend = System.currentTimeMillis();
		System.out.println("Elapsed: " + (tend-t0));
		System.out.println(a);
		
		
	}
}

class Mythread extends Thread {
	private Account2 a;
	private long n;
	public Mythread(Account2 a, long n) { 
		this.a = a;
		this.n = n;
	}
	public void run() {
		for (long i = 0; i < n; i++)
			a.deposit(1);	
	}
}
