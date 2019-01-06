package ie.gmit.sw.sprite;

import java.awt.image.BufferedImage;

/*
 * this enum is used to identify the type of character created
 * adding more types here will make them available in the game
 * */
import java.util.List;

/*
 * enum for what type of sprite is being used and for when it is in use
 */
public enum SpriteType {

	standard(false);

	private List<BufferedImage> img;
	private boolean isEngaged;

	SpriteType(Boolean e) {
		this.isEngaged = e;
	}

	private SpriteType(List<BufferedImage> img) {
		this.img = img;
	}

	public void setImg(List<BufferedImage> images) {
		this.img = images;
	}

	public List<BufferedImage> getImg() {
		return img;
	}

	public boolean isEngaged() {
		return isEngaged;
	}

	public void setEngaged(boolean isEngaged) {
		this.isEngaged = isEngaged;
	}

}
