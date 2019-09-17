package lektion;

import java.util.Scanner;

public class sept16 {

	public static void main(String[] args) {

		// villkor

		int age = 0; // initierat variabel
		int svar = 1;

		Scanner input = new Scanner(System.in); // gör det möjligt att få input från konsolen

		System.out.println("\tFÅR DU KÖRA BIL QUIZ" + "\n\tHUR MÅNGA ÅR HAR DU FYLLT???!");
		age = input.nextInt();

		if (age >= 18 && age < 85) {
			System.out.println("\twihoooo plattan i mattan! Grattis din lilla maddafakker!");
		} else if (age > 14 && age < 18) {
			System.out.println("\tLivet är roligare över 45 km/h :0");
		} else if (age >= 85) {
			System.out.println("\tDu är en LEVANDE TRAFIKFARA");
		} else {
			System.out.println("\tpffft!! Ta det lugnt och sätt dig i din bobbycar....");
		}

	}
}
