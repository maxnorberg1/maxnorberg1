package laxa;

import java.util.Scanner;

public class homeworkV51 {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
				// t ex en meny för användare

				Scanner input = new Scanner(System.in);

				System.out.println("Welcome to the restaurant food picker! Please choose food genre!");
				System.out.println("(1) - American");
				System.out.println("(2) - Italian");
				System.out.println("(3) - Mexican");
				System.out.println("(4) - Indian");
				System.out.println("(5) - Quit");
				System.out.println();

				int choice = input.nextInt();

				String genre;

				switch (choice) {
				case 1:
					genre = "American";
					System.out.println("You chose " + genre + "! Here are some good American foods!");
					System.out.println();
					System.out.println("(1) - Buffalo Chicken Wings");
					System.out.println("(2) - Barbecue Ribs");
					System.out.println("(3) - Hamburger");
					System.out.println();
					break;
				case 2:
					genre = "Italian";
					System.out.println("You chose " + genre + "! Here are three good Italian dishes!");
					System.out.println();
					System.out.println("1. Pizza");
					System.out.println("2. Lasagna");
					System.out.println("3. Spaghetti Carbonara");
					System.out.println();
					break;
				case 3:
					genre = "Mexican";
					System.out.println("You chose " + genre + "! Here are three good Mexican dishes!");
					System.out.println();
					System.out.println("1. Tacos");
					System.out.println("2. Chicken Quesadillas");
					System.out.println("3. Chili Con Carne");
					System.out.println("4. Enchiladas");
					System.out.println();
					break;
				case 4:
					genre = "Indian";
					System.out.println("You chose " + genre + "! Here are three good Indian dishes! Don't forget to serve them all with Naan and Raita!");
					System.out.println();
					System.out.println("1. Tandoori Chicken");
					System.out.println("2. Tikka masala");
					System.out.println("3. Alu Gobi");
					System.out.println();
					break;
				case 5:
					System.out.println("Thank you for today! Hope you found something of your taste.");
					break;
				default:
					genre = "invalid";
					System.out.println("You have made a " + genre + " choice! Too bad for you!");
					System.out.println();
					break;
				}

				input.close();
				
	}

}
