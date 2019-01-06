package ie.gmit.sw.item;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Tile;
import ie.gmit.sw.player.Position;

/*
 * 
 */
public class ItemTile extends Tile {

	private boolean canPick;
	private ItemType type; // item type

	public ItemTile() {
		super();
	}

	public ItemTile(Position p, int x, int y, BufferedImage i, Boolean cp, ItemType type) {
		// pass these variable to the tile super class
		super(p, i, x, y);
		this.canPick = cp;
		this.type = type;
	}

	// Setters and getters

	public boolean canPick() {
		return canPick;
	}

	public void canPick(boolean canPick) {
		this.canPick = canPick;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

}