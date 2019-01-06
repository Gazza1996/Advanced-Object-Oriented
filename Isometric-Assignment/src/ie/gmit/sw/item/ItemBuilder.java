package ie.gmit.sw.item;

import java.awt.image.BufferedImage;

import ie.gmit.sw.player.Position;

public class ItemBuilder {

	/*
	 * build items
	 */
	private Position pos;
	
	private BufferedImage image;
	private boolean canPick;
	private ItemType type;
	
	private int x;
	private int y;

	public ItemBuilder() {

	}

	// position
	public ItemBuilder setPos(Position pos) {
		this.pos = pos;
		return this;
	}

	public ItemBuilder setPick(boolean canPick) {
		this.canPick = canPick;
		return this;
	}

	// type
	public ItemBuilder setType(ItemType type) {
		this.type = type;
		return this;
	}

	// index
	public ItemBuilder setIndex(int x, int y) {
		this.x = x;
		this.y = y;
		return this;
	}

	// build what can be picked
	public ItemTile build() {

		if (this.image == null)
			this.image = this.type.getImage();
		this.canPick = this.type.canPick();
		return new ItemTile(pos, x, y, image, canPick, type);
	}

}
