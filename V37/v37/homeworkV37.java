package v37;

import java.util.Scanner;

public class homeworkV37 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Vad heter du?");
		String namn1 = input.nextLine();
		
		System.out.println("Hur gammal ‰r du?");
		String age = input.nextLine();
		
		System.out.println("Vad ‰r din adress?");
		String adress = input.nextLine();
		
		System.out.println("Vad ‰r ditt postnummer?");
		String postnr = input.nextLine();
		
		System.out.println("Vilken stad bor du i?");
		String stad = input.nextLine();
		
		System.out.println("Vad ‰r ditt telefonnummer?");
		String telenr = input.nextLine();
		
		
		System.out.println("\n\tInformation: " + "\n\tNamn: " + namn1 + "\n\t≈lder: " + age + "\n\tAdress: " + adress + "\n\t" + postnr + " " +  stad + "\n\tTelefon: " + telenr); 
		
	}

}
