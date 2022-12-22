package com.pattern.design;

public class Test {
	
	public static void main(String[] args) {
		SingletonExample se = SingletonExample.getObj();
		System.out.println(se.hashCode());
		
		SingletonExample se1 = SingletonExample.getObj();
		System.out.println(se1.hashCode());
	}

}
