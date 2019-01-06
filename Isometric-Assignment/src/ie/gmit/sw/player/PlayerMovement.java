package ie.gmit.sw.player;

import ie.gmit.sw.GameView;
import ie.gmit.sw.grid.GridView;
import ie.gmit.sw.item.ItemTile;
import ie.gmit.sw.sprite.SpriteTile;

public class PlayerMovement {

	/*
	 * class for the player movement
	 */

	public static void move(Position pos, SpriteTile sprite, GridView grid1, GridView grid2, GameView gameView) {

		int[] index = grid2.getIndex(pos); // index
		ItemTile item = grid2.getItemTile(index[0], index[1]); // check for items by player
		
		/*
		 * whether or not next tile can be moved on???
		 */
		if (!grid1.getGroundTile(index[0], index[1]).isMoving() || item != null) { 
			if (item.canPick()) {
				grid2.getTiles().remove(item);
				if(item.canPick()) {// should collect chest properly
					grid2.getTiles().remove(item);
					
					gameView.setChest(-1);
					/*
					 * works as it should perfectly
					 * could add more chests now in different positions to be collect but must increase chest
					 * variable back in gameview class
					 */
				}
			}
			return;
		}

		sprite.step(); // step
		sprite.setPos(pos); // set position
		sprite.setX(index[0]); // x pos
		sprite.setY(index[1]); // y pos
	}
}
