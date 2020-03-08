package inlamning;

import java.util.Scanner;

public class talSpel {

	public static void main(String[] args) {

		do {run();
		} while(true);
	}
	
	public static void run() {
		boolean repeat = false;
		
	
		while (!repeat) {
			Scanner in = new Scanner(System.in);
			int firstChoice;
			int again;
			
			boolean success = false;
			
			while (!success) {
				
				
				try {
					System.out.println("Welcome to my game! Please choose one of the alternatives below\n");
					System.out.println("(1) Start Game");
					System.out.println("(2) Game Instructions");
					System.out.println("(3) Credit Screen");
					System.out.println("(4) Exit Game");
					System.out.println();
					
					firstChoice = in.nextInt();
				

				success = true;
				
				if (firstChoice < 1 || firstChoice > 4) {
					System.out.println("** You did not enter one of the given numbers. Try again. **");
					success = false;
				}
				
				
			
			
			
			
			switch (firstChoice) {
			case 1: 
				
				
				game();
				
				break;
				
				
			case 2: 
				
				 
				System.out.println("Instructions\n");
				System.out.println("(1) Choose an interval");
				System.out.println("(2) Select difficulty. Harder difficulty means fewer attempts.");
				System.out.println("(3) Now the fun begins! Guess away!");
				System.out.println("(4) You will be notified if your guess is too high, too low, or just right! Try to guess the right number before you run out of attempts.");
				System.out.println("(5) After playing, you will be asked if you want to play again.\n");
				pressZero();
				break;
				
			case 3: 
				
				
				System.out.println("Credits\n");
				System.out.println("Creator: Max Norberg\n");
				pressZero();
				break;
				
			case 4:
				
				
				System.out.println("Exit\n");
				System.out.println("Are you sure you want to exit?");
				
				success = false; 
				
				while (!success) {
					
				
				try {
					System.out.println("-- Press '1' to exit game, press '0' to go back to main menu --");
					
					again = in.nextInt(); 
					success = true;
				
					if (again < 0 || again > 1) {
						System.out.println("** You did not enter one of the given numbers. Try again. **");
						success = false;
					}
					
					
					if (again == 0) {
						run();
					} else if (again == 1) {
						System.out.println("Game is closed.");
						System.exit(0);
					} 
					}
					catch (Exception e) {
						in.next();
						System.out.println("** You did not enter a integer. Try again. **");
						
						
					}
					}
				
				
				again = in.nextInt();
				if (again == 1) {
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (again == 0) {
					repeat = true;
				}
			}
		
	} 
			catch (Exception e) {
				in.next();
				System.out.println("** You did not enter a integer. Try again. **");
				
				
			}
			} 
		}


	
} public static void game() {
	Scanner in = new Scanner(System.in);
	
	int intervall;
	int diff;
	double randomNumber; 
	int userGuess;  
	
	
	System.out.println("Game starting...\n");
	System.out.println("Choose the highest number in the interval\n");
		intervall = in.nextInt();
		
		
		randomNumber = (int)(Math.random() * ((intervall - 0) + 1));
		System.out.println("\n");
	
			System.out.println("Choose a difficulty\n");
			System.out.println("Press '1' for Easy difficulty, '2' for Medium difficulty and '3' for Hard difficulty");
			
			
			
			
			do {
				diff = in.nextInt();
				if (diff > 3 || diff < 0) {
					System.out.println("** You did not enter a integer. Try again. **");
					
				}
			
			
			} while (diff > 3 || diff < 0); 
			 
			
		
		if (diff == 1) { 
			System.out.println("Easy difficulty\n");
			for (int i = 14; i >= 0; i--) { 
				
				System.out.println("Guess a number between 0 and " + intervall + "!");
				userGuess = in.nextInt();
				if (userGuess < randomNumber) { 
					System.out.println("Your guess is too low!");
				} else if (userGuess > randomNumber) {
					System.out.println("Your guess is too high!");
				} else if (userGuess == randomNumber) {
					System.out.println("You guessed the right number!");
					playAgain();
					
				}
				
				
				
				if (i == 0) { 
					System.out.println("The right number was " + randomNumber + "\n");
					System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
					playAgain();
				}
				System.out.println("You have " + i + " guesses left...\n");
			}
			
		} else if (diff == 2) {
			System.out.println("Medium difficulty\n");
			
			for (int i = 9; i >= 0; i--) {
				
				System.out.println("Guess a number between 0 and " + intervall + "!");
				userGuess = in.nextInt();
				if (userGuess < randomNumber) { 
					System.out.println("Your guess is too low!");
				} else if (userGuess > randomNumber) {
					System.out.println("Your guess is too high!");
				} else if (userGuess == randomNumber) {
					System.out.println("You guessed the right number!");
					playAgain();
					
				}
				
				if (i == 0) {
					System.out.println("The right number was " + randomNumber + "\n");
					System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
					playAgain();
					
				}
				System.out.println("You have " + i + " guesses left...\n");
				
			}
			
		} else if (diff == 3) {
			System.out.println("Hard difficulty\n");
			
			for (int i = 4; i >= 0; i--) {
				
				System.out.println("Guess a number between 0 and " + intervall + "!");
				userGuess = in.nextInt();
				if (userGuess < randomNumber) { 
					System.out.println("Your guess is too low!");
				} else if (userGuess > randomNumber) {
					System.out.println("Your guess is too high!");
				} else if (userGuess == randomNumber) {
					System.out.println("You guessed the right number!");
					playAgain();
					
				}
				
				if (i == 0) {
					System.out.println("The right number was " + randomNumber + "\n");
					System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
					playAgain();
					}
				System.out.println("You have " + i + " guesses left...\n");
			}
			
		}
		 
			
	
	
} public static void playAgain() {
	
	boolean success = false;
	int playAgain;
	
	Scanner in = new Scanner(System.in);
	
	
	
	while (!success) {
		
		
		try {
		System.out.println("-- Press '1' play again, press '2' to go back to main menu, or press '0' to exit game --");
		
		playAgain = in.nextInt();
		success = true;
		
		if (playAgain < 0 || playAgain > 2) {
			System.out.println("** You did not enter one of the given numbers. Try again. **");
			success = false;
		}
		
		
		if (playAgain == 0) {
			System.out.println("Game is closed.");
			System.exit(0);
		} else if (playAgain == 1) {
			game();
		} else if (playAgain == 2) {
			run();
		}
		}
		catch (Exception e) {
			in.next();
			System.out.println("** You did not enter a integer. Try again. **");
			
			
		}
		}
	
		
	in.close();


} 
/**
 * @param
 */

public static void pressZero() {
		boolean success = false;
		int goBack;
		
		Scanner in = new Scanner(System.in);
		
		
		
		while (!success) {
			
			
			try {
			System.out.println("-- Press '0' to go back to main menu --");
			
			goBack = in.nextInt();
			success = true;
			
			if (goBack < 0 || goBack > 0) {
				System.out.println("** You did not enter the number '0'. Try again. **");
				success = false;
			}
			
			
			if (goBack == 0) {
				run(); 
			}
			} catch (Exception e) {
				in.next();
				System.out.println("** You did not enter a integer. Try again. **");
				
				
			}
			}
			in.close(); 


}
}