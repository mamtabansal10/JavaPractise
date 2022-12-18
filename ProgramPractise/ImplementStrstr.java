
public class ImplementStrstr {

	public static void main(String[] args) {
		String haystack = "aaaa";
		String needle = "aaa";
		System.out.println(strStr(haystack, needle));

	}

	public static int strStr(String haystack, String needle) {
		if(needle.isEmpty()) {
			return 0;
		}

		if (haystack.length() > needle.length()) {
			int i = haystack.indexOf(needle);
			return i;
		} else {
			return -1;
		}
		
		
	}
}
