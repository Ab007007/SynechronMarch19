package com.synechron.training.threads;

public class ThreadDemo implements Runnable
{
	@Override
	public void run() {
		
		for (int i = 1; i < 100; i++)
		{
			System.out.println(Thread.currentThread().getName() + "---" + i);
			i++;
		
		}
	}

	
}
