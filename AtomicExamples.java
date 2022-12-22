package com.prac.java;

import java.util.concurrent.atomic.AtomicInteger;

class test implements Runnable {
	 AtomicInteger count = new AtomicInteger();

	@Override
	public void run() {
		int max = 10000;
		for (int i = 0; i < max; i++) {
			count.getAndIncrement();
		}
	}
}

public class AtomicExamples {

	public static void main(String[] args) throws InterruptedException {

		test obj = new test();

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("count is " + obj.count.get());
	}

}
