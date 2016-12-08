
public class Account2 {
	private double balance;	
	public void deposit(double amt) {
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
		for (long i = 0; i < 2*n; i++)
			a.deposit(1);
		long tend = System.currentTimeMillis();
		System.out.println("Elapsed: " + (tend-t0));
		System.out.println(a);
		
		
	}
}

class Mythread extends Thread {
	private Account a;
	private long n;
	public Mythread(Account a, long n) { 
		this.a = a;
		this.n = n;
	}
	public void run() {
		for (long i = 0; i < n; i++)
			a.deposit(1);	
	}
}
