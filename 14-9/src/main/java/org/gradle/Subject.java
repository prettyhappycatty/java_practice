package org.gradle;

import java.util.ArrayList;
import java.util.List;

interface Subject {
	
	List<Observer> observers = new ArrayList<Observer>();
	
	/* 
	 * attach observer to observe subject
	 */
	public void attach(Observer observer);
	
	
	/*
	 * remove observer
	 */
	public void detach(Observer observer);
	
	/*
	 * notify observers
	 */
	public void update();

}
