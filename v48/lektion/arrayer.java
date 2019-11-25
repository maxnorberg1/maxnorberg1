package lektion;

import java.util.Arrays;
import java.util.Scanner;

public class arrayer {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] siffror1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // skapar en array och fyller den med 10 tal

		int[] siffror2 = new int[10]; // skapar en array med 10 tomma lådor

		int[] summa = new int[10];// och skriver ut innehållet

		for (int i = 0; i < siffror2.length; i++) {
			siffror2[i] = in.nextInt();
		}

		for (int i = 0; i < summa.length; i++) { // loopar genom siffror1[]
			
			summa[i] = siffror1[i] + siffror2[i];

		}

		for (int i = 0; i < siffror1.length; i++) { // loopar genom siffror1[]
													// och skriver ut innehållet
			System.out.print(siffror1[i]);

		}
		System.out.println();
		System.out.println(Arrays.toString(siffror1));

		for (int i : siffror1) {
			System.out.print(i);
		}
	}
}
