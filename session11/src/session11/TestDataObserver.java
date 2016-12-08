package session11;

import java.util.Observable;
import java.util.Observer;

public class TestDataObserver {
	private static class MyObserver implements Observer {
		public void update(Observable o, Object arg) {
			System.out.println("hello");
		}
	}
	private static MyObserver obs = new MyObserver();
	
	private static class MyObservable extends Observable {
		public void changed() {
			setChanged();
			notifyObservers();
		}
	}	
	private static MyObservable thing1 = new MyObservable();
	public static void main(String a[]) {
		thing1.addObserver(obs);
		thing1.changed();
		
	}

}
