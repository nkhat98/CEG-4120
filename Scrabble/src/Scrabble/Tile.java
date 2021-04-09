package Scrabble;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Tile {

	Icon icon;
	String letter;
	int value;
	int alphaValue;
	JButton button;

	void createTile(int numberInAlpha) throws IOException {
		switch (numberInAlpha) {
		case 1:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-A-wood.png")));
			letter = "A";
			value = 1;
			alphaValue = 1;
			break;

		case 2:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-B-wood.png")));
			letter = "B";
			value = 3;
			alphaValue = 2;
			break;

		case 3:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-C-wood.png")));
			letter = "C";
			value = 3;
			alphaValue = 3;
			break;

		case 4:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-D-wood.png")));
			letter = "D";
			value = 2;
			alphaValue = 4;
			break;

		case 5:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-E-wood.png")));
			letter = "E";
			value = 1;
			alphaValue = 5;
			break;

		case 6:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-F-wood.png")));
			letter = "F";
			value = 4;
			alphaValue = 6;
			break;

		case 7:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-G-wood.png")));
			letter = "G";
			value = 2;
			alphaValue = 7;
			break;

		case 8:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-H-wood.png")));
			letter = "H";
			value = 4;
			alphaValue = 8;
			break;

		case 9:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-I-wood.png")));
			letter = "I";
			value = 1;
			alphaValue = 9;
			break;

		case 10:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-J-wood.png")));
			letter = "J";
			value = 8;
			alphaValue = 10;
			break;

		case 11:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-K-wood.png")));
			letter = "K";
			value = 5;
			alphaValue = 11;
			break;

		case 12:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-L-wood.png")));
			letter = "L";
			value = 1;
			alphaValue = 12;
			break;

		case 13:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-M-wood.png")));
			letter = "M";
			value = 3;
			alphaValue = 13;
			break;

		case 14:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-N-wood.png")));
			letter = "N";
			value = 1;
			alphaValue = 14;
			break;

		case 15:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-O-wood.png")));
			letter = "O";
			value = 1;
			alphaValue = 15;
			break;

		case 16:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-P-wood.png")));
			letter = "P";
			value = 3;
			alphaValue = 16;
			break;

		case 17:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-Q-wood.png")));
			letter = "Q";
			value = 10;
			alphaValue = 17;
			break;

		case 18:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-R-wood.png")));
			letter = "R";
			value = 1;
			alphaValue = 18;
			break;

		case 19:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-S-wood.png")));
			letter = "S";
			value = 1;
			alphaValue = 19;
			break;

		case 20:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-T-wood.png")));
			letter = "T";
			value = 1;
			alphaValue = 20;
			break;

		case 21:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-U-wood.png")));
			letter = "U";
			value = 1;
			alphaValue = 21;
			break;

		case 22:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-V-wood.png")));
			letter = "V";
			value = 4;
			alphaValue = 22;
			break;

		case 23:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-W-wood.png")));
			letter = "W";
			value = 4;
			alphaValue = 23;
			break;

		case 24:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-X-wood.png")));
			letter = "X";
			value = 8;
			alphaValue = 24;
			break;

		case 25:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-Y-wood.png")));
			letter = "Y";
			value = 4;
			alphaValue = 25;
			break;

		case 26:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-Z-wood.png")));
			letter = "Z";
			value = 10;
			alphaValue = 26;
			break;

		case 27:
			icon = new ImageIcon(ImageIO.read(TileImgLoader.load("tile_Pictures/Scrabble-tile-Blank-wood.png")));
			letter = "";
			value = 1;
			alphaValue = 27;
			break;

		default:
			break;

		}

	}

	int getTileValue(String l){
		switch (l){
		case "A":
			value = 1;
			break;
			
		case "B":
			value = 3;
			break;
		
		case "C":
			value = 3;
			break;
			
		case "D":
			value = 2;
			break;
			
		case "E":
			value = 1;
			break;
			
		case "F":
			value = 4;
			break;
			
			
		case "G":
			value = 2;
			break;
			
		case "H":
			value = 4;
			break;
		
		case "I":
			value = 1;
			break;
			
		case "J":
			value = 8;
			break;
			
		case "K":
			value = 5;
			break;
			
		case "L":
			value = 1;
			break;
			
		case "M":
			value = 3;
			break;
			
		case "N":
			value = 1;
			break;
		
		case "O":
			value = 1;
			break;
			
		case "P":
			value = 3;
			break;
			
		case "Q":
			value = 10;
			break;
			
		case "R":
			value = 1;
			break;
			
		case "S":
			value = 1;
			break;
			
		case "T":
			value = 1;
			break;
			
		case "U":
			value = 1;
			break;
			
		case "V":
			value = 4;
			break;
			
		case "W":
			value = 4;
			break;
		
		case "X":
			value = 8;
			break;
			
		case "Y":
			value = 4;
			break;
			
		case "Z":
			value = 10;
			break;
			
		case "":
			value = 1;
			break;
			
		default:
			break;
			
		}
		return value;
}

	
}