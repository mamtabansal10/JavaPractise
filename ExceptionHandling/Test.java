package com.practise.exception;

public class Test {
     int i;
	public static void main(String[] args) {
		Test t = new Test();
		int r = t.testException();
		System.out.println("result is :"+ r);
	}
	
	public int testException() {
		try {
			System.out.println("inside try block");
			i = 10/0;
			return i;
		}
		finally {
			System.out.println("inside finally");
		}
	}

}
