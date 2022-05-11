

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashMapIteration {
	
	//map iteration

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"Mamta");
		hm.put(2, "Sahil");
		hm.put(3, "pupoo");
		hm.put(4, "ladoo");
		
	
		for(int key: hm.keySet()) {
			System.out.println("key = "+key+" Value = "+hm.get(key));
		}
		
		for (Entry<Integer, String> entry : hm.entrySet()) {
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
		
		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			HashMap.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			itr.remove();
//			hm.put(6,"Sahil"); //concurrentModificationException
		}
		
		System.out.println(hm);

	}


}
