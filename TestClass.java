package com.prac.java;

interface GPI {

	default void show()
	{
		System.out.println("Default GPI");
	}
}

interface PI1 extends GPI {
}

interface PI2 extends GPI {
	
	void show();
}

public class TestClass implements PI1, PI2 {

	public static void main(String args[])
	{

		TestClass d = new TestClass();
		d.show();

	}
	public void show(){
		System.out.println("inside class method show");
	}
}
