package lektion;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {

		twoNumbers();

	}
	/**
	 * Skriver tv� heltal och skickar vidare dem
	 */

	public static void twoNumbers() {

		int tal1;
		int tal2;

		Scanner in = new Scanner(System.in);

		System.out.println("Skriv in tv� tal: ");

		tal1 = in.nextInt();
		tal2 = in.nextInt();

		System.out.println(minstaTal(tal1, tal2));

	}

	/**
	 * J�mf�r tv� heltal och utv�rderar vilket som �r minst. Samt skickar tillbaka
	 * svaret B^)
	 * 
	 * @param tal1
	 * @param tal2
	 */

	public static String minstaTal(int tal1, int tal2) {
		if (tal1 <= tal2) {
			System.out.println("Minsta talet �r: " + tal1 + " B^)");
		} else {
			System.out.println("Minsta talet �r: " + tal2 + " B^)");
		}

		String hej = "Metoden �r klar!";
		return hej;
	}
}
