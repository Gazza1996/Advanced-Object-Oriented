package ie.gmit.sw.sprite;

import java.awt.image.BufferedImage;
import java.util.List;

import ie.gmit.sw.player.Position;

/*
 * character builder class
 */
public class SpriteBuilder {

	private Position pos;
	
	private List<BufferedImage> images;
	private boolean engaged;
	private SpriteType type;
	
	private int x;
	private int y;

	public SpriteBuilder() {

	}

	// position
	public SpriteBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	// image
	public SpriteBuilder setImage(List<BufferedImage> images) {
		this.images = images;
		return this;
	}

	public SpriteBuilder setEngaged(boolean e) {
		this.engaged = e;
		return this;
	}

	// sprite type just player
	public SpriteBuilder setType(SpriteType type) {
		this.type = type;
		return this;
	}

	// index
	public SpriteBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	// character build(player)
	public SpriteTile build() {
		if (this.images == null)
			this.images = this.type.getImg();
		this.engaged = this.type.isEngaged();
		return new SpriteTile(pos, x, y, images, engaged, type);
	}

}
