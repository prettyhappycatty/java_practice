package org.gradle;

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
    	//make children
		ShortThread bro1 = new ShortThread("One", parent);
		LongThread bro2 = new LongThread("Two", parent);
		LongThread bro3 = new LongThread("Three", parent);
		LongThread bro4 = new LongThread("Four", parent); 
		
    	ConcreteSubject t1 = new ConcreteSubject(bro1);
    	t1.attach(o);
    	ConcreteSubject t2 = new ConcreteSubject(bro2);
    	t2.attach(o);
    	ConcreteSubject t3 = new ConcreteSubject(bro3);
    	t3.attach(o);
    	
		
		//observe children
		try {
			while(parent.activeCount() > 0/*end*/){
					Thread.sleep(100);
					t1.update();
					t2.update();
					t3.update();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
