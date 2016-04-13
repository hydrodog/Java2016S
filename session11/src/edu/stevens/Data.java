package edu.stevens;

import java.util.ArrayList;

public class Data {
	private ArrayList<Observer> observers;
	public Data() {
		observers = new ArrayList<Observer>();
	}
	public void subscribe(Observer o) {
		observers.add(o);
	}
	
	public void changed() {
		for (int i = 0; i < observers.size(); i++)
			observers.get(i).update();
	}

	public void ichanged() {
		for (int i = 0; i < observers.size(); i++)
			observers.get(i).update(this);
	}
}
