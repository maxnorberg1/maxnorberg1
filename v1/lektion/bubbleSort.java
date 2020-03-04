package lektion;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Hej Pedram! Hur många  iterationer vill du ha?");
		
		int iterationer = in.nextInt();
		
		System.out.println("Hur många antal vill du ha?");
		int antal = in.nextInt();
		
		System.out.println("Hur många iterationer vill du ha innan sorteringen är klar?");
		int sorterTal = in.nextInt();
		
		int[] numbers = new int[iterationer];
		boolean swapped = false;
		int temp;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random()*antal);
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
			
	
		swapped = false;
		for (int i = 0; i < sorterTal; i++) {
			if (numbers[i] > numbers[i+1]) { //byter plats på intilliggande tal
				temp = numbers[i]; //sparar tillfälligt värdet på vänstra sidan
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp;
				swapped = true;
			}
		}
		} while (swapped);
		
		System.out.println(Arrays.toString(numbers));
	}

}
