package laxa;

import java.util.Scanner;

public class homeworkV38 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.println("Skriv in 5 heltal:");
			int n1 = input.nextInt();
			int n2 = input.nextInt();
			int n3 = input.nextInt();
			int n4 = input.nextInt();
			int n5 = input.nextInt();
			
			int highest = 1;
			int lowest = 1;
			
			if (n1 < n2 && n1 < n3 && n1 < n4 && n1 < n5) {
				lowest = n1;
			}
			else if (n2 < n1 && n2 < n3 && n2 < n4 && n2 < n5) { 
				lowest = n2;
			}
			else if (n3 < n1 && n3 < n2 && n3 < n4 && n3 < n5) {
				lowest = n3;
			}
			else if (n4 < n1 && n4 < n2 && n4 < n3 && n4 < n5) {
				lowest = n4 ;
			}
			else if (n5 < n1 && n5 < n2 && n5 < n3 && n5 < n4) {
				lowest = n5;
			}
			
			if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
				highest = n1;
			}
			else if (n2 > n1 && n2 > n3 && n2 > n4 && n2 > n5) {
				highest = n2;
			}
			else if (n3 > n1 && n3 > n2 && n3 > n4 && n3 > n5) {
				highest = n3;
			}
			else if (n4 > n1 && n4 > n2 && n4 > n3 && n4 > n5) {
				highest = n4;
			}
			else if (n5 > n1 && n5 > n2 && n5 > n3 && n5 > n4) {
				highest = n5;
			} 
			System.out.println("\n\tDet högsta talet är: " + highest + "\n\tDet lägsta talet är: " + lowest);
			
	} 

}
