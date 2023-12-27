import java.util.*;

public class Function {
	static int max(String num1, String num2) { // just gives the length of the biggest String.
		int max = 0;
		if (num1.length() < num2.length()) {
			max = num2.length();
		} else {
			max = num1.length();
		}
		return max;
	}

	public static String add(String num1, String num2) {
		// if its a one digit number.
		if (num1.length() == 1 && num2.length() == 1 && (Integer.parseInt(num1) + Integer.parseInt(num2)) >= 10) {
			return Integer.toString(Integer.parseInt(num1) + Integer.parseInt(num2));
		}
		int max = 0; // the length of the biggest String.
		int bigerNum = 0; // when you add two number and the result is bigger than 9.
		String stringAns = "";// the String that will be returned.
		max = max(num1, num2);// finding the String with the biggest length.
		char[] num01 = num1.toCharArray();
		char[] num02 = num2.toCharArray();
		// using this to add zeros to the empty spaces that the smaller one has.
		int number1[] = new int[max];
		int number2[] = new int[max];
		// when adding two numbers the result can be bigger than the one with biggest
		// length therefore I added 1 more space than the max length of the biggest
		// String.
		int total[] = new int[max + 1];

		if (num1.contains("-") == true && num2.contains("-") == true) { // if -num1 && -num2.
			num1 = num1.replaceAll("-", "");
			num2 = num2.replaceAll("-", "");
			return "-" + add(num1, num2);

		} else if (num1.contains("-") == true && num2.contains("-") == false) { // if -num1 && +num2.
			num1 = num1.replaceAll("-", "");
			if (num1.compareTo(num2) == 1) { // if num2 > num1.
				return sub(num2, num1);
			} else if (num2.compareTo(num1) == 1) { // if num1 > num2.
				return "-" + sub(num2, num1);
			} else { // if num1 == num2.
				return sub(num1, num2);
			}

		} else if (num1.contains("-") == false && num2.contains("-") == true) { // if +num1 && -num2.
			num2 = num2.replaceAll("-", "");
			return sub(num1, num2);

		} else { // if num1 && num2.
			// adding numbers in char to int array in reverse.
			for (int i = 0; i < num1.length(); i++) {
				number1[i] = num01[(num1.length() - 1) - i] - 48;
			}
			for (int i = 0; i < num2.length(); i++) {
				number2[i] = num02[(num2.length() - 1) - i] - 48;
			}

			for (int i = 0; i < max; i++) { // adding all the variables together.
				total[i] = ((number1[i] + bigerNum) + number2[i]) % 10;
				if (((number1[i] + bigerNum) + number2[i]) > 9) { // whether or not the next total in array gets added 1
																	// more
					// which only happens if the total is more that 9.
					// adding 1 to the (dahgon) of the number.
					bigerNum = 1;
				} else {
					// adding nothing to the (dahgon) of the number.
					bigerNum = 0;
				}
			}
			// adding the array to String in correct order.
			for (int j = max - 1; j >= 0; j--) {
				stringAns += total[j];
			}
		}
		return stringAns;
	}

	public static String sub(String str1, String str2) {
		return null;
	}

	public static String pow(String num1, String num2) {
		return null;
	}

	public static String fact(String num1) {
		return null;
	}

	public static String nextPerm(String num1) {
		return null;
	}

	public static String mod(String num1, String num2) {
		return null;
	}

	public static String rep(String num1, String num2) {
		String CopyOfString = num1;
		String temp = "0";
		// adding to temp 1 by 1 until its equal to num2.
		while (temp.equals(num2) == false) {
			temp = add(temp, "1");
			num1 += CopyOfString;
		}
		// just so i can get rid of the first repeat and return the correct number of
		// repeats.
		return num1.replaceFirst(CopyOfString, "");
	}

	public static boolean isPalindromes(String num1, String num2) {
		char temp; // just a temp needed for swap.
		int numberLin = num1.length() - 1;
		char[] StringToChar = num1.toCharArray(); // converting String to char Array.
		char[] CopyOfString = Arrays.copyOf(num2.toCharArray(), num2.length()); // Turning (num2) to char and copying it
		// so that i can compare it to the reversed num1.

		for (int i = 0; i < num1.length() / 2; i++) { // reversing num1.
			// looping until next to last thing in the middle of the array so that i can
			// reveres it up to then.
			temp = StringToChar[i];
			StringToChar[i] = StringToChar[numberLin - i];
			StringToChar[numberLin - i] = temp;
		}

		return Arrays.equals(CopyOfString, StringToChar); // Comparing the original of the second string (num2) with the
															// reverse of (num1).
	}

	public static String sumOfDigits(String num1) {
		String answer = "0000";
		// Spiting each digit of string to an String array.
		String[] splitNum1 = num1.split("");
		// String[] StringArray = new String[input.length()];
		for (int i = 0; i < num1.length(); i++) {
			// adding each number to each other.
			answer = add(splitNum1[i], answer);
		}
		return answer;
	}

	public static String sort(String num1) {
		String EndSort = "";
		char[] num01 = num1.toCharArray();
		int numLin = num01.length;
		char temp;
		for (int i = 0; i < numLin; i++) {
			for (int j = 1; j < (numLin - i); j++) {
				if (num01[j - 1] > num01[j]) {
					// swapping.
					temp = num01[j - 1];
					num01[j - 1] = num01[j];
					num01[j] = temp;
				}
			}
		}
		for (int i = 0; i < num01.length; i++) {
			EndSort += num01[i];
		}
		return EndSort;
	}

	public static String rotate(String num1, String num2) {
		return null;
	}

	public static int indexOf(String num1, String num2) {
		// Splitting num1 && num2 to array though split.
		String[] num01 = num1.split("");
		String[] num02 = num2.split("");
		// looping though array if num1 is a 1 digit number the first one it finds it
		// returns it.
		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				if (num02[j].equals(num01[i])) {
					if (num1.length() == 1) {
						return j;
					} else { // if num1 is more than a 1 digit number.
						for (int t = j; t < num2.length(); t++) { // i take apart the string from the point that the
																	// last sign similarities were found.
							if (num1.equals(
									subNumber(num2, Integer.toString(t), Integer.toString(t + num1.length())))) {
								return t;
							} else if (subNumber(num2, Integer.toString(t),
									Integer.toString(t + num1.length())) == null) {
								return -1;
							}
						}
					}
				}
			}
		}
		return -1;
	}

	public static String subNumber(String num1, String num2, String num3) {
		String ans = "";
		// using parseInt because num2 and num3 can't be bigger than 200.
		int num02 = Integer.parseInt(num2);
		int num03 = Integer.parseInt(num3);
		// Spiting each digit of string to an String array.
		String[] numm = num1.split("");
		// if its out of range.
		if ((num1.length() - 1 > num02 && num1.length() < num03) || (num02 < 0 && num03 < 1) || (num02 >= num03)
				|| (num02 < 0) || (num03 > num1.length())) {
			return null;
		} else { // adding the numbers from num2 to num3 to the string.
			for (int i = num02; i < num03; i++) {
				ans += numm[i];
			}
		}
		return ans;
	}

	static String indexOfAll(String num1, String num2) {
		// Splitting num1 && num2 to array though split.
		String[] num01 = num1.split("");
		String[] num02 = num2.split("");
		String num = "";
		do { // Basically the same as in index of but gives index of all.
			for (int i = 0; i < num1.length(); i++) {
				for (int j = 0; j < num2.length(); j++) {
					if (num02[j].equals(num01[i])) {
						if (num1.length() == 1) {
							num += "," + Integer.toString(j);
						} else { // if num1 is more than a 1 digit number.
							for (int t = j; t < num2.length(); t++) { // i take apart the string from the point that the
																		// last sign similarities were found.
								if (num1.equals(
										subNumber(num2, Integer.toString(t), Integer.toString(t + num1.length())))) {
									num += "," + Integer.toString(t);
								} else if (subNumber(num2, Integer.toString(t),
										Integer.toString(t + num1.length())) == null) {
									break;
								}
							}
						}
					}
				}
			}
			return num.replaceFirst(",", "");
		} while (true);
	}

	public static String split(String num2, String num1) {
		// Splitting num1 to array though split.
		String start = "";
		String middle = "";
		String end = "";
		String[] num0 = indexOfAll(num1, num2).split(",");

		if (Integer.parseInt(num0[0]) > 0) {
			// this is the start of the answer if num2 doesn't start with what's in num1.
			start += (subNumber(num2, Integer.toString(0), num0[0]));
			start += "_";
		} else if ((Integer.parseInt(num0[0])) == 0) {
			// this is the underline if num2 starts with wants in num1.
			start += "_";
		}

		for (int i = 0; i < num0.length - 1; i++) {
			// every thing in the middle.
			middle += subNumber(num2, Integer.toString(Integer.parseInt(num0[i]) + num1.length()), num0[i + 1]);
			middle += "_";

			if (subNumber(num2, Integer.toString(Integer.parseInt(num0[i]) + num1.length()), num0[i + 1]) == null) {
				// if it only has 1 thing to split in the middle.
				middle = middle.replaceAll("null_", "");
				break;
			}
		}
		if ((Integer.parseInt(num0[num0.length - 1]) + num1.length()) < num2.length()) {
			// this is the end of the answer if num2 doesn't end with what's in num1.
			end = (subNumber(num2, Integer.toString(Integer.parseInt(num0[num0.length - 1]) + num1.length()),
					Integer.toString(num2.length())));
		}
		return (start) + (middle) + (end);
	}
}
