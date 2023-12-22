import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Function {

	public static ArrayList<Integer> arrList1 = new ArrayList<Integer>();
	public static ArrayList<Integer> arrList2 = new ArrayList<Integer>();
	public static ArrayList<Long> timeUnion = new ArrayList<Long>();
	public static ArrayList<Long> timeIntersection = new ArrayList<Long>();

	// intersection.
	public static ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b, boolean sort) {
		long start = System.nanoTime();

		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> temp = new HashSet<Integer>();

		for (Integer t : a) {
			if (b.contains(t)) {
				temp.add(t);
			}
		}

		ans.addAll(temp);

		long end = System.nanoTime();
		timeIntersection.add(end - start);

		if (sort) {
			Collections.sort(ans);
			return ans;
		} else {
			return ans;
		}
	}

	// making random integer in an array list.
	public static ArrayList<Integer> ranArrL(int length, int maxNum) {
		ArrayList<Integer> arrayRandom = new ArrayList<Integer>();

		try {
			Random rand = new Random();
			rand.setSeed(System.nanoTime());

			for (int i = 0; i < length; i++) {
				Integer r = rand.nextInt((maxNum + 1));
				arrayRandom.add(r);
			}

		} catch (Exception e) {
		}

		return arrayRandom;
	}

	public static void timeComplexity() {
		timeUnion.clear();
		timeIntersection.clear();

		arrList1.clear();
		arrList2.clear();
		for (int i = 0; i < Gui.getSlider_2().getValue(); i++) {
			arrList1.addAll(ranArrL(Gui.getSlider().getValue(), Gui.getSlider_1().getValue()));
			arrList2.addAll(ranArrL(Gui.getSlider().getValue(), Gui.getSlider_1().getValue()));

			union(arrList1, arrList2, Gui.getChckbxSort().isSelected());
			intersection(arrList1, arrList2, Gui.getChckbxSort().isSelected());

			arrList1.clear();
			arrList2.clear();
		}
	}

	// union.
	public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b, boolean sort) {
		long start = System.nanoTime();

		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashSet<Integer> temp = new HashSet<Integer>();

		temp.addAll(a);
		temp.addAll(b);

		ans.addAll(temp);

		long end = System.nanoTime();
		timeUnion.add(end - start);

		if (sort) {
			Collections.sort(ans);
			return ans;
		} else {
			return ans;
		}
	}

	// public static void main(String[] args) {
	// arrList1.addAll(ranArrL(Gui.getSlider().getValue(),
	// Gui.getSlider_1().getValue()));
	// arrList2.addAll(ranArrL(Gui.getSlider().getValue(),
	// Gui.getSlider_1().getValue()));
	//
	// System.out.println(arrList1 + "\n" + arrList2 + "\n" + union(arrList1,
	// arrList2, true));
	// }

}
