package Scrabble;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class scrabble extends Tile {

	// Elements to game board
	public static Border blackline = BorderFactory.createTitledBorder("Player:");
	public static Border settingline = BorderFactory.createTitledBorder("Settings:");

	// The entire panel that opens up
	public static JFrame frame = new JFrame("Scrabble");

	// Container for the game board
	public static JPanel container = new JPanel();

	// Container for the player tile racks and settings buttons
	public static JPanel container2 = new JPanel();
	public static JPanel player1 = new JPanel();
	public static JPanel player2 = new JPanel();
	public static JPanel settings = new JPanel();

	// the game board
	public static JPanel board = new JPanel();

	// Array of buttons where the tiles can be placed
	public static JButton[][] gameboardtile = new JButton[16][16];

	// Player Tile Racks GUI end
	public static JLabel[] TileRackPlayer1 = new JLabel[7];
	public static JLabel[] TileRackPlayer2 = new JLabel[7];

	// Player Tile Racks command line end
	public static Tile[] tilerack1 = new Tile[7];
	public static Tile[] tilerack2 = new Tile[7];

	// Setting buttons
	public static JButton[] settingButtons = new JButton[7];

	// Dictionary used to check all Scrabble words
	public static String[] dictionary;

	// Tile bag that holds all of the letters in the game
	public static TileBag tilebag = new TileBag();

	// Scanner for user input
	public static Scanner sc = new Scanner(System.in);

	// Global variables that need to be seen everywhere
	public static String player1Name = "";
	public static String player2Name = "";
	public static int upBound = 100;

	// Whose turn it is
	public static int firstplayer = 0;

	// Total scores for player 1 and player 2
	public static int player1TotalScore = 0;
	public static int player2TotalScore = 0;

	// Function to get the names of the two players
	public static void getName(int i) {
		if (i == 1) {
			System.out.print("What is Player 1's name? ");
			player1Name = sc.nextLine();
		} else {
			System.out.print("What is Player 2's name? ");
			player2Name = sc.nextLine();
		}
	}

	// Sets the dimensions of the board and containers
	public static void setDimensions() {
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		container2.setLayout(new BoxLayout(container2, BoxLayout.Y_AXIS));
		board.setPreferredSize(new Dimension(800, 800));
		board.setLayout(new GridLayout(16, 16));
		player1.setPreferredSize(new Dimension(50, 100));
		player2.setPreferredSize(new Dimension(50, 100));
	}

	// Adds labels
	public static void addLabels() {
		getName(1);
		getName(2);
		player1.add(new JLabel(player1Name));
		player1.setBorder(blackline);
		player2.add(new JLabel(player2Name));
		player2.setBorder(blackline);
		settings.add(new JLabel("Select an option below"));
		settings.setBorder(settingline);
	}

	// Add the buttons to the game board also set the column and row index
	// values along board
	public static void addButtons() {
		// Add Game board tile buttons
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 16; j++) {
				gameboardtile[i][j] = new JButton();
				gameboardtile[i][j].setTransferHandler(new TransferHandler("icon"));
				gameboardtile[i][j].setPreferredSize(new Dimension(50, 50));
				if (i == 8 && j == 8) {
					board.add(gameboardtile[i][j]);
				} else {
					gameboardtile[i][j].setEnabled(true);
					board.add(gameboardtile[i][j]);
				}
			}
		}

		gameboardtile[0][0].setEnabled(false);
		for (int i = 1; i < 16; i++) {
			switch (i) {
			case 1:
				gameboardtile[0][i].setText("1");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("1");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 2:
				gameboardtile[0][i].setText("2");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("2");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 3:
				gameboardtile[0][i].setText("3");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("3");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 4:
				gameboardtile[0][i].setText("4");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("4");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 5:
				gameboardtile[0][i].setText("5");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("5");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 6:
				gameboardtile[0][i].setText("6");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("6");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 7:
				gameboardtile[0][i].setText("7");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("7");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 8:
				gameboardtile[0][i].setText("8");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("8");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 9:
				gameboardtile[0][i].setText("9");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("9");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 10:
				gameboardtile[0][i].setText("10");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("10");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 11:
				gameboardtile[0][i].setText("11");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("11");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 12:
				gameboardtile[0][i].setText("12");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("12");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 13:
				gameboardtile[0][i].setText("13");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("13");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 14:
				gameboardtile[0][i].setText("14");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("14");
				gameboardtile[i][0].setEnabled(false);
				break;
			case 15:
				gameboardtile[0][i].setText("15");
				gameboardtile[0][i].setEnabled(false);

				gameboardtile[i][0].setText("15");
				gameboardtile[i][0].setEnabled(false);
				break;
			}
		}

		tilebag.createTileBag();
		tilebag.shuffle();

		Random rand = new Random();

		// Adds beginning of the game tiles to player 1 tile rack
		for (int i = 0; i < 7; i++) {
			int number = rand.nextInt(upBound);
			Tile tile = tilebag.pop(number);
			TileRackPlayer1[i] = new JLabel(tile.icon);
			tilerack1[i] = tile;
			TileRackPlayer1[i].setPreferredSize(new Dimension(50, 50));
			player1.add(TileRackPlayer1[i]);
			--upBound;
		}

		// Adds beginning of the game tiles to player 2 tile rack
		for (int i = 0; i < 7; i++) {
			int number = rand.nextInt(upBound);
			Tile tile = tilebag.pop(number);
			TileRackPlayer2[i] = new JLabel(tile.icon);
			tilerack2[i] = tile;
			TileRackPlayer2[i].setPreferredSize(new Dimension(50, 50));
			player2.add(TileRackPlayer2[i]);
			--upBound;
		}

		settingButtons[0] = new JButton("Done With Turn");
		settingButtons[1] = new JButton("Swap a Tile");
		settingButtons[2] = new JButton("Swap all Tiles");
		settingButtons[3] = new JButton("Quit");

		// Quit button closes to the GUI
		settingButtons[3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});

		for (int i = 0; i < 4; i++) {
			settings.add(settingButtons[i]);
		}
	}

	// Adds the tile score bonus properties
	public static void setGameBoardBonus() {
		Icon tripleWord = new ImageIcon("board_score_multipliers/Triple_Word.png");
		gameboardtile[1][1].setIcon(tripleWord);
		gameboardtile[8][1].setIcon(tripleWord);
		gameboardtile[15][1].setIcon(tripleWord);
		gameboardtile[1][8].setIcon(tripleWord);
		gameboardtile[8][15].setIcon(tripleWord);
		gameboardtile[1][15].setIcon(tripleWord);
		gameboardtile[15][15].setIcon(tripleWord);
		gameboardtile[15][8].setIcon(tripleWord);

		Icon doubleWord = new ImageIcon("board_score_multipliers/Double_Word.png");
		gameboardtile[2][2].setIcon(doubleWord);
		gameboardtile[3][3].setIcon(doubleWord);
		gameboardtile[4][4].setIcon(doubleWord);
		gameboardtile[5][5].setIcon(doubleWord);
		gameboardtile[11][11].setIcon(doubleWord);
		gameboardtile[12][12].setIcon(doubleWord);
		gameboardtile[13][13].setIcon(doubleWord);
		gameboardtile[14][14].setIcon(doubleWord);
		gameboardtile[14][2].setIcon(doubleWord);
		gameboardtile[13][3].setIcon(doubleWord);
		gameboardtile[12][4].setIcon(doubleWord);
		gameboardtile[11][5].setIcon(doubleWord);
		gameboardtile[5][11].setIcon(doubleWord);
		gameboardtile[4][12].setIcon(doubleWord);
		gameboardtile[3][13].setIcon(doubleWord);
		gameboardtile[2][14].setIcon(doubleWord);

		Icon doubleLetter = new ImageIcon("board_score_multipliers/Double_Letter.png");
		gameboardtile[4][1].setIcon(doubleLetter);
		gameboardtile[12][1].setIcon(doubleLetter);
		gameboardtile[1][4].setIcon(doubleLetter);
		gameboardtile[1][12].setIcon(doubleLetter);
		gameboardtile[4][15].setIcon(doubleLetter);
		gameboardtile[12][15].setIcon(doubleLetter);
		gameboardtile[15][4].setIcon(doubleLetter);
		gameboardtile[15][12].setIcon(doubleLetter);

		Icon center = new ImageIcon("board_score_multipliers/Center.png");
		gameboardtile[8][8].setIcon(center);

		Icon tripleLetter = new ImageIcon("board_score_multiplers/Triple_Letter");
		gameboardtile[6][2].setIcon(tripleLetter);
		gameboardtile[10][2].setIcon(tripleLetter);
		gameboardtile[2][6].setIcon(tripleLetter);
		gameboardtile[10][6].setIcon(tripleLetter);

	}

	// Function to add new tiles to the rack after a successful word has been
	// played.
	public static void addTilesToRack() {
		Random rand = new Random();
		for (int i = 0; i < 7; i++) {
			if (TileRackPlayer1[i].isEnabled() == false && firstplayer == 1) {
				int number = rand.nextInt(upBound);
				Tile newtile = tilebag.pop(number);
				--upBound;
				tilerack1[i] = newtile;
				TileRackPlayer1[i].setIcon(newtile.icon);
				TileRackPlayer1[i].setEnabled(true);
			} else if (TileRackPlayer2[i].isEnabled() == false && firstplayer == 2) {
				int number = rand.nextInt(upBound);
				Tile newtile = tilebag.pop(number);
				--upBound;
				tilerack2[i] = newtile;
				TileRackPlayer2[i].setIcon(newtile.icon);
				TileRackPlayer2[i].setEnabled(true);
			}
		}
	}

	// Disables the opposing players tile rack
	public static void enableDisableRack() {
		for (int i = 0; i < 7; i++) {
			if (firstplayer == 2) {
				TileRackPlayer2[i].setEnabled(false);
				TileRackPlayer1[i].setEnabled(true);
			} else {
				TileRackPlayer1[i].setEnabled(false);
				TileRackPlayer2[i].setEnabled(true);
			}
		}
	}

	// Switches from player 1 to player 2
	public static void switchPlayer() {
		if (firstplayer == 1) {
			firstplayer = 2;
		} else {
			firstplayer = 1;
		}
	}

	// This is the function that calls the main game loop
	public static void game() {
		// ADD A terminating condition for the last letter
		boolean gameOver = false;
		boolean validFirstPlacement = false;
		String wordPlayed = "";
		int score = 0;
		int row = 0;
		int column = 0;

		// main game loop
		while (!gameOver) {
			boolean isInRack = false;
			Tile tempTile = new Tile();
			boolean newTileToBePlaced = false;

			// print to say whose turn it is
			if (firstplayer == 1) {
				System.out.printf("%s's turn!\n", player1Name);
			} else {
				System.out.printf("%s's turn!\n", player2Name);

			}

			// Gets the column and row of a tile to be place. Must be numbers.
			while (!newTileToBePlaced) {
				System.out.println("---------------------------------------------------");
				System.out.print("What column would you like to place the letter?: ");
				// Verify Column is a number
				while (true) {
					try {
						column = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.print(
								"You did not eneter a number. What column would you like to place the letter?: ");
						String extraLine = sc.nextLine();
					}
				}
				// Verify Row is a number
				System.out.print("What row would you like to place the letter?: ");
				while (true) {
					try {
						row = sc.nextInt();
						break;
					} catch (Exception e) {
						System.out.print("You did not eneter a number. What row would you like to place the letter?: ");
						String extraLine = sc.nextLine();
					}
				}

				// Check to make sure it is (8,8) if first letter
				while (!validFirstPlacement) {
					if (column == 8 && row == 8) {
						validFirstPlacement = true;
					} else {
						System.out.println("The first letter must be placed at the center of the board.");
						System.out.print("What column would you like to place the letter?: ");
						column = sc.nextInt();
						System.out.print("What row would you like to place the letter?: ");
						row = sc.nextInt();
					}
				}

				// Will account for a user adding letters to an existing word
				// NEED TO ADD IMPLEMENTATION IF THE LETTER IS THE END OF THE
				// WORD------------------
				if (gameboardtile[row][column].isEnabled() == false) {
					System.out.println(
							"There is a letter already here, would you like to add letters to form a new word? ");
					JButton tempButton = gameboardtile[row][column];
					wordPlayed += tempButton.getText();
					Tile temp2 = new Tile();
					score += temp2.getTileValue(tempButton.getText());
				} else {
					newTileToBePlaced = true;
				}
			}

			// eats the extra newline character
			String newline = sc.nextLine();

			// Checks to make sure tile is in rack
			while (!isInRack) {
				System.out.print("Please select a letter from your tile rack? ");
				String letter = sc.nextLine();
				for (int i = 0; i < 7; i++) {
					if ((tilerack1[i].letter).compareToIgnoreCase(letter) == 0 && firstplayer == 1) {
						tempTile = tilerack1[i];
						isInRack = true;
						TileRackPlayer1[i].setEnabled(false);
						score += tempTile.value;
						wordPlayed += tempTile.letter;
						break;
					}
					if ((tilerack2[i].letter).compareToIgnoreCase(letter) == 0 && firstplayer == 2) {
						tempTile = tilerack2[i];
						isInRack = true;
						TileRackPlayer2[i].setEnabled(false);
						score += tempTile.value;
						wordPlayed += tempTile.letter;
						break;
					}
				}
				if (isInRack != true) {
					System.out.println("The letter you selected is not in your tile rack.");

				}
			}

			// Add letter to the game board and disables the button to show it
			// can not be moved
			if (validFirstPlacement == true) {
				gameboardtile[row][column].setIcon(tempTile.icon);
				gameboardtile[row][column].setText(tempTile.letter);
				gameboardtile[row][column].setEnabled(false);
			}

			// Check to make sure you are done with the word, if done, create
			// word from the letters, compute score
			// ---------------THIS IS WHERE THE DICTIONARY CHECK FUNCTION WOULD
			// BE CALLED-------------------
			System.out.print("Are you done with you word? (y/n): ");
			String doneWithWord = sc.nextLine();
			if (doneWithWord.compareToIgnoreCase("y") == 0) {
				System.out.printf("%s played the word %s for %d points!\n", player1Name, wordPlayed, score);
				wordPlayed = "";
				if (firstplayer == 1) {
					player1TotalScore += score;
				} else {
					player2TotalScore += score;
				}
				score = 0;

				// Put Tiles back into the tile rack
				addTilesToRack();
				enableDisableRack();
				switchPlayer();
				if (firstplayer == 1) {
					System.out.printf("%s's Total Score: %d\n", player1Name, player1TotalScore);
				} else {
					System.out.printf("%s's Total Score: %d\n", player2Name, player2TotalScore);
				}

			}
		}
	}

	// This checks to see who goes first
	public static int whoGoesFirst() {

		//If the player selects yes then a tile will be drawn for each, whoever gets the highest value will go first.
		//If the player selects no then player 1 will automatically go first
		boolean isValidInput = false;
		while (!isValidInput) {
			System.out.print("Would you like to draw a tile (y/n)? ");
			String input = sc.nextLine();
			if (input.compareTo("N") == 0 || input.compareTo("n") == 0) {
				System.out.println("\nYou have choosen no, player 1 will automatically go first.");
				System.out.printf("%s goes first and %s goes second!\n", player1Name, player2Name);
				isValidInput = true;
				firstplayer = 1;
			} else if (input.compareTo("Y") == 0 || input.compareTo("y") == 0) {
				Random rand = new Random();
				int number = rand.nextInt(upBound);
				Tile tile1 = tilebag.pop(number);
				--upBound;
				System.out.printf("You tile is: %s\n", tile1.letter);
				int number2 = rand.nextInt(upBound);
				Tile tile2 = tilebag.pop(number2);
				--upBound;
				System.out.printf("The other player's tile is: %s\n", tile2.letter);

				if (tile1.alphaValue <= tile2.alphaValue) {
					System.out.printf("%s goes first and %s goes second!\n", player1Name, player2Name);
					tilebag.addTile(number);
					tilebag.addTile(number2);
					upBound += 2;
					firstplayer = 1;
				} else if (tile1.alphaValue == 27) {
					System.out.printf("%s goes first and %s goes second!\n", player1Name, player2Name);
					tilebag.addTile(number);
					tilebag.addTile(number2);
					upBound += 2;
					firstplayer = 1;
				} else if (tile2.alphaValue == 27) {
					System.out.printf("%s goes first and %s goes second!\n", player2Name, player1Name);
					tilebag.addTile(number);
					tilebag.addTile(number2);
					upBound += 2;
					firstplayer = 2;
				} else {
					System.out.printf("%s goes first and %s goes second!\n", player2Name, player1Name);
					tilebag.addTile(number);
					tilebag.addTile(number2);
					upBound += 2;
					firstplayer = 2;
				}
				isValidInput = true;
			} else {
				System.out.println("You have not entered the correct input. Please enter again.");
			}
		}
		return firstplayer;
	}

	// This reads in a dictionary to check the word
	public static void readInDictionary() {

		File file = new File("dictionary.txt");
		String line = "";

		try {
			FileReader filereader2 = new FileReader(file);
			BufferedReader br2 = new BufferedReader(filereader2);

			dictionary = new String[267753];
			line = br2.readLine();
			int position = 0;
			while (line != null) {
				dictionary[position] = line;
				line = br2.readLine();
				position++;
			}

			br2.close();
		} catch (FileNotFoundException e) {
			System.out.print("File not found");
		} catch (IOException e) {
			System.out.print("Error");
		}
	}

	// main function
	public static void main(String args[]) {
		setDimensions();
		addLabels();
		addButtons();
		setGameBoardBonus();
		// if 1 player 1, if 2 player 2
		int playsFirst = whoGoesFirst();
		if (playsFirst == 1) {
			for (int i = 0; i < 7; i++) {
				TileRackPlayer2[i].setEnabled(false);
			}
		} else {
			for (int i = 0; i < 7; i++) {
				TileRackPlayer1[i].setEnabled(false);
			}
		}

		// add everything to proper container
		container2.add(player1);
		container2.add(settings);
		container2.add(player2);
		container.add(board);
		container.add(container2);

		// add panels to frame
		frame.getContentPane().add(container, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

		// begin Scrabble Game

		readInDictionary();

		game();

		sc.close();

	}

}

// Peusdo code for the check word with dictionary function

// public static boolean checkWord(String wordCreated){
// test wordCreated with dictionary[]
// for(aasdasdksad)
// return true or false
// }