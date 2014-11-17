package org.gradle;

public class LongThread extends Thread {
	
	LongThread(String name, ThreadGroup tg){
		super(tg, name);
		System.out.println("New thread: " + this); 
		start();
		
	}
	public void run(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
	}
	public void dump() {
		System.out.println(this.toString());
	}

}
