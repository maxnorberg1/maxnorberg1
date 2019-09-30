package lektion;

import java.util.Scanner;

public class two_stones {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		int n = input.nextInt();
		
		if (n % 2 != 0) {
			System.out.println("Alice");
		}
		else if (n % 2 == 0) {
			System.out.println("Bob");
		}
		
	}

}
