package Scrabble;

import java.io.InputStream;

final public class TileImgLoader {

	public static InputStream load(String pathName){
		InputStream inputPicture = TileImgLoader.class.getResourceAsStream(pathName);
		if(inputPicture == null){
			inputPicture = TileImgLoader.class.getResourceAsStream("/"+pathName);
		}
		return inputPicture;
	}
}
