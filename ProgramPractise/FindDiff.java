import java.util.HashSet;

public class FindDiff {

	public static void main(String[] args) {

	}
	
	public static char findTheDifference(String s, String t) {
       
        HashSet<Character> set = new HashSet();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        
         for(int i=0; i<t.length(); i++){
            if(!set.contains(t.charAt(i))){
                return t.charAt(i);
            }

}
		return 0;
	}}

