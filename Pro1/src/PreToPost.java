
class PreToPost {

	static boolean isOperator(char ch) {
		switch (ch) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
		default:
			return false;
		}
	}

	static String preToPost(String exp) {
		int i;
		PreToPost s = new PreToPost();
		String exp_str[] = new String[100];
		String postfix_exp = "";

		for (i = 0; i <= exp.length() - 1; i++) {
			exp_str[exp.length() - 1 - i] = Character.toString(exp.charAt(i));
		}

		i = 0;
		do {
			if (!isOperator(exp_str[i].charAt(0)))
				s.push(exp_str[i]);
			else {
				String str1 = s.pop();
				String str2 = s.pop();
				str1 = str1 + str2 + exp_str[i];
				postfix_exp = str1;
				s.push(str1);
			}
			i++;
		} while (s.getTop() >= 0 && i != exp.length());

		return postfix_exp;
	}

	private int top, MAX;

	private String a[] = new String[1000];;

	public PreToPost() {
		top = -1;
		MAX = 1000;
		a[0] = "";
	}

	public int getTop() {
		return top;
	}

	public String pop() {
		if (top != -1) {
			return a[top--];
		} else {
			return "";
		}
	}

	public void push(String x) {
		if (top <= MAX - 1) {
			a[++top] = x;
		}
	}
}