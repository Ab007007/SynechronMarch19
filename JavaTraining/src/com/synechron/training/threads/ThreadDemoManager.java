package com.synechron.training.threads;

public class ThreadDemoManager {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo td = new ThreadDemo();
		Thread t1 = new Thread(td);
		t1.start();
	
		for (int i = 1; i < 100; i++) {
			System.out.println("main "+ i);
			//Thread.sleep(100);
		}
		
		
		
	}
}
