import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] srts = {"cat","caty","yl"};
		System.out.println(longestCommonPrefix(srts));

 	}

	public static String longestCommonPrefix(String[] strs) {		
		Arrays.sort(strs);
		String result = "";
        char[] a = strs[0].toCharArray();
        char[] b = strs[strs.length-1].toCharArray();
        
        for(int i=0; i<a.length;i++) {
        	if(a[i]==b[i] && b.length>i) {
        		result = result + a[i];
        	}
        	else {
        		break;
        	}
        	
        }
        return result;
		
//        String first = strs[0];
//		for (int i = 1; i < strs.length; i++) {
//			System.out.println(strs[i].startsWith(first));
//			while(!strs[i].startsWith(first)) {
//				first = first.substring(0, first.length()-1);
//			    if(first.isEmpty()) {
//			    	return "";
//			    }
//			}	
//		}
//		return first;
	}

}
