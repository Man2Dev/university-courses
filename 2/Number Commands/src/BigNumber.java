import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner TheLine = new Scanner(System.in);
		String inputString = TheLine.nextLine();
		inputString = inputString.replace(")", "");
		inputString = inputString.replace("(", ",");
		String[] PartLine = inputString.split("_"); // Spiting the String at the point in witch they find a _.
		for (int i = 0; i < PartLine.length; i++) {
			String[] Word = PartLine[i].split(","); // Spiting the String at the point in witch they find a ,.
			for (int j = 0; j < Word.length; j++) { // sending it to proper class.
				if (Word[j].equals("add")) {
					System.out.println(Function.add(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("sub")) {
					System.out.println(Function.sub(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("pow")) {
					System.out.println(Function.pow(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("fact")) {
					System.out.println(Function.fact(Word[j + 1]));
				}
				if (Word[j].equals("nextPerm")) {
					System.out.println(Function.nextPerm(Word[j + 1]));
				}
				if (Word[j].equals("mod")) {
					System.out.println(Function.mod(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("rep")) {
					System.out.println(Function.rep(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("isPalindromes")) {
					if (Word.length == 1) { // if its got no enters.
						System.out.println("true");
						// if it has a null entry.
					} else if (Word.length == 2 && Word[1] != (",")) {
						System.out.println("false");
					} else {
						System.out.println(Function.isPalindromes(Word[j + 1], Word[j + 2]));
					}
				}
				if (Word[j].equals("sumOfDigits")) {
					System.out.println(Function.sumOfDigits(Word[j + 1]));
				}
				if (Word[j].equals("sort")) {
					System.out.println(Function.sort(Word[j + 1]));
				}
				if (Word[j].equals("rotate")) {
					System.out.println(Function.rotate(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("indexOf")) {
					System.out.println(Function.indexOf(Word[j + 1], Word[j + 2]));
				}
				if (Word[j].equals("subNumber")) {
					System.out.println(Function.subNumber(Word[j + 1], Word[j + 2], Word[j + 3]));
				}
				if (Word[j].equals("split")) {
					System.out.println(Function.split(Word[j + 1], Word[j + 2]));
				}
			}
		}
		TheLine.close();
	}
}
