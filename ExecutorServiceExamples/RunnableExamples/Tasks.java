
public class Tasks extends Thread {

	public int a = 0;

	@Override
	public void run() {
        System.out.println("Task Started ");
        System.out.println(" ");
		for (int i = 0; i <= 5; i++) {
			System.out.print(" " + i);
		}
        System.out.println(" Task Done");
	}

}
