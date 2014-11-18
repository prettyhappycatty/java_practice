package org.gradle;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
	List<Observer> observers = new ArrayList<Observer>();
	Thread t;
	
	ConcreteSubject(Thread t){
		this.t = t;
	}
	
	public boolean getState(){
		return t.isAlive();
	}
	

	/* 
	 * attach observer to observe subject
	 */
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	
	/*
	 * remove observer
	 */
	public void detach(Observer observer){
		observers.remove(observer);
	}
	
	/*
	 * notify observers
	 */
	public void update(){
		for(Observer o: observers){
			o.update(t.getName() + " is " + t.getState());
		}
	}
}
