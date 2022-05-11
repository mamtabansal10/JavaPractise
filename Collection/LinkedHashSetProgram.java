package com.practise.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		lhs.add(1);
		lhs.add("a");
		lhs.add(new StringBuffer("h"));
		System.out.println(lhs);
		
		removeDuplicatesFromString("my name is mamta");
	}

	private static void removeDuplicatesFromString(String string) {
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for(int i=0 ; i<string.length(); i++) {
			lh.add(string.charAt(i));
		}
		for(Character ch : lh) {
			System.out.print(ch);
		}
	}
}
