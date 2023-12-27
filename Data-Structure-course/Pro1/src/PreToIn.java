import java.util.Stack;

public class PreToIn {
	private final static Stack<String> stack = new Stack<String>();
	private static String output = "";

	static String preToIn(String input) {
		stack.clear();
		output = "";
		String[] str = input.split("");

		for (int i = input.length() - 1; i >= 0; i--) {
			String strr = str[i];
			if (isoperator(strr)) {
				String str2 = stack.pop();
				String str1 = "";
				
				if (!stack.isEmpty())
					str1 = stack.pop();

				stack.push("("+str2 + strr + str1+")");
			} else {
				stack.push(strr);
			}
		}

		while (!stack.isEmpty()) {
			output += stack.pop();
		}
		return output;
	}

	private static boolean isoperator(String str) {
		return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^");
	}
}
