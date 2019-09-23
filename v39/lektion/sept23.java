package lektion;

import java.util.Scanner;

public class sept23 {

	public static void main(String[] args) {
		
		
			Scanner input = new Scanner(System.in);
			// skriver ut 1-5
			for (int i = 1; i <= 5; i++) {
				System.out.println("Nummer " + i);
			}
			
			boolean exit = false;
			
			while (!exit) {
				System.out.println("Vill du skriva mer?");
				String line = input.nextLine();
				if(line.equals("nej")) {
					exit = true;
				}
			}
	}

}
  