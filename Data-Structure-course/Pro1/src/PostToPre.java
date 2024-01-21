import java.util.Stack;

public class PostToPre {
	static boolean isOperator(char x) {
		switch (x) {
		case '+':
		case '-':
		case '/':
		case '*':
		case '^':
			return true;
		}
		return false;
	}

	static String postfixToPrefix(String post_exp) {
		Stack<String> s = new Stack<String>();

		int length = post_exp.length();

		for (int i = 0; i < length; i++) {

			if (isOperator(post_exp.charAt(i))) {

				String op1 = s.peek();
				s.pop();
				String op2 = s.peek();
				s.pop();

				String temp = post_exp.charAt(i) + op2 + op1;

				s.push(temp);
			}

			else {

				s.push(post_exp.charAt(i) + "");
			}
		}

		return s.peek();
	}
}
