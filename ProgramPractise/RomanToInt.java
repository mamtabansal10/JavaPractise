import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));

	}
	
	 public static int romanToInt(String s) {
	        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
	        hm.put('I',1);
	        hm.put('V',5);
	        hm.put('X',10);
	        hm.put('L',50);
	        hm.put('C',100);
	        hm.put('D',500);
	        hm.put('M',1000);
	        
	        int result = 0;
	        // ch[] chr = s.toCharArray();
	        for(int i=0;i<s.length()-1;i++){
	          if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1)))  {
	        	  
	        	  result = result - hm.get(s.charAt(i));
	          }
	          else {
	              result = result + hm.get(s.charAt(i)) ;
	          }
	        }
	        return result+hm.get(s.charAt(s.length()-1));
	        
	        
	    }

}
