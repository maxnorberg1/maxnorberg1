package lektion;

import java.util.Scanner;

public class metoder {

	public static void main(String[] args) {

		twoNumbers();

	}
	/**
	 * Skriver två heltal och skickar vidare dem
	 */

	public static void twoNumbers() {

		int tal1;
		int tal2;

		Scanner in = new Scanner(System.in);

		System.out.println("Skriv in två tal: ");

		tal1 = in.nextInt();
		tal2 = in.nextInt();

		System.out.println(minstaTal(tal1, tal2));

	}

	/**
	 * Jämför två heltal och utvärderar vilket som är minst. Samt skickar tillbaka
	 * svaret B^)
	 * 
	 * @param tal1
	 * @param tal2
	 */

	public static String minstaTal(int tal1, int tal2) {
		if (tal1 <= tal2) {
			System.out.println("Minsta talet är: " + tal1 + " B^)");
		} else {
			System.out.println("Minsta talet är: " + tal2 + " B^)");
		}

		String hej = "Metoden är klar!";
		return hej;
	}
}
