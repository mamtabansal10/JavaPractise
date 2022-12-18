import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindDuplicatesCountCharacter {

	public static void main(String[] args) {
		String input = "Mamta Bansal";
		System.out.println(findCharacter(input));
	}

	public static Character findCharacter(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		Iterator<Map.Entry<Character, Integer>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Character,Integer> entry = itr.next();
			if(entry.getValue()>2) {
				return entry.getKey();
			}
		}
			
     return null; 
	}

}
