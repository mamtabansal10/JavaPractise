package com.practise.collection;

public class MyThread extends Thread{
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("running child thread");
		ConcurrentHashMapExample.hm.put(10, "Mamta");
	}
	
	

}
