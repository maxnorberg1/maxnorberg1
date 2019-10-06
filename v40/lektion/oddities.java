package lektion;

import java.util.Scanner;

public class oddities {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int cases = input.nextInt();
		int number = 0;
		
		for (int i = 1; i <= cases; i++) {
			number = input.nextInt();
			
			if (number % 2 == 0)
			{
				System.out.println(number + " is even.");
			}
			else if (number % 2 != 0) {
				System.out.println(number + " is odd.");
			}
		}
		
		
	}

}
