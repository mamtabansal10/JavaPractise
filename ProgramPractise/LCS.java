
public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "XMJYAUZ";
		String str2 = "MZJAWXU";
		
       System.out.println(findSubsequence(str1,str2));
	}
	
	public static String findSubsequence(String word1, String word2) {


		    String MaxResult = "";
		    String result = "";
		    for (int i = 0 ; i < word1.length(); i++) {

		        String currRes = word1.substring(i, i+1);
		        int posRes = word2.indexOf(currRes);
		        if (posRes >= 0 ) {
		          result = currRes+findSubsequence(word1.substring(i+1),word2.substring(posRes+1));
		        }
		        if (result.length() > MaxResult.length()) {
		        	MaxResult = result;
		        	}
		      }

		      return MaxResult;
	}

}
