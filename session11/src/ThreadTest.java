
public class ThreadTest implements Runnable {
	private String msg;
	private int delay;
	public ThreadTest(String msg, int delay) {
		this.msg = msg;
		this.delay = delay;
	}
	public void run() {
		for (;;) { // FOREVER
			System.out.println(msg);
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
			}
		}
	}
	public static void main(String[] a) {
		ThreadTest t1 = new ThreadTest("Yo!", 1000);
		ThreadTest t2 = new ThreadTest("Hello!", 500);
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		th1.start();
		th2.start();
		System.out.println("We're here");
	}
}
