package ie.gmit.sw.ground;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Tile;
import ie.gmit.sw.player.Position;

public class GroundTile extends Tile {

	private boolean isMoving; // tile can be moved accross
	private GroundType type; // tile type

	public GroundTile() {
		super(); // super class
	}

	public GroundTile(Position p, int x, int y, BufferedImage i, boolean m, GroundType type) {
		// pass to super class
		super(p, i, x, y);
		this.isMoving = m;
		this.type = type;
	}
	public boolean isMoving() {
		return isMoving;
	}
	
	/*
	 * getters
	 * setters
	 */

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public GroundType getType() {
		return type;
	}

	public void setType(GroundType type) {
		this.type = type;
	}

}