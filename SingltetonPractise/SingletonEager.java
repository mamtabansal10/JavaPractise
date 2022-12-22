package com.pattern.design;

public class SingletonEager {
	
	public static final SingletonEager obj = new SingletonEager();
	
	private SingletonEager() {
		
	}
	
	public static SingletonEager getObj() {
		return obj;
		
	}
	
	
//    using static block
//	  public static SingletonEager obj1;
//	 
//	 static
//	  {
//	    // static block to initialize instance
//	    obj1 = new SingletonEager();
//	  }
	}


