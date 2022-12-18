import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s = "statisticks";
     System.out.println(getUnique(s));
	}
	
	public static int getUnique(String str) {
		if(str.length()==1) {
			return -1;
		}
//		for(char i: str.toCharArray()) {
//			if(str.indexOf(i)==str.lastIndexOf(i)) {
//				return str.indexOf(i)+1;
//			}
//		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		   for (int i=0; i<str.length(); i++) {
		      int count = map.getOrDefault(str.charAt(i), 0);
		      count ++;
		      map.put(str.charAt(i), count);
		   }
		   
		   for (int i=0; i<str.length(); i++) {
		      if (map.get(str.charAt(i)) == 1) {
		         return i+1;
		      }
		   }
		return -1;
		
	}

}
