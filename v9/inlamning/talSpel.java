package inlamning;

import java.util.Scanner;

public class talSpel {

	public static void main(String[] args) {

		do {run();
		} while(true);
	}
	
	public static void run() {
		int repeat = 1;
		
	
		do {
			Scanner in = new Scanner(System.in);
			int firstChoice;
			int again;
			
			
			
			System.out.println("Welcome to my game! Please choose one of the alternatives below\n");
			System.out.println("(1) Start Game");
			System.out.println("(2) Game Instructions");
			System.out.println("(3) Credit Screen");
			System.out.println("(4) Exit Game");
			System.out.println();
			
			firstChoice = in.nextInt();
			
			switch (firstChoice) {
			case 1: 
				
				repeat = 0;
				game();
				
				break;
				
				
			case 2: 
				
				 
				System.out.println("Instructions\n");
				System.out.println("(1) Choose an interval");
				System.out.println("(2) Select difficulty. Harder difficulty means fewer attempts.");
				System.out.println("(3) Now the fun begins! Guess away!");
				System.out.println("(4) You will be notified if your guess is too high, too low, or just right! Try to guess the right number before you run out of attempts.");
				System.out.println("(5) After playing, you will be asked if you want to play again.\n");
				System.out.println("-- Press '0' to go back to main menu --");
				if (in.nextInt() == 0) {
					return;
				}
				break;
				
			case 3: 
				
				
				System.out.println("Credits\n");
				System.out.println("Creator: Max Norberg\n");
				System.out.println("-- Press '0' to go back to main menu --");
				if (in.nextInt() == 0) {
					return;
				}
				break;
				
			case 4:
				
				
				System.out.println("Exit\n");
				System.out.println("Are you sure you want to exit?");
				System.out.println("-- Press '1' to exit game, press '0' to go back to main menu --");
				again = in.nextInt();
				if (again == 1) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (again == 0) {
					return;
				}
			}
		
	} while (repeat == 1);


	
} public static void game() {
	Scanner in = new Scanner(System.in);
	
	int intervall;
	int diff;
	double randomNumber;
	int userGuess;  
	int iterationer;
	int playAgain;

	System.out.println("Game starting...\n");
	System.out.println("Choose the highest number in the interval\n");
	intervall = in.nextInt();
	
	randomNumber = (int)(Math.random() * ((intervall - 0) + 1));
	System.out.println("\n");
	do {
		System.out.println("Choose a difficulty\n");
		System.out.println("Press '1' for Easy difficulty, '2' for Medium difficulty and '3' for Hard difficulty");
		diff = in.nextInt();
		if (diff > 3 || diff < 0) {
			System.out.println();
		}
	} while (diff > 3 || diff < 0);
	
	if (diff == 1) { 
		System.out.println("Easy difficulty\n");
		iterationer = 14;
		for (int i = 0; i <= iterationer; i++) {
			
			System.out.println("Guess a number between 0 and " + intervall + "!");
			userGuess = in.nextInt();
			if (userGuess < randomNumber) { 
				System.out.println("Your guess is too low!");
			} else if (userGuess > randomNumber) {
				System.out.println("Your guess is too high!");
			} else if (userGuess == randomNumber) {
				System.out.println("You guessed the right number!");
				System.out.println("-- Press '1' play again, press '0' to exit game --");
				playAgain = in.nextInt();
				if (playAgain == 0) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				}
				
			}
			
			
			if (i == iterationer) {
				System.out.println("The right number was " + randomNumber + "\n");
				System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
				System.out.println("-- Press '1' play again, press '0' to exit game --");
				playAgain = in.nextInt();
				if (playAgain == 0) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				}
			}
		}
		
	} else if (diff == 2) {
		System.out.println("Medium difficulty\n");
		iterationer = 9;
		for (int i = 0; i <= iterationer; i++) {
			
			System.out.println("Guess a number between 0 and " + intervall + "!");
			userGuess = in.nextInt();
			if (userGuess < randomNumber) { 
				System.out.println("Your guess is too low!");
			} else if (userGuess > randomNumber) {
				System.out.println("Your guess is too high!");
			} else if (userGuess == randomNumber) {
				System.out.println("You guessed the right number!");
				System.out.println("-- Press '1' play again, press '0' to exit game --");
				playAgain = in.nextInt();
				if (playAgain == 0) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				}
			}
			
			if (i == iterationer) {
				System.out.println("The right number was " + randomNumber + "\n");
				System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
				System.out.println("-- Press '1' play again, press '0' to exit game --");
				playAgain = in.nextInt();
				if (playAgain == 0) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				}
			}
			
			
		}
		
	} else if (diff == 3) {
		System.out.println("Hard difficulty\n");
		iterationer = 4;
		for (int i = 0; i <= iterationer; i++) {
			
			System.out.println("Guess a number between 0 and " + intervall + "!");
			userGuess = in.nextInt();
			if (userGuess < randomNumber) { 
				System.out.println("Your guess is too low!");
			} else if (userGuess > randomNumber) {
				System.out.println("Your guess is too high!");
			} else if (userGuess == randomNumber) {
				System.out.println("You guessed the right number!");
				System.out.println("-- Press '1' play again, press '0' to exit game --");
				playAgain = in.nextInt();
				if (playAgain == 0) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				}
			}
			
			if (i == iterationer) {
				System.out.println("The right number was " + randomNumber + "\n");
				System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
				System.out.println("-- Press '1' play again, press '0' to exit game --");
				
				
				boolean success = false;
				
				while (!success) {
					
				
				try {
				playAgain = in.nextInt();
				success = true;
				if (playAgain == 0) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				}
				}
				catch (Exception e) {
					in.next();
					System.out.println("** Please write an integer **");
					
				}
				}
				
				
			}
		}
		
	}
} public static void tryCatch() {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[2];
		int index = 0;
		boolean success = false;
	
		for (int i = 0; i < numbers.length; i++) { // fyller arrayen med tal 1..10
	
			numbers[i] = i;  
		}
	 
		while (!success) { // loopar arrayen tills att användaren skrivit in en int
	
			try {
				System.out.print("-- Press '0' to go back to main menu --");
				index = input.nextInt(); 
				System.out.println();
				success = true; // om rätt datatyp som input avslutas while-loopen
	
			} catch (Exception e) { // fixar felaktig input
				input.next(); // behövs för att göra sig av med felaktig input ovan
				System.out.println("** Please write '0' or '1' **"); // eget felmeddelande till användare 
				System.out.println(e); // debugging för programmeraren
			}
			
		}
	
		try {
			System.out.println();
	
		} catch (Exception e) { // om input tidigare större än 10 hamnar index out of bounds
			System.out.println("** Please write '0' or '1' **"); 
			System.out.println(e);
		}

}


}

