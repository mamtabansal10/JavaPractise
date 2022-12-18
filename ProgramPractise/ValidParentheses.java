import java.util.Stack;


public class ValidParentheses {

	public static void main(String[] args) {
		String s = "(])";
		System.out.println(isValid(s));

	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				stack.push('(');
			else if (s.charAt(i) == '{')
				stack.push('{');
			else if (s.charAt(i) == '[')
				stack.push('[');
			else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = stack.peek();
					if ((s.charAt(i) == ')' && top == '(')) {
						stack.pop();

					} else if ((s.charAt(i) == '}' && top == '{')) {
						stack.pop();

					} else if ((s.charAt(i) == ']' && top == '[')) {
						stack.pop();
					}
					else {
						return false;
					}
				}
			}

		}
		return stack.isEmpty();
	}

//      Pattern pattern = Pattern.compile("\\(\\)|\\[\\]|\\{\\}");
//      Matcher matcher = pattern.matcher(s);
//      boolean matchFound = matcher.find(); 
//	  return matchFound;

}
