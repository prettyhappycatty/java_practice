package org.gradle;

import java.util.ArrayList;
import java.util.List;

public class ThreadObserveSample {
    
	/* 
	 * main method
	 */
    public static void main(String arg[]){
    	ThreadObserveSample tp = new ThreadObserveSample("test");
    }

    /*
     * constructor
     */
    ThreadObserveSample(String name){
    	ThreadGroup parent = new ThreadGroup(name);

    	ConcreteObserver o = new ConcreteObserver();
    	Thread[] threadList = new Thread[4];
    	List<ConcreteSubject> subjectList = new ArrayList<ConcreteSubject>();
    	//make children
		ShortThread bro1 = new ShortThread("One", parent);
		LongThread bro2 = new LongThread("Two", parent);
		LongThread bro3 = new LongThread("Three", parent);
		LongThread bro4 = new LongThread("Four", parent);
		
		parent.enumerate(threadList);
		
    	for(Thread t: threadList){
    		ConcreteSubject s = new ConcreteSubject(t);
    		s.attach(o);
    		subjectList.add(s);
    	} 
		
		//observe children
		try {
			while(parent.activeCount() > 0/*end*/){
					Thread.sleep(100);
					for(ConcreteSubject s: subjectList){
						s.update();
					}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
