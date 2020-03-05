package test;
import java.util.Scanner;

public class hittaFel {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[13];
		int index = 0;
		boolean success = false;

		for (int i = 0; i < numbers.length; i++) { // fyller arrayen med tal 1..10

			numbers[i] = i + 1;
		}

		while (!success) { // loopar arrayen tills att användaren skrivit in en int

			try {
				System.out.print("Write an index number: ");
				index = input.nextInt();
				System.out.println();
				success = true; // om rätt datatyp som input avslutas while-loopen

			} catch (Exception e) { // fixar felaktig input
				input.next(); // behövs för att göra sig av med felaktig input ovan
				System.out.println("Index must be an integer you idiot"); // eget felmeddelande till användare 
				System.out.println(e); // debugging för programmeraren
			}
			
		}

		try {
			System.out.println("Element " + index + " value is: " + numbers[index]);

		} catch (Exception e) { // om input tidigare större än 10 hamnar index out of bounds
			System.out.println("Array index out of bounds");
			System.out.println(e);
		}

	}
}