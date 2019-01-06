package ie.gmit.sw.ground;

import java.awt.image.BufferedImage;

/*
 * These are the type of ground tiles available
 * when called or loaded, they will store an image for each type so that the images do not need to be loaded multiple times.
 * they also contain the variable to tell if the object can be walked on, this is because tiles like water cannot be walked on
 * adding more types here will make it available in the game
 * */

public enum GroundType {

	grass(null, true), 
	rocks(null, true), 
	weeds(null, true), 
	sand(null, true), 
	water(null, false), 
	beach(null, false),
	gravel(null, true);


	private BufferedImage image; // image
	// if the tile can be walked on
	private final boolean isMoving;

	private GroundType(BufferedImage image, boolean isMoving) {
		this.isMoving = isMoving;
		this.image = image;
	}

	// getters and setters

	public void setImg(BufferedImage image) {
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	public boolean isMoving() {
		return isMoving;
	}

}
