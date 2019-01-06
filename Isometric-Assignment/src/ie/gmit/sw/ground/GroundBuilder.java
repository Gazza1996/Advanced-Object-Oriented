package ie.gmit.sw.ground;

import java.awt.image.BufferedImage;

import ie.gmit.sw.player.Position;

public class GroundBuilder {

	/*
	 * ground tiles builder
	 */
	
	private Position pos;
	private BufferedImage image;
	private boolean isMoving;
	private GroundType type;
	private int x;
	private int y;

	public GroundBuilder() {

	}

	// tile position
	public GroundBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	// tile image
	public GroundBuilder setImage(BufferedImage image) {
		this.image = image;
		return this;
	}
	// player can move accross it
	public GroundBuilder setWalkable(boolean isMoving) {
		this.isMoving = isMoving;
		return this;
	}

	public GroundBuilder setType(GroundType type) {
		this.type = type;
		return this;
	}
	// index
	public GroundBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}
	// build
	public GroundTile build() {
		if (this.image == null)
			this.image = this.type.getImage();
		this.isMoving = this.type.isMoving();
		return new GroundTile(pos, x, y, image, isMoving, type);
	}
}
