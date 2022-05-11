package com.practise.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinekdListProgram {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(23);
		ll.add(14);
		ll.addFirst(12);
		ll.addLast(13);
		ll.add(3, 4);
        System.out.println(ll);
        
        ListIterator<Integer> itr =  ll.listIterator();
        while(itr.hasNext()) {
        	System.out.println("elements are : "+ itr.next());
        	if(itr.next() == 14) {
        		itr.set(40);
        	}
        	itr.remove();
        }
        
        System.out.println(ll);
	}

}

