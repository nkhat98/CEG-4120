package Scrabble;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Tile {

	Icon icon;
	String letter;
	int value;
	
	void createTile(int letterInAlpha){
		switch (letterInAlpha){
		case 1:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "A";
			value = 1;
			break;
			
		case 2:
			icon = new ImageIcon("");
			letter = "B";
			value = 3;
			break;
		
		case 3:
			icon = new ImageIcon("");
			letter = "C";
			value = 3;
			break;
			
		case 4:
			icon = new ImageIcon("");
			letter = "D";
			value = 2;
			break;
			
		case 5:
			icon = new ImageIcon("");
			letter = "E";
			value = 1;
			break;
			
		case 6:
			icon = new ImageIcon("");
			letter = "F";
			value = 4;
			break;
			
			
		case 7:
			icon = new ImageIcon("");
			letter = "G";
			value = 2;
			break;
			
		case 8:
			icon = new ImageIcon("");
			letter = "H";
			value = 4;
			break;
		
		case 9:
			icon = new ImageIcon("");
			letter = "I";
			value = 1;
			break;
			
		case 10:
			icon = new ImageIcon("");
			letter = "J";
			value = 8;
			break;
			
		case 11:
			icon = new ImageIcon("");
			letter = "K";
			value = 5;
			break;
			
		case 12:
			icon = new ImageIcon("");
			letter = "L";
			value = 1;
			break;
			
		case 13:
			icon = new ImageIcon("");
			letter = "M";
			value = 3;
			break;
			
		case 14:
			icon = new ImageIcon("");
			letter = "N";
			value = 1;
			break;
		
		case 15:
			icon = new ImageIcon("");
			letter = "O";
			value = 1;
			break;
			
		case 16:
			icon = new ImageIcon("");
			letter = "P";
			value = 3;
			break;
			
		case 17:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "Q";
			value = 10;
			break;
			
		case 18:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "R";
			value = 1;
			break;
			
		case 19:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "S";
			value = 1;
			break;
			
		case 20:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "T";
			value = 1;
			break;
			
		case 21:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "U";
			value = 1;
			break;
			
		case 22:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "V";
			value = 4;
			break;
			
		case 23:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "W";
			value = 4;
			break;
		
		case 24:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "X";
			value = 8;
			break;
			
		case 25:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "Y";
			value = 4;
			break;
			
		case 26:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "Z";
			value = 10;
			break;
			
		case 27:
			icon = new ImageIcon("Scrabble-tile-A-wood.png");
			letter = "";
			value = 1;
			break;
			
		default:
			break;
			
		}
			
		
		

	}
}
