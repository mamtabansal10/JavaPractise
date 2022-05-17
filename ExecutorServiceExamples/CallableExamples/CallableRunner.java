import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	ExecutorService es = Executors.newFixedThreadPool(2);
	Future<String> welcomeFuture = es.submit(new CallableTask());
	
	System.out.println(welcomeFuture.get());

	}

}
