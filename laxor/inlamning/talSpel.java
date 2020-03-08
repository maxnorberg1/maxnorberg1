package inlamning;

import java.util.Scanner;

public class talSpel {

	public static void main(String[] args) {

		do {
			run();
		} while (true);
	}

	/**
	 * Metod som inneh�ller spelets meny och som kallar p� metoden game().
	 * Inneh�ller en trycatch f�r att spelet inte ska krascha vid felaktig input.
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
					System.out.println("(4) Exit Game");
					System.out.println();

					firstChoice = in.nextInt();

					success = true;

					if (firstChoice < 1 || firstChoice > 4) { // Kontrollerar att spelarens input �r inom intervallet
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
						System.out.println("(1) Choose an interval");
						System.out.println("(2) Select difficulty. Harder difficulty means fewer attempts.\n");

						System.out.println("\tEasy Difficulty: 15 Attempts");
						System.out.println("\tMedium Difficulty: 10 Attempts");
						System.out.println("\tHard Difficulty: 5 Attempts\n");

						System.out.println("(3) Now the fun begins! Guess away!");
						System.out.println(
								"(4) You will be notified if your guess is too high, too low, or just right! Try to guess the right number before you run out of attempts.");
						System.out.println("(5) After playing, you will be asked if you want to play again.\n");
						pressZero();
						break;

					case 3:

						System.out.println("CREDITS\n");
						System.out.println("Creator: Max Norberg\n");
						pressZero();
						break;

					case 4:

						System.out.println("EXIT\n");
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
							} catch (Exception e) {
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

				} catch (Exception e) {
					in.next();
					System.out.println("** You did not enter a integer. Try again. **");

				}
			}
		}

	}

	/**
	 * Metod som inneh�ller spelet.
	 */
	public static void game() {
		Scanner in = new Scanner(System.in);

		int intervall;
		int diff;
		double randomNumber;
		int userGuess;

		System.out.println("GAME STARTING...\n");
		System.out.println("Choose the highest number in the interval\n"); // L�ter spelaren v�lja det h�gsta talet i
																			// intervallet och sparar det i variabeln
																			// intervall.
		intervall = in.nextInt();

		randomNumber = (int) (Math.random() * ((intervall - 0) + 1)); // Genererar ett random tal inom det valda
																		// intervallet och sparar det i variabeln
																		// randomNumber.
		System.out.println("\n");

		System.out.println("Choose a difficulty\n");
		System.out.println("Press '1' for Easy difficulty, '2' for Medium difficulty and '3' for Hard difficulty");

		do { // L�ter spelaren v�lja sv�rhetsgrad, och kontrollerar att inputen �r inom de
				// givna siffrorna.
			diff = in.nextInt();
			if (diff > 3 || diff < 0) {
				System.out.println("** You did not enter a integer. Try again. **");

			}

		} while (diff > 3 || diff < 0);

		if (diff == 1) { // Spelet p� l�ttaste niv�n, 15 gissningar.
			System.out.println("Easy difficulty\n");
			for (int i = 14; i >= 0; i--) { // L�ter spelaren gissa tills han/hon gissar r�tt eller f�r slut p�
											// gissningar.

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

				if (i == 0) { // Skriver ut ett meddelande till spelaren d� han/hon har f�tt slut p�
								// gissningar.
					System.out.println("The right number was " + randomNumber + "\n");
					System.out.println("You ran out of attempts, too bad! Do you want to play again?\n");
					playAgain();
				}
				System.out.println("You have " + i + " guesses left...\n");
			}

		} else if (diff == 2) { // Spelet p� niv� Medium, 10 gissningar.
			System.out.println("Medium difficulty\n");

			for (int i = 9; i >= 0; i--) { // L�ter spelaren gissa tills han/hon gissar r�tt eller f�r slut p�
											// gissningar.

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

		} else if (diff == 3) { // Spelet p� den sv�raste niv�n, 5 gissningar.
			System.out.println("Hard difficulty\n");

			for (int i = 4; i >= 0; i--) { // L�ter spelaren gissa tills han/hon gissar r�tt eller f�r slut p�
											// gissningar.

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

	}

	/**
	 * Metod som anv�nds f�r att fr�ga spelaren om han/hon vill spela igen.
	 * Inneh�ller en trycatch f�r att spelet inte ska krascha vid felaktig input.
	 */
	public static void playAgain() {

		boolean success = false;
		int playAgain;

		Scanner in = new Scanner(System.in);

		while (!success) {

			try {
				System.out.println(
						"-- Press '1' play again, press '2' to go back to main menu, or press '0' to exit game --");

				playAgain = in.nextInt();
				success = true;

				if (playAgain < 0 || playAgain > 2) {
					System.out.println("** You did not enter one of the given numbers. Try again. **");
					success = false;
				}

				if (playAgain == 0) { // Avg�r om spelet ska spelas igen / g� tillbaka till menyn / avsluta spelet.
					System.out.println("Game is closed.");
					System.exit(0);
				} else if (playAgain == 1) {
					game();
				} else if (playAgain == 2) {
					run();
				}
			} catch (Exception e) {
				in.next();
				System.out.println("** You did not enter a integer. Try again. **");

			}
		}

		in.close();

	}

	/**
	 * Metod som anv�nds d� anv�ndaren ska g� tillbaka till menyn. Inneh�ller en try
	 * catch f�r att spelet inte ska krascha vid felaktig input.
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