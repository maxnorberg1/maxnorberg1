package lektion;

import java.util.Scanner;

public class sept16 {

	public static void main(String[] args) {

		// villkor

		int age = 0; // initierat variabel
		int svar = 1;

		Scanner input = new Scanner(System.in); // g�r det m�jligt att f� input fr�n konsolen

		System.out.println("\tF�R DU K�RA BIL QUIZ" + "\n\tHUR M�NGA �R HAR DU FYLLT???!");
		age = input.nextInt();

		if (age >= 18 && age < 85) {
			System.out.println("\twihoooo plattan i mattan! Grattis din lilla maddafakker!");
		} else if (age > 14 && age < 18) {
			System.out.println("\tLivet �r roligare �ver 45 km/h :0");
		} else if (age >= 85) {
			System.out.println("\tDu �r en LEVANDE TRAFIKFARA");
		} else {
			System.out.println("\tpffft!! Ta det lugnt och s�tt dig i din bobbycar....");
		}

	}
}
