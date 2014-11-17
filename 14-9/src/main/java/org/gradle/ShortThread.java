package org.gradle;

public class ShortThread extends Thread {
	
	ShortThread(String name, ThreadGroup tg){
		super(tg, name);
		System.out.println("New thread: " + this); 
		System.out.println(tg);
		start();
		
	}
	public void run(){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void dump() {
		System.out.println(this.toString());
	}

}
