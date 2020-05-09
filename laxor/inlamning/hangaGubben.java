package inlamning;

import java.util.Random;
import java.util.Scanner;

public class hangaGubben {

	public static void main(String[] args) {

		do {
			run();
		} while (true);
	}

	/**
	 * Metod som innehåller spelets meny och som kallar på metoden game().
	 * Innehåller en trycatch för att spelet inte ska krascha vid felaktig input.
	 */
	public static void run() {
		boolean repeat = false;

		while (!repeat) {
			Scanner in = new Scanner(System.in);
			int firstChoice;
			int again;

			boolean success = false;

			while (!success) {

				try {
					System.out.println("Welcome to my game! Please choose one of the alternatives below\n"); // Meny
					System.out.println("(1) Start Game");
					System.out.println("(2) Game Instructions");
					System.out.println("(3) Credit Screen");
					System.out.println("(4) Wordlist");
					System.out.println("(5) Exit Game");
					System.out.println();

					firstChoice = in.nextInt();

					success = true;

					if (firstChoice < 1 || firstChoice > 5) { // Kontrollerar att spelarens input är inom intervallet
																// 1-4.
						System.out.println("** You did not enter one of the given numbers. Try again. **");
						success = false;
					}

					switch (firstChoice) {
					case 1:

						game();

						break;

					case 2:

						System.out.println("INSTRUCTIONS\n");
						System.out.println("(1) Choose SINGLEPLAYER or MULTIPLAYER\n");
						System.out.println("SINGERPLAYER\n");
						System.out.println("\t(2) Choose difficulty\n");

						System.out.println("\tEasy Difficulty: Word with 2-4 letters");
						System.out.println("\tMedium Difficulty: Word with 4-6 letters");
						System.out.println("\tHard Difficulty: Word with 6-10 letters\n");

						System.out.println("MULTIPLAYER\n");
						System.out.println("\t(2) PLAYER 1 chooses a word, and PLAYER 2 guesses!\n");

						System.out.println("\t(3) The game starts. . .");

						System.out.println("\t(4) Guess a letter in the alphabet.");
						System.out.println("\t(5) For every wrong letter, a man will be painted.");
						System.out.println(
								"\t(6) If you don't guess the word before the painted man is complete, he will be hanged and you will lose!");
						System.out.println("\t(7) If you guess the word, you win!");
						System.out.println("\t(8) At the end, you can choose to exit the game OR play again.");

						break;

					case 3:

						System.out.println("CREDITS\n");
						System.out.println("Creator: Max Norberg\n");

						break;

					case 4:

						System.out.println("WORDLIST\n");
						System.out.println("Here you can add words to the wordlist!\n");
						System.out.println("Write a word below and it will be added");
						String[] firstArray = new String[100];

						for (int i = 0; i < 100; i++) {
							firstArray[i] = in.nextLine();
						}

					}
				} catch (Exception e) {
					in.next();
					System.out.println("** You did not enter a integer. Try again. **");

				}
			}
		}
	}

	public static void game() {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		String[] guessWords = { "reddit", "programming", "fruit", "donut" };

		boolean gameOver = false;
		while (!gameOver) { 
			
			
			char[] randomWord = guessWords[random.nextInt(guessWords.length)].toCharArray();
			int guessAmount = randomWord.length;
			char[] playerGuess = new char[guessAmount];

			for (int i = 0; i < playerGuess.length; i++) {
				playerGuess[i] = '_';
			}

			boolean wordIsGuessed = false;
			

			for (int tries = 15; tries > 0; tries--) {
				
				System.out.printf("You have %d tries left.\n", tries);
				System.out.println();
				// System.out.println("Current guesses: " + tries + "\n");
				printArray(playerGuess);
				System.out.println();
				System.out.println("Enter a single character");
				char input = in.nextLine().charAt(0);
				String wordString = new String(randomWord);
				String inputString = Character.toString(input); 
				
				
				
				
				
				if (wordString.contains(inputString)) {
					tries++;
				} 
				
				
				
				
				if (input == '-') {
					gameOver = true;
					wordIsGuessed = true;
				} else {
					for (int u = 0; u < randomWord.length; u++) {
						if (randomWord[u] == input) {
							playerGuess[u] = input;
							
							
						}
						
						
					}
					
					
					
					
					
					if (isTheWordGuessed(playerGuess)) {
						wordIsGuessed = true;
						System.out.println("THE WORD WAS:");
						printArray(playerGuess);
						System.out.println("Congratulations you won!");
						break;
					}
				}
				
				
			}
			if (!wordIsGuessed)
				System.out.println("You ran out of guesses!");
			System.out.println("Do you want to play again? 'Yes' OR 'No'");
			String anotherGame = in.nextLine();
			
			if (anotherGame.equals("No"))
				gameOver = true;
		}
		System.out.println("Game over.");
		System.exit(0);
	}

	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false; 
		}
		return true; 
	}

	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}
}