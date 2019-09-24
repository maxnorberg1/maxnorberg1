package lektion;

import java.util.Scanner;

public class loop_ovningar {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
		}
		System.out.println("Den totala summan av alla heltal under 100 är: " + sum);
		
		
		System.out.println("\n" + "Alla heltal under mellan 25 och 50: ");
		for (int i = 25; i <= 50; i++) {
			System.out.println(i);
		}
		System.out.println("\n" + "Alla positiva heltal under under 20 i omvänd ordning: ");
		for (int i = 20; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("\nVälj ett positivt heltal under 10.");
		int tal = input.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i * tal);
		}
		System.out.println("\nSkriv in heltal. Skriv '0' för att få summan av dina heltal."); 
		int n = 1;
		int sum2 = 0;
		boolean writeSum = false;
		do {
			n = input.nextInt();
			sum2 = sum2 + n; 
			if (n == 0) {
				writeSum = true;
			}
		}
		while (!writeSum); {
		System.out.println("\nSumman av dina heltal är: " + sum2); 
		}
		
		
	}	

}
