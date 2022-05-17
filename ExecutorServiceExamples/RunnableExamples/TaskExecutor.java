import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.Future;
import java.util.concurrent.Future;

public class TaskExecutor {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException { 
	//ExecutorService executorService = Executors.newSingleThreadExecutor();
	//ExecutorService executorService = Executors.newFixedThreadPool(4);
		ExecutorService executorService = Executors.newCachedThreadPool();
	 
	executorService.execute(new Tasks());
	executorService.execute(new Tasks());
	executorService.execute(new Tasks());
	executorService.execute(new Tasks());
	executorService.submit(new Tasks());

	executorService.shutdown();
}
}
