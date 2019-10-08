package lektion;

import java.util.Scanner;

public class blandade_uppgifter {

	public static void main(String[] args) {

		int digit;
		int number;
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Skriv ett heltal: ");
		
		number = in.nextInt();
		
		while (number != 0) {
			
			digit = number % 10;
			sum += digit;
			number /= 10;
		}
		System.out.println(sum);
		
		System.out.println("Skriv in heltal: ");
		int n;
		double y = -1;
		int sum2 = 0;
		boolean writeSum = false;
		do {
			n = in.nextInt();
			sum2 += n;
			y += 1;
			if (n == 0) {
				writeSum = true;
			}
		}
		while (!writeSum); {
		System.out.println("\nSumman av dina heltal är: " + sum2 + "\nMedelvärdet är: " + sum2/y);  
		}
			
	}

}
