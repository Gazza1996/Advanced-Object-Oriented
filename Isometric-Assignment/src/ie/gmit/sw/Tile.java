package ie.gmit.sw;

import java.awt.image.BufferedImage;

import ie.gmit.sw.player.Position;

/*
 * tile class for tiles being used
 */

public class Tile {

	private Position pos;
	private BufferedImage image;
	
	private int x;
	private int y;

	public Tile() {

	}

	// makes a tile
	public Tile(Position p, BufferedImage i, int x, int y) {
		this.pos = p;
		this.image = i;
		this.x = x;
		this.y = y;
	}

	/*
	 * getters
	 * setters
	 */
	public Position getPos() {
		return pos;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
