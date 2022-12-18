public class LengthLastWord {
	
	public static void main(String[] args) {
		String s = "luffy is still joyboy";
		System.out.println(lengthOfLastWord(s));
	}
	
	public static int lengthOfLastWord(String s) {
		String str = s.trim();
		String[] splitStr = str.split(" ");
		return splitStr[splitStr.length-1].length();	
	}
}
