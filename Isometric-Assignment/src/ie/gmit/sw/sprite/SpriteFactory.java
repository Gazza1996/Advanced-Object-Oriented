package ie.gmit.sw.sprite;

import ie.gmit.sw.Tile;

public class SpriteFactory {

	/*
	 * factory class for character
	 */

	public enum Type {
		player;
	}

	public static Tile create(Type type, int x, int y) {

		switch (type) {
		case player:
			// return a standard type
			return new SpriteBuilder().setType(SpriteType.standard).setIndex(x, y).build();
		default:
			throw new RuntimeException("Error. No object");
		}
	}
}