import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		reverseString(str);
		reverseStringWithoutReverse(str);
		removeDuplictes(str);

	}

	private static void removeDuplictes(String str) {
		Set<Character> setStr = new LinkedHashSet<Character>();
		for(int i=0; i<str.length();i++) {
		setStr.add(str.charAt(i));
		}
		Iterator<Character> itr = setStr.iterator();
		String newStr = "";
		while(itr.hasNext()) {
			newStr = newStr+itr.next();
		}
		System.out.println("removed duplictes : "+newStr);
	}

	private static void reverseStringWithoutReverse(String str) {
		char[] ch = str.toCharArray();
		String reverseStr = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverseStr = reverseStr+ch[i];
		}
		System.out.println("reverse string is : "+reverseStr);	
	}

	private static void reverseString(String str) {
		StringBuilder sb = new StringBuilder(str);
		System.out.println("reverse string is :");
		System.out.println(sb.reverse().toString());	
	}


}
