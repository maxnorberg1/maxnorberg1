package lektion;

import java.util.Scanner;

public class sept16 {

	public static void main(String[] args) {

		// villkor

		int age = 0; // initierat variabel
		int again = 1;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("\tVill du testa igen? Skriv (1) om ja, (2) om nej");
			again = 
		}
		while (!(again == 1)); 
		

		Scanner input = new Scanner(System.in); // g�r det m�jligt att f� input fr�n konsolen

		if (again) {

			System.out.println("\tF�R DU K�RA BIL QUIZ" + "\n\tHUR M�NGA �R HAR DU FYLLT???!");
			age = input.nextInt();

			if (age >= 18 && age < 85) {

				System.out.println("\twihoooo plattan i mattan! Grattis din lilla maddafakker!");
			} else if (age > 14 && age < 18) {
				System.out.println("\tLivet �r roligare �ver 45 km/h :0");
			} else if (age > 85) {
				System.out.println("\tDu �r en LEVANDE TRAFIKFARA");
			} else {
				System.out.println("\tpffft!! Ta det lugnt och s�tt dig i din bobbycar....");
			}
			while (again != age); 
			
			
		}
	}  
}
