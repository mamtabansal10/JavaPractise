public class SingletonExample extends Thread{
	
//	classic implementation/ lazy implementation
	
//	public static SingletonExample obj;
//	
//	private SingletonExample() {
//		
//	}
//	
//	public static SingletonExample getObj() {
//		if(obj==null) {
//		 obj = new SingletonExample();
//		}
//		return obj;
//	}
	
    private static SingletonExample obj;
    
    private SingletonExample() {}
 
    // Only one thread can execute this at a time
    public static synchronized SingletonExample getObj()
    {
        if (obj==null)
            obj = new SingletonExample();
        return obj;
    }

}
