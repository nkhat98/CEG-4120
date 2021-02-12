package Scrabble;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

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
	public static JFrame frame = new JFrame("Scrabble");
	public static JPanel container = new JPanel();
	public static JPanel container2 = new JPanel();
	public static JPanel player1 = new JPanel();
	public static JPanel player2 = new JPanel();
	public static JPanel settings = new JPanel();
	public static JPanel board = new JPanel();
	public static JButton[][] gameboardtile = new JButton[15][15];
	public static JButton[] TileRackPlayer1 = new JButton[7];
	public static JButton[] TileRackPlayer2 = new JButton[7];
	public static JButton[] settingButtons = new JButton[7];
	public static String[] dictionary;
	public static TileBag tilebag = new TileBag();
	public static Scanner sc = new Scanner(System.in);
	
	// function to initialize game board and player areas
	public static String getName(int i) {
		String name;
		if (i == 1) {
			System.out.print("What is Player 1's name? ");
			name = sc.nextLine();
		} else {
			System.out.print("What is Player 2's name? ");
			name = sc.nextLine();
		}
		
		return name;
	}

	public static void setDimensions() {
		container.setLayout(new BoxLayout(container, BoxLayout.X_AXIS));
		container2.setLayout(new BoxLayout(container2, BoxLayout.Y_AXIS));
		board.setPreferredSize(new Dimension(400, 400));
		board.setLayout(new GridLayout(15, 15));
		player1.setPreferredSize(new Dimension(400, 400));
		player2.setPreferredSize(new Dimension(400, 400));
	}

	public static void addLabels() {
		player1.add(new JLabel(getName(1)));
		player1.setBorder(blackline);
		player2.add(new JLabel(getName(2)));
		player2.setBorder(blackline);
		settings.add(new JLabel("Select an option below"));
		settings.setBorder(settingline);
	}

	public static void addButtons() {

		// Add Gameboard tile buttons
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 15; j++) {
				gameboardtile[i][j] = new JButton("");
				if (i == 7 && j == 7) {
					board.add(gameboardtile[i][j]);
				} else {
					gameboardtile[i][j].setEnabled(false);
					board.add(gameboardtile[i][j]);

				}

			}
		}

		tilebag.createTileBag();
		tilebag.shuffle();

		Random rand = new Random();
		int upBound = 100;

		for (int i = 0; i < 7; i++) {
			int number = rand.nextInt(upBound);
			Tile tile = tilebag.pop(number);
			TileRackPlayer1[i] = new JButton(tile.icon);
			TileRackPlayer1[i].setPreferredSize(new Dimension(50, 50));
			player1.add(TileRackPlayer1[i]);
			--upBound;
		}

		for (int i = 0; i < 7; i++) {
			int number = rand.nextInt(upBound);
			Tile tile = tilebag.pop(number);
			TileRackPlayer2[i] = new JButton(tile.icon);
			TileRackPlayer2[i].setPreferredSize(new Dimension(50, 50));
			player2.add(TileRackPlayer2[i]);
			--upBound;
		}

		settingButtons[0] = new JButton("Done With Turn");
		settingButtons[1] = new JButton("Swap a Tile");
		settingButtons[2] = new JButton("Swap all Tiles");
		settingButtons[3] = new JButton("Quit");

		for (int i = 0; i < 4; i++) {
			settings.add(settingButtons[i]);
		}

	}

	public static void game() {
	}

	
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
		for(int i = 0; i < 10; i++){
			System.out.println(dictionary[i]);
		}

		sc.close();
		
		
	}


	
	
}
