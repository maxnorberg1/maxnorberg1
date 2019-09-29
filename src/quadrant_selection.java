import java.util.Scanner;

public class quadrant_selection {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int quad = 0;
		
		if (x > 0 && y > 0) {
			quad = 1;
		}
		else if (x < 0 && y > 0) {
			quad = 2;
		}
		else if (x < 0 && y < 0) {
			quad = 3;
		}
		else if (x > 0 && y < 0) {
			quad = 4;
		}
		
		System.out.println(quad);
	}

}
