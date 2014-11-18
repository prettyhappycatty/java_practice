package org.gradle;

public class ConcreteObserver implements Observer{
	
	public void update(String str){
		/* notify */
		System.out.println(str);
	}

}
