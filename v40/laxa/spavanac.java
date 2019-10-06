package laxa;

import java.util.Scanner;

public class spavanac {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int hour = in.nextInt();
		int min = in.nextInt();
		
		int diff = min - 45;
		
		if (diff < 0) {
			min = diff + 60;
			
			if (hour == 0) 
				hour = 24;
				System.out.println(hour - 1 + " " + min);
		}
		else {
			System.out.println(hour + " " + diff);
		}
		
	}

}
