import java.sql.Time;
import java.util.ArrayList;
import java.util.Collections;

public class PrimalityTest {
	// primality test
	// primality test
	public static ArrayList<Long> times = new ArrayList();
	public static Long total = (long) 0;

	public static void main(String[] args) {
		int n = 26;

		// 1th.
		for (int i = 1; i < n; i++) {
			c1(i);
		}
		System.out.println("c1) Min: " + Collections.min(times) + ", Avg: " + (total / times.size()) + ", Max: "
				+ Collections.max(times) + "\n------------------------------------------");
		times.clear();
		total = (long) 0;

		// 2th.
		for (int i = 1; i < n; i++) {
			c2(i);
		}
		System.out.println("c2) Min: " + Collections.min(times) + ", Avg: " + (total / times.size()) + ", Max: "
				+ Collections.max(times) + "\n------------------------------------------");
		times.clear();
		total = (long) 0;

		// 3th.
		for (int i = 1; i < n; i++) {
			c3(i);
		}
		System.out.println("c3) Min: " + Collections.min(times) + ", Avg: " + (total / times.size()) + ", Max: "
				+ Collections.max(times) + "\n------------------------------------------");
		times.clear();
		total = (long) 0;

		// 4th.
		for (int i = 1; i < n; i++) {
			c4(i);
		}
		System.out.println("c4) Min: " + Collections.min(times) + ", Avg: " + (total / times.size()) + ", Max: "
				+ Collections.max(times) + "\n------------------------------------------");
	}

	// version 1
	public static void c1(int n) {
		long start = System.nanoTime();
		boolean f = false;

		if (n <= 1) {
			long end = System.nanoTime();
			times.add(end - start);
			for (Long l : times)
				total += l;
			System.out.println(n + " is not prime");
			// System.out.print((total / times.size())+", ");
		} else {

			// Algorithm.
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					f = true;
				}
			}

			if (f == false) {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is prime");
				// System.out.print((total / times.size())+", ");
			} else {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is not prime");
				// System.out.print((total / times.size())+", ");
			}
		}
	}

	// version 2
	public static void c2(int n) {
		long start = System.nanoTime();
		boolean f = false;

		if (n <= 1) {
			long end = System.nanoTime();
			times.add(end - start);
			for (Long l : times)
				total += l;
			System.out.println(n + " is not prime");
			// System.out.print((total / times.size())+", ");
		} else {

			// Algorithm.
			for (int i = 2; i < n; i += 2) {
				if (n % i == 0) {
					f = true;
				}
			}

			if (f == false) {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is Prime");
				// System.out.print((total / times.size())+", ");
			} else {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is Not Prime");
				// System.out.print((total / times.size())+", ");
			}
		}
	}

	// version 3
	public static void c3(int n) {
		long start = System.nanoTime();
		boolean f = false;

		if (n <= 1) {
			long end = System.nanoTime();
			times.add(end - start);
			for (Long l : times)
				total += l;
			System.out.println(n + " is not prime");
			// System.out.print((total / times.size())+", ");
		} else {

			// Algorithm.
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0)
					f = true;
			}
			
			if (f == false) {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is Prime");
				// System.out.print((total / times.size())+", ");
			} else {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is Not Prime");
				// System.out.print((total / times.size())+", ");
			}
		}
	}

	// version 4: Trial division.
	public static void c4(int n) {
		long start = System.nanoTime();
		boolean f = false;

		if (n <= 1) {
			long end = System.nanoTime();
			times.add(end - start);
			for (Long l : times)
				total += l;
			System.out.println(n + " is not prime");
			// System.out.print((total / times.size())+", ");
		} else {

			// Algorithm.
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					f = true;
					break;
				}
			}

			if (f == false) {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is Prime");
				// System.out.print((total / times.size())+", ");
			} else {
				long end = System.nanoTime();
				times.add(end - start);
				for (Long l : times)
					total += l;
				System.out.println(n + " is Not Prime");
				// System.out.print((total / times.size())+", ");
			}
		}
	}
}
