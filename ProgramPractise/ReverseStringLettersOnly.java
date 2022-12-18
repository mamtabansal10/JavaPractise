import java.util.HashMap;

public class ReverseStringLettersOnly {

	public static void main(String[] args) {
		String s = "a-bC-dEf-ghIj";
		System.out.println(reverseOnlyLetters(s));

	}

	public static String reverseOnlyLetters(String s) {

		// HashMap<Integer, Character> input = new HashMap<Integer, Character>();
		char[] output = new char[s.length()];
		// String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(s.charAt(i))) {
				output[i] = s.charAt(i);
//				System.out.print(output[i]);
			}
		}

		int j = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (Character.isLetter(s.charAt(i))) {
				while (output[j] != '\u0000')
					j++;
				output[j] = s.charAt(i);
				j++;
			}

		}
		
		return String.valueOf(output);
	}

}
