package lektion;

import java.util.Scanner;

public class mathString {

	public static void main(String[] args) {

		double svar = Math.sqrt((Math.pow(3, 2) + 4)); 
		
		double hej = Math.PI * Math.sin(20);
		// System.out.println(svar + "\n" + hej);
		
		String mening = "hej";
		
		System.out.println(mening);
		Scanner in = new Scanner(System.in);
		
		String mening2 = in.nextLine();
		
		if (mening.equals(mening2)) {
			System.out.println("samma mening");
		}
		else {
			System.out.println("inte samma mening");
		}
		
		System.out.println("meningens längd: " + mening.length() + " bokstäver");
		System.out.println("meningen med stora bokstäver: " + mening.toUpperCase());
		System.out.println("stOp tALkiNg bROkE".toLowerCase());
		System.out.println("hej jag heter max".contains("max"));
		System.out.println("                                             Max                                     ".trim().toUpperCase());
		
		
		String bedram = in.nextLine().toLowerCase();
		
		if (bedram.contains("p" + "b")) {
			bedram = bedram.replace('p', 'b');
		}
		System.out.println(bedram);
	}

}
