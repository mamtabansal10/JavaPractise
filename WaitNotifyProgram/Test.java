
public class Test {

	public static void main(String[] args) throws InterruptedException {
		ImplementWaitNotifyMethods obj = new ImplementWaitNotifyMethods();

		// Thread t1 will call wait()
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.callingWait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		// Thread t2 will call notify()
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				obj.callingNotify();
			}
		});

		t1.start();
		t2.start();

	}
}
