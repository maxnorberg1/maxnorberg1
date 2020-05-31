package inlamning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hangaGubben {

	static ArrayList<String> wordList = new ArrayList<>();

	public static void main(String[] args) {

		do {
			run();
		} while (true);
	}

	/**
	 * Metod som innehåller spelets meny.
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

						singleplayerOrMultiplayer();


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
						System.out.println("\t(8) At the end, you can choose to exit the game OR play again.\n");

						pressZero();
						break;

					case 3:

						System.out.println("CREDITS\n");
						System.out.println("Creator: Max Norberg\n");

						pressZero();
						break;

					case 4:

						System.out.println("WORDLIST\n");
						System.out.println("Here you can add words to the wordlist!\n");
						System.out.println("Write a word below and it will be added");

						updateTxt();
						pressZero();
						break;

					case 5:

						System.out.println("Do you want to exit the game? \n-- Press '1' to exit game, press '0' to go back to main menu --");
						int endGame = in.nextInt();
						

						if (endGame == 1) {
							System.out.println("Game over.");
							System.exit(0);
						}

						
						break;

					}

				} catch (Exception e) {
					in.next();
					System.out.println("** You did not enter a integer. Try again. **");

				}
			}
		}
	}
	/**
	 * Avgör om spelet ska spelas av 1 eller 2 spelare
	 */
	private static void singleplayerOrMultiplayer() {
		Scanner in = new Scanner(System.in);

		System.out.println("(1) Singleplayer");
		System.out.println("(2) Multiplayer\n");
		
		int singleOrMultiChoice = in.nextInt();
		int gameMode;

		switch (singleOrMultiChoice) {
		case 1:
			System.out.println("SINGLEPLAYER\n");
			gameMode = 1;
			game(gameMode);

			break;

		case 2:
			System.out.println("MULTIPLAYER\n");
			System.out.println("Player 1: Write a word!");
			System.out.println("Player 2: *** DONT LOOK ***");
			System.out.println();
			System.out.println();
			
			gameMode = 2;
			game(gameMode);
			break;
		}

	}
	/**
	 * 
	 * @return genererar ett slumpmässigt valt ord från ordlistan
	 */

	public static String getRandomWord() {

		return wordList.get((int) (Math.random() * (wordList.size() - 1)) + 1);

	}
	/**
	 * Läser in en ordlista från en lokal textfil på datorn
	 */

	private static void getWordList() {
		try {
			FileReader file = new FileReader(new File("resources/hangManWords.txt"));
			Scanner reader = new Scanner(file);
			while (reader.hasNext())
				wordList.add(reader.nextLine().trim());

		} catch (FileNotFoundException fnfe) {
			System.out
					.println("File not found at C:\\Users\\Max\\Documents\\GitHub\\maxnorberg1\\resources‪ \n" + fnfe);

		}

	}
	/**
	 * 
	 * @param gameMode tar emot gameMode (singleplayer/multiplayer).
	 * Första if satsen tar input från gameMode och bestämmer om spelet ska 
	 * köras i singleplayer eller multiplayer.
	 */

	public static void game(int gameMode) {
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		

		char[] randomWord;
		
		if (gameMode == 2) {
			randomWord = in.nextLine().toCharArray();
			System.out.println("Player 2: Guess!");
		} else {
			
			randomWord = difficulty().toCharArray();
		}
		
		

		boolean gameOver = false;
		while (!gameOver) {

			

			int guessAmount = randomWord.length;
			char[] playerGuess = new char[guessAmount];

			for (int i = 0; i < playerGuess.length; i++) { // Skriver ut blanka sträck för bokstäver som ännu ej är gissade. 
				playerGuess[i] = '_';
			}

			boolean wordIsGuessed = false; 

			for (int tries = 7; tries > 0; tries--) { // Spelaren har 7 fel-gissningar. 

				hangTheMan(tries);

				System.out.printf("You have %d tries left.\n", tries);
				System.out.println();
				// System.out.println("Current guesses: " + tries + "\n");
				printArray(playerGuess);
				System.out.println();
				System.out.println("Enter a single character");
				char input = in.nextLine().toLowerCase().charAt(0); // Tar den första bokstaven från spelarens input och gör om den 
																	// till lower case, för att undvika buggar. 
				String wordString = new String(randomWord);
				String inputString = Character.toString(input);

				if (wordString.contains(inputString)) { // Om spelarens ordet innehåller bokstaven som spelaren skrev in, ändras inte antalet försök. 
					tries++;
				}

				if (input == '-') { // Ett enkelt sätt att avsluta omgången är att skriva '-'.
					gameOver = true;
					wordIsGuessed = true;
				} else {
					for (int u = 0; u < randomWord.length; u++) {
						if (randomWord[u] == input) {
							playerGuess[u] = input;

						}

					}

					if (isTheWordGuessed(playerGuess)) { // När spelaren har gissat ordet skrivs hela ordet ut och spelaren 
														 // får ett grattis-meddelande. 
						wordIsGuessed = true;
						System.out.println("THE WORD WAS:\n");
						printArray(playerGuess);
						System.out.println();
						System.out.println("Congratulations you won!\n");
						break;
					}
				}

			}
			if (!wordIsGuessed) { // Om spelaren får slut på gissningar hängs gubben och ordet skrivs ut. 
				System.out.println("You ran out of guesses!");
				System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " / \\  |\r\n"
						+ "      |\r\n" + "=========");
				System.out.println("THE WORD WAS:\n");
				System.out.println(randomWord);
				System.out.println();
			}

			try { // Låter spelaren bestämma om hen vill spela igen. 
				System.out.println("Do you want to play again? 'Yes' OR 'No'");
			
			String anotherGame = in.nextLine();

			if (anotherGame.toLowerCase().equals("no")) {
				gameOver = true;
				System.out.println("Game over.");
				System.exit(0);
			} else {
				singleplayerOrMultiplayer();
			}
			} catch (Exception e) {
				in.next();
				System.out.println("** You did not enter a integer. Try again. **");

			}
		}
		
	}
	/**
	 * Metod som låter spelaren välja svårhetsgrad och väljer ord därefter ord efter längd. 
	 * @return returnerar ett slumpmässigt genererat ord inom spelarens valda svårhetsgrad. 
	 */
	private static String difficulty() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("(1) Easy difficulty");
		System.out.println("(2) Medium difficulty");
		System.out.println("(3) Hard difficulty");
		
		int difficulty = in.nextInt(); 
		
		boolean acceptableWord = false;
		String tempWord = "";
		
		while (acceptableWord == false) {
			getWordList();
			tempWord = getRandomWord();
			
			if (difficulty == 1) {
				if (tempWord.length() < 4) {
					acceptableWord = true;
				}
			} else if (difficulty == 2) {
				if (tempWord.length() > 3 && tempWord.length() < 8) {
					acceptableWord = true;
				}
			} else if (difficulty == 3) {
				if (tempWord.length() > 7) {
					acceptableWord = true;
				}
			}
		}
		return tempWord;
	}

	/**
	 * 
	 * @param tries skriver ut en ASCII gubbe då antalet försök ändras (variabeln 'tries').
	 */
	private static void hangTheMan(int tries) {

		if (tries == 7) {
			System.out.println("=========");
		}

		if (tries == 6) {
			System.out.println("  +---+\r\n" + "  |   |\r\n" + "      |\r\n" + "      |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		}

		if (tries == 5) {
			System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "      |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		}

		if (tries == 4) {
			System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + "  |   |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		}

		if (tries == 3) {
			System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|   |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		}

		if (tries == 2) {
			System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + "      |\r\n"
					+ "      |\r\n" + "=========");
		}

		if (tries == 1) {
			System.out.println("  +---+\r\n" + "  |   |\r\n" + "  O   |\r\n" + " /|\\  |\r\n" + " /    |\r\n"
					+ "      |\r\n" + "=========");
		}

	}

	/**
	 * Metod som känner av om ordet är gissat. 
	 * @param array 
	 * @return om arrayen innehåller '_' är ordet inte gissat. Om arrayen inte innehåller
	 * '_' är ordet gissat. Metoden returnerar då värdet 'true' på booleanen. 
	 */
	public static boolean isTheWordGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;
	}

	/**
	 * Skriver ut arrayen med mellanrum mellan varje bokstav. 
	 * @param array
	 */
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

	}

	/**
	 * Metod som gör det möjligt att uppdatera en textfil med en String. 
	 * @param s
	 * @param f
	 * @throws IOException
	 */
	public static void write(String s, File f) throws IOException {
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s);
		bw.newLine();
		bw.close();

	}

	/**
	 * Läser in textfilen. 
	 * Låter användaren skriva in ett ord i ordlistan genom en scanner.
	 * Kallar på metoden write() för att uppdatera ordlistan. 
	 */
	public static void updateTxt() {
		Scanner in = new Scanner(System.in);
		try {
			File f = new File("resources/hangManWords.txt");
			String newWord = in.next();
			write(newWord, f);
			System.out.println("Thank you, the word '" + newWord + "' has been added to the wordlist!");
		} catch (IOException e) {

		}

	}

	/**
	 * Metod som används då användaren ska gå tillbaka i menyer genom att skriva siffran '0'.
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