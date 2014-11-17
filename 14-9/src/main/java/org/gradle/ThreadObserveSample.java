package org.gradle;

public class ThreadObserveSample {
    
    public static void main(String arg[]){
    	ThreadObserveSample tp = new ThreadObserveSample("test");
    }

    ThreadObserveSample(String name){

    	ThreadGroup parent = new ThreadGroup(name);

    	//make children
		ShortThread bro1 = new ShortThread("One", parent);
		LongThread bro2 = new LongThread("Two", parent);
		LongThread bro3 = new LongThread("Three", parent);
		LongThread bro4 = new LongThread("Four", parent); 
		
		//observe children
		try {
			while(parent.activeCount() > 0/*end*/){
					Thread.sleep(100);
				if(bro1.isAlive()){
					bro1.dump();
				}
				if(bro2.isAlive()){
					bro2.dump();
				}
				//bro3.dump();
				//bro4.dump();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    }
}
