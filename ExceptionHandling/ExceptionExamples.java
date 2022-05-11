public class ExceptionExamples {
		
	public static void main(String[] args) {
//		int[] arr = new int[5];
////		System.out.println(arr[5]); // out of range
////		System.out.println(arr[-1]); //out of range
		
		String str = null;
	    System.out.println(str.length());//null pointer exception
	    
//	    Thread t = new Thread();
//	    t.start();
//	    t.start(); // Illegal state exception also thrown when itr.remove() called before itr.next()
		
//		Object o = new Object();
//		System.out.println((String)o); // class cast exception java.lang.Object cannot be cast to java.lang.String
		
//		Examples obj = new Examples();
		// java.lang.StackOverflowError m1 calling m2 calling m1 ..and stack get filled
//		obj.m1();   
		
		String s = "p";
		// number format exception converting string to int
		System.out.println(Integer.parseInt(s));
		
	}
	
	public void m1() {
		m2();
	}
	
	public void m2() {
		m1();
	}
	

}
