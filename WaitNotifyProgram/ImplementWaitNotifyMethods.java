package com.sync.waitExamples;

public class ImplementWaitNotifyMethods {

	public synchronized void callingWait() throws InterruptedException {

		for (int i = 0; i < 10; i++) {
			System.out.println("number is " + i + " " + Thread.currentThread().getName());
			if (i == 5) {
				System.out.println("calling wait");
				wait();
			}
		}
	}

	public synchronized void callingNotify() {
		System.out.println("calling notify");
		notify();
	}
}
