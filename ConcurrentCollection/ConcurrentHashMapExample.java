import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	static ConcurrentHashMap<Integer, String> hm = new ConcurrentHashMap<Integer, String>();

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread();
		t.start();
		hm.put(1, "p");
		hm.put(2, "pupoo");
		hm.put(3, "pp");
		hm.put(4, "putt");
		hm.put(5, "para");

		for (int key : hm.keySet()) {
			Thread.sleep(1000);
			hm.put(7, "Ladoo");
			System.out.println("inside main thread");
			System.out.println(" key = " + key + " Value= " + hm.get(key));
		}
	}
}
