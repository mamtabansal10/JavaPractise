package com.practise.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("s");
		hs.add("a");
		hs.add("l");
		hs.add("w");
		hs.add("s");
		System.out.println(hs);

		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			if (itr.next().equalsIgnoreCase("l")) {
				itr.remove();
			}
		}
		System.out.println("after remove: " + hs);
	}
}
