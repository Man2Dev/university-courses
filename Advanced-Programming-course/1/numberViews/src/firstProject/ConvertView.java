package firstProject;

import java.util.Scanner;

public class ConvertView {

	static int Test(String adad, long Array[]) {

		int t = 0;
		int f = 0;
		for (int i = adad.length() - 1; i > 0; i--) { // checking from the end of the array how many zeros it has.
			if (Array[i] == 0 && f == 0) { // if its finds zeros in a row from the right to the left it win increases.
				t += 1;
			} else {
				f += 1;
			}
		}
		return t; // the number of with the array has numbers other than 0.
	}

	static String Yekan(int n, long Array[], int Dahgon) {
		String x = "";

		if (Array[n] == 1) { // numbers from 1 to 9.
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Yek ";
		} else if (Array[n] == 2) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Do ";
		} else if (Array[n] == 3) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Seh ";
		} else if (Array[n] == 4) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Chahar ";
		} else if (Array[n] == 5) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Panj ";
		} else if (Array[n] == 6) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Shesh ";
		} else if (Array[n] == 7) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Haft ";
		} else if (Array[n] == 8) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Hasht ";
		} else if (Array[n] == 9) {
			if (Dahgon >= 2 || 9 <= Dahgon || Dahgon == 0) {
				x += "o ";
			}
			x += "Noh ";
		}

		return x;
	}

	static String Dahgon1(int n, long Arr[], int Dah, int YesorNo) {
		String x = "";

		if (Arr[Dah] == 1) { // numbers from 10 to 19.
			if (Arr[n] == 0) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Dah ";
			} else if (Arr[n] == 1) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Yazdah ";
			} else if (Arr[n] == 2) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Davazdah ";
			} else if (Arr[n] == 3) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Sizdah ";
			} else if (Arr[n] == 4) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Chahardah ";
			} else if (Arr[n] == 5) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Panzdah ";
			} else if (Arr[n] == 6) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Shanzdah ";
			} else if (Arr[n] == 7) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Hefdah ";
			} else if (Arr[n] == 8) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Hejdah ";
			} else if (Arr[n] == 9) {
				if (YesorNo == 1) {
					x += "o ";
				}
				x += "Noozdah ";
			}
		}

		return x;
	}

	static String Dahgon2(int n, long Arr[]) { // just made this so that to shorten my code.
		String x = "";
		int m = n + 1;
		if (Arr[n] == 0) { // numbers of "dahgon" equal to 0. its from 1 to 9.
			x += Yekan(m, Arr, 0); // Checking the "yekan" of the number.
		} else if (Arr[n] == 1) { // numbers from 10 to 19.
			x += Dahgon1(m, Arr, n, 1); // Checking the "dahgon" of numbers form 10 to 19.
		} else if (Arr[n] == 2) { // numbers from 20 to 99.
			x += "o Bist ";

			x += Yekan(m, Arr, 2); // Checking the "yekan e 20" of the number.
		} else if (Arr[n] == 3) {
			x += "o Si ";

			x += Yekan(m, Arr, 3); // Checking the "yekan e 30" of the number.
		} else if (Arr[n] == 4) {
			x += "o Chehel ";

			x += Yekan(m, Arr, 4); // Checking the "yekan e 40" of the number.
		} else if (Arr[n] == 5) {
			x += "o Panjah ";

			x += Yekan(m, Arr, 5); // Checking the "yekan e 50" of the number.
		} else if (Arr[n] == 6) {
			x += "o Shast ";

			x += Yekan(m, Arr, 6); // Checking the "yekan e 60" of the number.
		} else if (Arr[n] == 7) {
			x += "o Haftad ";

			x += Yekan(m, Arr, 7); // Checking the "yekan e 70" of the number.
		} else if (Arr[n] == 8) {
			x += "o Hashtad ";

			x += Yekan(m, Arr, 8); // Checking the "yekan e 80" of the number.
		} else if (Arr[n] == 9) {
			x += "o Navad ";

			x += Yekan(m, Arr, 9); // Checking the "yekan e 90" of the number.
		}

		return x;
	}

	static String SadgonMillion(int n, long Arr[]) { // just for the 100 up to 900 million.
		String x = "";

		if (Arr[n] == 1) { // numbers from 100 to 900.
			x += "Sad ";
		}

		else if (Arr[n] == 2) {
			x += "Divist ";
		}

		else if (Arr[n] == 3) {
			x += "Sisad ";
		}

		else if (Arr[n] == 4) {
			x += "Chaharsad ";
		}

		else if (Arr[n] == 5) {
			x += "Pansad ";
		}

		else if (Arr[n] == 6) {
			x += "Sheshsad ";
		}

		else if (Arr[n] == 7) {
			x += "Haftsad ";
		}

		else if (Arr[n] == 8) {
			x += "Hashtsad ";
		}

		else if (Arr[n] == 9) {
			x += "Nohsad ";
		}

		return x;
	}

	static String Tagsim_Konnande_sadgon(int n, long Arr[]) {
		String x = "";
		int m = n + 1;

		if (Arr[n] == 0) { // Checking the sadgon of numbers from 001 to 099.

			x += Dahgon2(m, Arr);
		}
		if (Arr[n] == 1) { // numbers from 100 to 900.
			if (n != 0) { // if its not from 100 to 999 milliard.
				x += "o ";
			}

			x += "Sad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 2) {
			if (n != 0) {
				x += "o ";
			}

			x += "Divist ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 3) {
			if (n != 0) {
				x += "o ";
			}

			x += "Sisad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 4) {
			if (n != 0) {
				x += "o ";
			}

			x += "Chaharsad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 5) {
			if (n != 0) {
				x += "o ";
			}

			x += "Pansad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 6) {
			if (n != 0) {
				x += "o ";
			}

			x += "Sheshsad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 7) {
			if (n != 0) {
				x += "o ";
			}

			x += "Haftsad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 8) {
			if (n != 0) {
				x += "o ";
			}

			x += "Hashtsad ";

			x += Dahgon2(m, Arr);
		}

		else if (Arr[n] == 9) {
			if (n != 0) {
				x += "o ";
			}

			x += "Nohsad ";

			x += Dahgon2(m, Arr);
		}

		return x;
	}

	static String Dahgon_Milliard(int n, long Arr[]) { // rear to dahgon2 but for the first two numbers.
		String x = "";
		int m = n + 1;
		if (Arr[n] == 1) { // numbers from 10 to 19.
			x += Dahgon1(m, Arr, 0, 0); // Checking the "dahgon" of numbers form 10 to 19.
		} else if (Arr[n] == 2) { // numbers from 20 to 99.
			x += "Bist ";

			x += Yekan(m, Arr, 2); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 3) {
			x += "Si ";

			x += Yekan(m, Arr, 3); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 4) {
			x += "Chehel ";

			x += Yekan(m, Arr, 4); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 5) {
			x += "Panjah ";

			x += Yekan(m, Arr, 5); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 6) {
			x += "Shast ";

			x += Yekan(m, Arr, 6); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 7) {
			x += "Haftad ";

			x += Yekan(m, Arr, 7); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 8) {
			x += "Hashtad ";

			x += Yekan(m, Arr, 8); // Checking the "yekan e bist" of the number.
		} else if (Arr[n] == 9) {
			x += "Navad ";

			x += Yekan(m, Arr, 9); // Checking the "yekan e bist" of the number.
		}

		return x;
	}

	static String beHoruf(String adad) {
		String x = "";
		int u = adad.length();
		long[] b = new long[adad.length()];
		for (int i = 0; i < adad.length(); i++) {
			b[i] = adad.charAt(i) - 48;
		}
		if (u >= 10 || 12 <= u) { // Milliard.
			if (u == 10) { // -------------------------------------------a 10 digit number milliard.
				x += Yekan(0, b, -1); // Checking the "yekan" of the number.

				x += "Milliard ";
				// ---------------------------------------------------------------------------------a
				// 10 digit number in million.

				x += Tagsim_Konnande_sadgon(1, b);

				if (Test(adad, b) <= 8) { // Checking if it enders with all zeros.

					x += "Million ";
				}
				// ---------------------------------------------------------------------------------a
				// 10 digit number in Hezar.

				x += Tagsim_Konnande_sadgon(4, b);

				if (Test(adad, b) <= 5) {

					x += "Hezar ";
				}
				// ---------------------------------------------------------------------------------a
				// 10 digit number in Sad.

				x += Tagsim_Konnande_sadgon(7, b);
			}
			if (u == 11) { // -------------------------------------------a 11 digit number in milliard.

				x += Dahgon_Milliard(0, b);

				x += "Milliard ";
				// ---------------------------------------------------------------------------------a
				// 11 digit number in million.

				x += Tagsim_Konnande_sadgon(2, b);

				if (Test(adad, b) <= 8) { // Checking if it enders with all zeros.

					x += "Million ";
				}
				// ---------------------------------------------------------------------------------a
				// 11 digit number in Hezar.

				x += Tagsim_Konnande_sadgon(5, b);

				if (Test(adad, b) <= 5) {

					x += "Hezar ";
				}
				// ---------------------------------------------------------------------------------a
				// 11 digit number in Sad.

				x += Tagsim_Konnande_sadgon(8, b);
			}
			if (u == 12) { // -------------------------------------------a 12 digit number in milliard.

				x += Tagsim_Konnande_sadgon(0, b);

				x += "Milliard ";
				// ---------------------------------------------------------------------------------a
				// 12 digit number in million.

				x += Tagsim_Konnande_sadgon(3, b);

				if (Test(adad, b) <= 8) {

					x += "Million ";
				}
				// ---------------------------------------------------------------------------------a
				// 12 digit number in Hezar.

				x += Tagsim_Konnande_sadgon(6, b);

				if (Test(adad, b) <= 5) {

					x += "Hezar ";
				}
				// ---------------------------------------------------------------------------------a
				// 12 digit number in Sad.

				x += Tagsim_Konnande_sadgon(9, b);
			}
		}

		else if (u >= 7 || 9 <= u) { // Million.
			if (u == 7) { // -------------------------------------------a 7 digit number million.
				x += Yekan(0, b, -1); // Checking the "yekan" of the number.

				x += "Million ";
				// ---------------------------------------------------------------------------------a
				// 7 digit number in Hezar.

				x += Tagsim_Konnande_sadgon(1, b);

				if (Test(adad, b) <= 5) {

					x += "Hezar ";
				}
				// ---------------------------------------------------------------------------------a
				// 7 digit number in Sad.

				x += Tagsim_Konnande_sadgon(4, b);
			}
			if (u == 8) { // -------------------------------------------a 8 digit number in million.

				x += Dahgon_Milliard(0, b);

				x += "Million ";
				// ---------------------------------------------------------------------------------a
				// 8 digit number in Hezar.

				x += Tagsim_Konnande_sadgon(2, b);

				if (Test(adad, b) <= 5) {

					x += "Hezar ";
				}
				// ---------------------------------------------------------------------------------a
				// 8 digit number in Sad.

				x += Tagsim_Konnande_sadgon(5, b);
			}
			if (u == 9) { // -------------------------------------------a 9 digit number in million.

				x += Tagsim_Konnande_sadgon(0, b);

				x += "Million ";
				// ---------------------------------------------------------------------------------a
				// 9 digit number in Hezar.

				x += Tagsim_Konnande_sadgon(3, b);

				if (Test(adad, b) <= 5) {

					x += "Hezar ";
				}
				// ---------------------------------------------------------------------------------a
				// 9 digit number in Sad.

				x += Tagsim_Konnande_sadgon(6, b);
			}
		} else if (u >= 4 || 6 <= u) { // Hezer.
			if (u == 4) { // -------------------------------------------a 4 digit number Hezar.
				x += Yekan(0, b, -1); // Checking the "yekan" of the number.

				x += "Hezar ";
				// ---------------------------------------------------------------------------------a
				// 4 digit number in Sad.

				x += Tagsim_Konnande_sadgon(1, b);
			}
			if (u == 5) { // -------------------------------------------a 5 digit number in Hezar.

				x += Dahgon_Milliard(0, b);

				x += "Hezar ";
				// ---------------------------------------------------------------------------------a
				// 5 digit number in Sad.

				x += Tagsim_Konnande_sadgon(2, b);
			}
			if (u == 6) { // -------------------------------------------a 6 digit number in million.

				x += Tagsim_Konnande_sadgon(0, b);

				x += "Hezar ";
				// ---------------------------------------------------------------------------------a
				// 6 digit number in Sad.

				x += Tagsim_Konnande_sadgon(3, b);
			}
		} else if (u == 3) { // Sad.
			x += Tagsim_Konnande_sadgon(0, b);
		} else if (u == 2) { // dahgon.
			x += Dahgon_Milliard(0, b);
		} else if (u == 1) { // yekan.
			if (b[0] == 0) {
				x += "Sefr ";
			} else {
				x += Yekan(0, b, -1);
			}

		}

		return x;
	}

	static String beRaqam(String adad) {
		long x = 0;
		String b = " o ";
		String c = " ";
		String List[] = { "Sefr", "Yek", "Do", "Seh", "Chahar", "Panj", "Shesh", "Haft", "Hasht", "Noh", "Dah",
				"Yazdah", "Davazdah", "Sizdah", "Chahardah", "Panzdah", "Shanzdah", "Hefdah", "Hejdah", "Noozdah",
				"Bist", "Si", "Chehel", "Panjah", "Shast", "Haftad", "Hashtad", "Navad", "Sad", "Divist", "Sisad",
				"Chaharsad", "Pansad", "Sheshsad", "Haftsad", "Hashtsad", "Nohsad", "Hezar", "Yek Million",
				"Yek Milliard" };
		adad = adad.replaceAll(b, c);
		String a[] = adad.split(" "); // Spiting the String at the point in witch they find a space.

		for (String temp : a) {
			if (adad.equals(List[0])) {
				System.out.println(List[0]);
			}
			System.out.println(temp);
		}
		
		return " ";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int command = sc.nextInt();
		sc.nextLine();
		String inputString = sc.nextLine();

		if (command == 0) {
			System.out.println(beHoruf(inputString));
		} else {
			System.out.println(beRaqam(inputString));
		}
		sc.close();
	}

}
