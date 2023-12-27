import java.util.Stack;

public class InToPre {
	
	private final static Stack<String> stack = new Stack<String>();
	private static String output = "";

	static String inToPre(String input) {
		stack.clear(); 
		output = "";
		String[] str = input.split("");
		
		for (int i = input.length() - 1; i >= 0; i--) {
			String string = str[i];
			switch (string) {
			case "+":
			case "-":
				avlaviiat(string, 1);
				break;
			case "*":
			case "/":
				avlaviiat(string, 2);
				break;
			case "^":
				avlaviiat(string, 3);
				break;
			case ")":
				stack.push(string);
				break;
			case "(":
				parantez();
				break;
			default:
				output += string;
				break;
			}
		}

		while (!stack.isEmpty()) {
			String top = stack.pop();
			output += top;
		}

		return output;
	}

	private static void avlaviiat(String string, int arzesh1) {
		if (stack.isEmpty()) {
			stack.push(string);
		} else {
			while (!stack.isEmpty()) {
				String top = stack.pop();
				if (")".equals(top)) {
					stack.push(top);
					stack.push(string);
					break;
				} else {
					int arzesh2 = 0;
					switch (top) {
					case "+":
					case "-":
						arzesh2 = 1;
						break;
					case "*":
					case "/":
					case "%":
						arzesh2 = 2;
						break;
					case "^":
						arzesh2 = 3;
						break;
					}

					if (arzesh1 > arzesh2) {
						stack.push(top);
						stack.push(string);
						break;
					} else {
						output += top;
						stack.push(string);
						break;
					}
				}
			}
		}
	}

	private static void parantez() {
		while (!stack.isEmpty()) {
			String top = stack.pop();
			if (")".equals(top)) {
				break;
			} else {
				output += top;
			}
		}
	}
}
