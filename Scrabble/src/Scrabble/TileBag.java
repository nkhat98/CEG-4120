package Scrabble;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


public class TileBag extends Tile{
	
	ArrayList<Tile> TileBag = new ArrayList<Tile>();
	
	
	void createTileBag() throws IOException{
		//9 A, I
		for(int i = 0; i < 9; i++){
			Tile tile = new Tile();
			tile.createTile(1);
			TileBag.add(tile);
			Tile tile2 = new Tile();
			tile2.createTile(9);
			TileBag.add(tile2);			
		}
		
		//2 B, C, F, H, M, P, V, W, Y, blank
		for(int i = 0; i < 2; i++){
			Tile tileB = new Tile();
			Tile tileC = new Tile();
			Tile tileF = new Tile();
			Tile tileH = new Tile();
			Tile tileM = new Tile();
			Tile tileP = new Tile();
			Tile tileV = new Tile();
			Tile tileW = new Tile();
			Tile tileY = new Tile();
			Tile tileBlank = new Tile();
			
			tileB.createTile(2);
			TileBag.add(tileB);
			
			tileC.createTile(3);
			TileBag.add(tileC);
			
			tileF.createTile(6);
			TileBag.add(tileF);
			
			tileH.createTile(8);
			TileBag.add(tileH);
			
			tileM.createTile(13);
			TileBag.add(tileM);
			
			tileP.createTile(16);
			TileBag.add(tileP);
			
			tileV.createTile(22);
			TileBag.add(tileV);
			
			tileW.createTile(24);
			TileBag.add(tileW);
			
			tileY.createTile(25);
			TileBag.add(tileY);
			
			tileBlank.createTile(27);
			TileBag.add(tileBlank);
		}
		
		//1 J, K, Q, X, Z
		for(int i = 0; i < 1; i++){
			Tile tileJ = new Tile();
			tileJ.createTile(10);
			TileBag.add(tileJ);
			
			Tile tileK = new Tile();
			tileK.createTile(11);
			TileBag.add(tileK);
			
			Tile tileQ = new Tile();
			tileQ.createTile(17);
			TileBag.add(tileQ);
			
			Tile tileX = new Tile();
			tileX.createTile(24);
			TileBag.add(tileX);
			
			Tile tileZ = new Tile();
			tileZ.createTile(26);
			TileBag.add(tileZ);
		}
		
		//3 G
		for(int i = 0; i < 3; i++){
			Tile tileG = new Tile();
			tileG.createTile(7);
			TileBag.add(tileG);
		}
		
		//8 O
		for(int i = 0; i < 8; i++){
			Tile tileO = new Tile();
			tileO.createTile(15);
			TileBag.add(tileO);
		}
		
		//6 N, R, T
		for(int i = 0; i < 6; i++){
			Tile tileN = new Tile();
			tileN.createTile(14);
			TileBag.add(tileN);
			
			Tile tileR = new Tile();
			tileR.createTile(18);
			TileBag.add(tileR);
			
			Tile tileT = new Tile();
			tileT.createTile(20);
			TileBag.add(tileT);
		}
		
		//12 E
		for(int i = 0; i < 12; i++){
			Tile tileE = new Tile();
			tileE.createTile(5);
			TileBag.add(tileE);
		}
		
		
		//4 D, L, S, U
		for(int i = 0; i < 4; i++){
			Tile tileD = new Tile();
			tileD.createTile(4);
			TileBag.add(tileD);
			
			Tile tileL = new Tile();
			tileL.createTile(12);
			TileBag.add(tileL);
			
			Tile tileS = new Tile();
			tileS.createTile(19);
			TileBag.add(tileS);
			
			Tile tileU = new Tile();
			tileU.createTile(21);
			TileBag.add(tileU);
		}

	}
	
	Tile pop(int index){
		return TileBag.remove(index);
	}
	
	void addTile(int index) throws IOException{
		Tile tile = new Tile();
		tile.createTile(index);
		TileBag.add(tile);
	}
	
	void shuffle(){
		Collections.shuffle(TileBag);
	}
	
	boolean empty(){
		return TileBag.isEmpty();
	}
	
	
}