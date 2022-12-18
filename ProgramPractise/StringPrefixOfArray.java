
public class StringPrefixOfArray {

	public static void main(String[] args) {
		String s = "iloveleetcode";
		String[] words = {"apples","i","love","leetcode","apples"};
		System.out.println(isPrefixString(s,words));

	}

	public static boolean isPrefixString(String s, String[] words) {
		
		StringBuilder sb = new StringBuilder("");
		for(int i=0; i<words.length;i++) {
			sb.append(words[i]);
			if(s.equals(sb.toString())) {
				return true;
			}
		}
		
		
		return false;
		
	}
}
