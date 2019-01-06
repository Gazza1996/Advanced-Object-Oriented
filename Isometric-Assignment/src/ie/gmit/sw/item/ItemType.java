package ie.gmit.sw.item;

import java.awt.image.BufferedImage;

/*
 * enum is used for the item type
 */

public enum ItemType {
	blank(null, false), 
	fountain(null, false), 
	signPost(null, false), 
	chest(null, true), 
	log(null, false),
	tree(null, false), 
	plant(null, false), 
	chair(null, false), 
	cover(null, false), 
	ladder(null, false),
	fire(null, false);

	private BufferedImage image;
	private final boolean canPick;

	private ItemType(BufferedImage image, boolean canPick) {
		this.image = image;
		this.canPick = canPick;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	public boolean canPick() {
		return canPick;
	}

}
